/**
 * GF Eclipse Plugin
 * http://www.grammaticalframework.org/eclipse/
 * John J. Camilleri, 2012
 * 
 * The research leading to these results has received funding from the
 * European Union's Seventh Framework Programme (FP7/2007-2013) under
 * grant agreement no. FP7-ICT-247914.
 */
package org.grammaticalframework.eclipse.ui.wizards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.fieldassist.IContentProposal;
import org.eclipse.jface.fieldassist.SimpleContentProposalProvider;
import org.eclipse.jface.fieldassist.TextContentAdapter;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;
import org.grammaticalframework.eclipse.builder.GFBuilder;
import org.grammaticalframework.eclipse.treebank.GFTreebankHelper;
import org.grammaticalframework.eclipse.ui.natures.GFProjectNature;

import com.google.common.base.Predicate;

public class GFWizardHelper {

	/**
	 * Logger
	 */
	private static final Logger log = Logger.getLogger(GFWizardHelper.class);

	/**
	 * Filter which only accepts files with the .gf extension
	 */
	private static Predicate<IFile> gfFileFilter = new Predicate<IFile>() {
		public boolean apply(IFile input) {
			String ext = input.getFileExtension();
			return (ext != null && ext.equalsIgnoreCase("gf"));
		}
	}; 
	
	/**
	 * Recursively find all files in the workspace, in a flat list to be used as suggestions.
	 *
	 * @return the file list
	 */
	public static List<IFile> getFileList(boolean includeExternal) {
		List<IFile> suggestions = traverseFileList(gfFileFilter, includeExternal);
		return suggestions;
	}
	
	/**
	 * Recursively find all treebank files in the workspace
	 * 
	 * @param filter
	 * @return the file list
	 */
	public static List<IFile> getTreebankFileList() {
		Predicate<IFile> treebankFileFilter = new Predicate<IFile>() {
			public boolean apply(IFile input) {
				return GFTreebankHelper.isTreebankFile(input);
			}
		};
		return traverseFileList(treebankFileFilter, false);
	}
	
	/**
	 * Recursively find all modules in the workspace, in a flat list to be used as suggestions.
	 * <em>This is the same as getFileList, except that file exentions are removed.</em>
	 *
	 * @return module list
	 */
	public static String[] getModuleList(boolean includeExternal) {
		List<IFile> files = traverseFileList(gfFileFilter, includeExternal);
		List<String> suggestions = new ArrayList<String>(files.size());
		for (IFile resource : files) {
			suggestions.add( resource.getName().substring(0, resource.getName().length()-3) ); // we can safely assume they have a .gf
		}
		return suggestions.toArray(new String[]{});
	}
	
	/**
	 * Traverse workspace recursively, for suggestions. Only considers OPEN projects with the GF nature
	 *
	 * @param resource the resource
	 * @param suggestions the suggestions
	 */
	private static List<IFile> traverseFileList(Predicate<IFile> filter, boolean includeExternal) {
		ArrayList<IFile> suggestions = new ArrayList<IFile>();
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		try {
			traverseFileList(root, suggestions, filter, includeExternal);
		} catch (CoreException e) {
			log.warn("Error recursive through workspace", e);
		}
		return suggestions;
	}
	private static void traverseFileList(IResource resource, List<IFile> suggestions, Predicate<IFile> filter, boolean includeExternal) throws CoreException {
		
		// Avoid closed projects, and projects without the GF nature
		if (resource instanceof IProject) {
			IProject project = (IProject)resource;
			if (!project.isOpen() || project.getNature(GFProjectNature.NATURE_ID) == null)
				return;
		}
		// Add a file if it passes the filter
		if (resource instanceof IFile) {
			IFile file = (IFile)resource;
			if (filter.apply(file)) {
				suggestions.add(file);
			}
		}
		// Recursve into containers
		else if (resource instanceof IContainer) {
			if (!includeExternal && ((IContainer)resource).getName().equals(GFBuilder.EXTERNAL_FOLDER)) {
				return;
			}
			try {
				for (IResource member : ((IContainer)resource).members()) {
					traverseFileList(member, suggestions, filter, includeExternal);
				}
			} catch (CoreException e) {
				// No problem
			}
		}
	}
	
	public static class GFModuleContentProposalProvider extends SimpleContentProposalProvider {
		public GFModuleContentProposalProvider(String[] proposals) {
			super(proposals);
			this.setFiltering(true);
		}
		@Override
		public IContentProposal[] getProposals(String contents, int position) {
			// Only consider AFTER the last comma (but before cursor), then delegate to parent
			contents = contents.substring(0, position);
			int ix = contents.lastIndexOf(',');
			if (ix > -1) {
				contents = contents.substring(ix+1).trim();
			}
			return super.getProposals(contents, position);
		}
	}
	
	public static class GFModuleContentAdapter extends TextContentAdapter {
		@Override
		public Point getSelection(Control control) {
			//Always select from caret position to left-closest comma or space character
			// e.g. for "Kittens, Pupp|ies" we want to return "Pupp"
			int pos = ((Text) control).getCaretPosition();
			String contents = ((Text) control).getText(0, pos);
			int ix = Math.max(contents.lastIndexOf(','), contents.lastIndexOf(' '));
			return (ix < 0) ? new Point(0, pos) : new Point(ix+1, pos);
		}
	}
	
	public static String[][] ISOLanguageCodes = new String[][]{
		{"Abkhazian", "abk"},
		{"Achinese", "ace"},
		{"Acoli", "ach"},
		{"Adangme", "ada"},
		{"Afar", "aar"},
		{"Afrihili", "afh"},
		{"Afrikaans", "afr"},
		{"Afro-Asiatic (Other)", "afa"},
		{"Akan", "aka"},
		{"Akkadian", "akk"},
		{"Albanian", "alb", "sqi"},
		{"Aleut", "ale"},
		{"Algonquian languages", "alg"},
		{"Altaic (Other)", "tut"},
		{"Amharic", "amh"},
		{"Apache languages", "apa"},
		{"Arabic", "ara"},
		{"Aramaic", "arc"},
		{"Arapaho", "arp"},
		{"Araucanian", "arn"},
		{"Arawak", "arw"},
		{"Armenian", "arm", "hye"},
		{"Artificial (Other)", "art"},
		{"Assamese", "asm"},
		{"Athapascan languages", "ath"},
		{"Austronesian (Other)", "map"},
		{"Avaric", "ava"},
		{"Avestan", "ave"},
		{"Awadhi", "awa"},
		{"Aymara", "aym"},
		{"Azerbaijani", "aze"},
		{"Aztec", "nah"},
		{"Balinese", "ban"},
		{"Baltic (Other)", "bat"},
		{"Baluchi", "bal"},
		{"Bambara", "bam"},
		{"Bamileke languages", "bai"},
		{"Banda", "bad"},
		{"Bantu (Other)", "bnt"},
		{"Basa", "bas"},
		{"Bashkir", "bak"},
		{"Basque", "baq", "eus"},
		{"Beja", "bej"},
		{"Bemba", "bem"},
		{"Bengali", "ben"},
		{"Berber (Other)", "ber"},
		{"Bhojpuri", "bho"},
		{"Bihari", "bih"},
		{"Bikol", "bik"},
		{"Bini", "bin"},
		{"Bislama", "bis"},
		{"Braj", "bra"},
		{"Breton", "bre"},
		{"Buginese", "bug"},
		{"Bulgarian", "bul"},
		{"Buriat", "bua"},
		{"Burmese", "bur", "mya"},
		{"Byelorussian", "bel"},
		{"Caddo", "cad"},
		{"Carib", "car"},
		{"Catalan", "cat"},
		{"Caucasian (Other)", "cau"},
		{"Cebuano", "ceb"},
		{"Celtic (Other)", "cel"},
		{"Central American Indian (Other)", "cai"},
		{"Chagatai", "chg"},
		{"Chamorro", "cha"},
		{"Chechen", "che"},
		{"Cherokee", "chr"},
		{"Cheyenne", "chy"},
		{"Chibcha", "chb"},
		{"Chinese", "chi", "zho"},
		{"Chinook jargon", "chn"},
		{"Choctaw", "cho"},
		{"Church Slavic", "chu"},
		{"Chuvash", "chv"},
		{"Coptic", "cop"},
		{"Cornish", "cor"},
		{"Corsican", "cos"},
		{"Cree", "cre"},
		{"Creek", "mus"},
		{"Creoles and Pidgins (Other)", "crp"},
		{"Creoles and Pidgins, English-based (Other)", "cpe"},
		{"Creoles and Pidgins, French-based (Other)", "cpf"},
		{"Creoles and Pidgins, Portuguese-based (Other)", "cpp"},
		{"Cushitic (Other)", "cus"},
//		         hr    Croatian
		{"Czech", "ces", "cze"},
		{"Dakota", "dak"},
		{"Danish", "dan"},
		{"Delaware", "del"},
		{"Dinka", "din"},
		{"Divehi", "div"},
		{"Dogri", "doi"},
		{"Dravidian (Other)", "dra"},
		{"Duala", "dua"},
		{"Dutch", "dut", "nla"},
		{"Dutch, Middle (ca. 1050-1350)", "dum"},
		{"Dyula", "dyu"},
		{"Dzongkha", "dzo"},
		{"Efik", "efi"},
		{"Egyptian (Ancient)", "egy"},
		{"Ekajuk", "eka"},
		{"Elamite", "elx"},
		{"English", "eng"},
		{"English, Middle (ca. 1100-1500)", "enm"},
		{"English, Old (ca. 450-1100)", "ang"},
		{"Eskimo (Other)", "esk"},
		{"Esperanto", "epo"},
		{"Estonian", "est"},
		{"Ewe", "ewe"},
		{"Ewondo", "ewo"},
		{"Fang", "fan"},
		{"Fanti", "fat"},
		{"Faroese", "fao"},
		{"Fijian", "fij"},
		{"Finnish", "fin"},
		{"Finno-Ugrian (Other)", "fiu"},
		{"Fon", "fon"},
		{"French", "fra", "fre"},
		{"French, Middle (ca. 1400-1600)", "frm"},
		{"French, Old (842- ca. 1400)", "fro"},
		{"Frisian", "fry"},
		{"Fulah", "ful"},
		{"Ga", "gaa"},
		{"Gaelic (Scots)", "gae", "gdh"},
		{"Gallegan", "glg"},
		{"Ganda", "lug"},
		{"Gayo", "gay"},
		{"Geez", "gez"},
		{"Georgian", "geo", "kat"},
		{"German", "deu", "ger"},
		{"German, Middle High (ca. 1050-1500)", "gmh"},
		{"German, Old High (ca. 750-1050)", "goh"},
		{"Germanic (Other)", "gem"},
		{"Gilbertese", "gil"},
		{"Gondi", "gon"},
		{"Gothic", "got"},
		{"Grebo", "grb"},
		{"Greek, Ancient (to 1453)", "grc"},
		{"Greek, Modern (1453-)", "ell", "gre"},
		{"Greenlandic", "kal"},
		{"Guarani", "grn"},
		{"Gujarati", "guj"},
		{"Haida", "hai"},
		{"Hausa", "hau"},
		{"Hawaiian", "haw"},
		{"Hebrew", "heb"},
		{"Herero", "her"},
		{"Hiligaynon", "hil"},
		{"Himachali", "him"},
		{"Hindi", "hin"},
		{"Hiri Motu", "hmo"},
		{"Hungarian", "hun"},
		{"Hupa", "hup"},
		{"Iban", "iba"},
		{"Icelandic", "ice", "isl"},
		{"Igbo", "ibo"},
		{"Ijo", "ijo"},
		{"Iloko", "ilo"},
		{"Indic (Other)", "inc"},
		{"Indo-European (Other)", "ine"},
		{"Indonesian", "ind"},
		{"Interlingua (International Auxiliary language Association)", "ina"},
		{"Interlingue", "ine"},
		{"Inuktitut", "iku"},
		{"Inupiak", "ipk"},
		{"Iranian (Other)", "ira"},
		{"Irish", "gai", "iri"},
		{"Irish, Old (to 900)", "sga"},
		{"Irish, Middle (900 - 1200)", "mga"},
		{"Iroquoian languages", "iro"},
		{"Italian", "ita"},
		{"Japanese", "jpn"},
		{"Javanese", "jav", "jaw"},
		{"Judeo-Arabic", "jrb"},
		{"Judeo-Persian", "jpr"},
		{"Kabyle", "kab"},
		{"Kachin", "kac"},
		{"Kamba", "kam"},
		{"Kannada", "kan"},
		{"Kanuri", "kau"},
		{"Kara-Kalpak", "kaa"},
		{"Karen", "kar"},
		{"Kashmiri", "kas"},
		{"Kawi", "kaw"},
		{"Kazakh", "kaz"},
		{"Khasi", "kha"},
		{"Khmer", "khm"},
		{"Khoisan (Other)", "khi"},
		{"Khotanese", "kho"},
		{"Kikuyu", "kik"},
		{"Kinyarwanda", "kin"},
		{"Kirghiz", "kir"},
		{"Komi", "kom"},
		{"Kongo", "kon"},
		{"Konkani", "kok"},
		{"Korean", "kor"},
		{"Kpelle", "kpe"},
		{"Kru", "kro"},
		{"Kuanyama", "kua"},
		{"Kumyk", "kum"},
		{"Kurdish", "kur"},
		{"Kurukh", "kru"},
		{"Kusaie", "kus"},
		{"Kutenai", "kut"},
		{"Ladino", "lad"},
		{"Lahnda", "lah"},
		{"Lamba", "lam"},
		{"Langue d'Oc (post 1500)", "oci"},
		{"Lao", "lao"},
		{"Latin", "lat"},
		{"Latvian", "lav"},
		{"Letzeburgesch", "ltz"},
		{"Lezghian", "lez"},
		{"Lingala", "lin"},
		{"Lithuanian", "lit"},
		{"Lozi", "loz"},
		{"Luba-Katanga", "lub"},
		{"Luiseno", "lui"},
		{"Lunda", "lun"},
		{"Luo (Kenya and Tanzania)", "luo"},
		{"Macedonian", "mac", "mak"},
		{"Madurese", "mad"},
		{"Magahi", "mag"},
		{"Maithili", "mai"},
		{"Makasar", "mak"},
		{"Malagasy", "mlg"},
		{"Malay", "may", "msa"},
		{"Malayalam", "mal"},
		{"Maltese", "mlt"},
		{"Mandingo", "man"},
		{"Manipuri", "mni"},
		{"Manobo languages", "mno"},
		{"Manx", "max"},
		{"Maori", "mao", "mri"},
		{"Marathi", "mar"},
		{"Mari", "chm"},
		{"Marshall", "mah"},
		{"Marwari", "mwr"},
		{"Masai", "mas"},
		{"Mayan languages", "myn"},
		{"Mende", "men"},
		{"Micmac", "mic"},
		{"Minangkabau", "min"},
		{"Miscellaneous (Other)", "mis"},
		{"Mohawk", "moh"},
		{"Moldavian", "mol"},
		{"Mon-Kmer (Other)", "mkh"},
		{"Mongo", "lol"},
		{"Mongolian", "mon"},
		{"Mossi", "mos"},
		{"Multiple languages", "mul"},
		{"Munda languages", "mun"},
		{"Nauru", "nau"},
		{"Navajo", "nav"},
		{"Ndebele, North", "nde"},
		{"Ndebele, South", "nbl"},
		{"Ndongo", "ndo"},
		{"Nepali", "nep"},
		{"Newari", "new"},
		{"Niger-Kordofanian (Other)", "nic"},
		{"Nilo-Saharan (Other)", "ssa"},
		{"Niuean", "niu"},
		{"Norse, Old", "non"},
		{"North American Indian (Other)", "nai"},
		{"Norwegian", "nor"},
		{"Norwegian (Nynorsk)", "nno"},
		{"Nubian languages", "nub"},
		{"Nyamwezi", "nym"},
		{"Nyanja", "nya"},
		{"Nyankole", "nyn"},
		{"Nyoro", "nyo"},
		{"Nzima", "nzi"},
		{"Ojibwa", "oji"},
		{"Oriya", "ori"},
		{"Oromo", "orm"},
		{"Osage", "osa"},
		{"Ossetic", "oss"},
		{"Otomian languages", "oto"},
		{"Pahlavi", "pal"},
		{"Palauan", "pau"},
		{"Pali", "pli"},
		{"Pampanga", "pam"},
		{"Pangasinan", "pag"},
		{"Panjabi", "pan"},
		{"Papiamento", "pap"},
		{"Papuan-Australian (Other)", "paa"},
		{"Persian", "fas", "per"},
		{"Persian, Old (ca 600 - 400 B.C.)", "peo"},
		{"Phoenician", "phn"},
		{"Polish", "pol"},
		{"Ponape", "pon"},
		{"Portuguese", "por"},
		{"Prakrit languages", "pra"},
		{"Provencal, Old (to 1500)", "pro"},
		{"Pushto", "pus"},
		{"Quechua", "que"},
		{"Rhaeto-Romance", "roh"},
		{"Rajasthani", "raj"},
		{"Rarotongan", "rar"},
		{"Romance (Other)", "roa"},
		{"Romanian", "ron", "rum"},
		{"Romany", "rom"},
		{"Rundi", "run"},
		{"Russian", "rus"},
		{"Salishan languages", "sal"},
		{"Samaritan Aramaic", "sam"},
		{"Sami languages", "smi"},
		{"Samoan", "smo"},
		{"Sandawe", "sad"},
		{"Sango", "sag"},
		{"Sanskrit", "san"},
		{"Sardinian", "srd"},
		{"Scots", "sco"},
		{"Selkup", "sel"},
		{"Semitic (Other)", "sem"},
//		         sr    Serbian
		{"Serbo-Croatian", "scr"},
		{"Serer", "srr"},
		{"Shan", "shn"},
		{"Shona", "sna"},
		{"Sidamo", "sid"},
		{"Siksika", "bla"},
		{"Sindhi", "snd"},
		{"Singhalese", "sin"},
		{"Sino-Tibetan (Other)", "sit"},
		{"Siouan languages", "sio"},
		{"Slavic (Other)", "sla"},
		{"Siswant", "ssw"},
		{"Slovak", "slk", "slo"},
		{"Slovenian", "slv"},
		{"Sogdian", "sog"},
		{"Somali", "som"},
		{"Songhai", "son"},
		{"Sorbian languages", "wen"},
		{"Sotho, Northern", "nso"},
		{"Sotho, Southern", "sot"},
		{"South American Indian (Other)", "sai"},
		{"Spanish", "esl", "spa"},
		{"Sukuma", "suk"},
		{"Sumerian", "sux"},
		{"Sudanese", "sun"},
		{"Susu", "sus"},
		{"Swahili", "swa"},
		{"Swazi", "ssw"},
		{"Swedish", "sve", "swe"},
		{"Syriac", "syr"},
		{"Tagalog", "tgl"},
		{"Tahitian", "tah"},
		{"Tajik", "tgk"},
		{"Tamashek", "tmh"},
		{"Tamil", "tam"},
		{"Tatar", "tat"},
		{"Telugu", "tel"},
		{"Tereno", "ter"},
		{"Thai", "tha"},
		{"Tibetan", "bod", "tib"},
		{"Tigre", "tig"},
		{"Tigrinya", "tir"},
		{"Timne", "tem"},
		{"Tivi", "tiv"},
		{"Tlingit", "tli"},
		{"Tonga (Nyasa)", "tog"},
		{"Tonga (Tonga Islands)", "ton"},
		{"Truk", "tru"},
		{"Tsimshian", "tsi"},
		{"Tsonga", "tso"},
		{"Tswana", "tsn"},
		{"Tumbuka", "tum"},
		{"Turkish", "tur"},
		{"Turkish, Ottoman (1500 - 1928)", "ota"},
		{"Turkmen", "tuk"},
		{"Tuvinian", "tyv"},
		{"Twi", "twi"},
		{"Ugaritic", "uga"},
		{"Uighur", "uig"},
		{"Ukrainian", "ukr"},
		{"Umbundu", "umb"},
		{"Undetermined", "und"},
		{"Urdu", "urd"},
		{"Uzbek", "uzb"},
		{"Vai", "vai"},
		{"Venda", "ven"},
		{"Vietnamese", "vie"},
		{"Volapük", "vol"},
		{"Votic", "vot"},
		{"Wakashan languages", "wak"},
		{"Walamo", "wal"},
		{"Waray", "war"},
		{"Washo", "was"},
		{"Welsh", "cym", "wel"},
		{"Wolof", "wol"},
		{"Xhosa", "xho"},
		{"Yakut", "sah"},
		{"Yao", "yao"},
		{"Yap", "yap"},
		{"Yiddish", "yid"},
		{"Yoruba", "yor"},
		{"Zapotec", "zap"},
		{"Zenaga", "zen"},
		{"Zhuang", "zha"},
		{"Zulu", "zul"},
		{"Zuni", "zun"},
	};
	
	public static Map<String, String[]> getISOLanguageCodes() {
		HashMap<String, String[]> map = new HashMap<String, String[]>();
		for (String[] i : ISOLanguageCodes) {
			map.put(i[0], Arrays.copyOfRange(i, 1, i.length));
		}
		return map;
	}
		
}
