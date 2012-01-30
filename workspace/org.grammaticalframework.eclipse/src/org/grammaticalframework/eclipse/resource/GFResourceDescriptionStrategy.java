/**
 * GF Eclipse Plugin
 * http://www.grammaticalframework.org/eclipse/
 * John J. Camilleri, 2012
 * 
 * The research leading to these results has received funding from the
 * European Union's Seventh Framework Programme (FP7/2007-2013) under
 * grant agreement no. FP7-ICT-247914.
 */
package org.grammaticalframework.eclipse.resource;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy;
import org.eclipse.xtext.util.IAcceptor;
import com.google.inject.Inject;

// TODO: Auto-generated Javadoc
/**
 * Custom resource description strategy, which hanldes:
 * - Creating multiple resources when definitions use ListName/ListIdent.
 *
 * @author John J. Camilleri
 */
public class GFResourceDescriptionStrategy extends
		DefaultResourceDescriptionStrategy {
	
	/**
	 * The Constant log.
	 */
	private final static Logger log = Logger.getLogger(GFResourceDescriptionStrategy.class);

	/**
	 * The converter.
	 */
	@Inject
	private IQualifiedNameConverter converter = new IQualifiedNameConverter.DefaultImpl();
	
	/**
	 * Gets the converter.
	 *
	 * @return the converter
	 */
	protected IQualifiedNameConverter getConverter() {
		return converter;
	}
	
	
	/**
	 * For reflectively handling easy cases, rather than having lots of stupid if statements.
	 *
	 * @param eObj the e obj
	 * @param acceptor the acceptor
	 * @return true, if successful
	 */
/*
	private PolymorphicDispatcher<Boolean> handleTLD = new PolymorphicDispatcher<Boolean>("handleTLD",2,2,Collections.singletonList(this), PolymorphicDispatcher.NullErrorHandler.<Boolean>get())
	{
		@Override
		protected Boolean handleNoSuchMethod(Object... params) { 
			return false;
		}
	};
	
	private boolean justLookUpNameAndAccept(EObject eObj, IAcceptor<IEObjectDescription> acceptor) {
		QualifiedName qualifiedName = getQualifiedNameProvider().getFullyQualifiedName(eObj);
		if (qualifiedName != null) {
			acceptor.accept(EObjectDescription.create(qualifiedName, eObj));
		}
		return true;
	}
	
	public boolean handleTLD(CatDef eObj, IAcceptor<IEObjectDescription> acceptor) {
		return justLookUpNameAndAccept(eObj, acceptor);
	}
	public boolean handleTLD(FunDef eObj, IAcceptor<IEObjectDescription> acceptor) {
		String modName = getModuleName(eObj);
		for (Ident ident : eObj.getName()) {
			QualifiedName qualifiedName = getConverter().toQualifiedName(modName + "." + ident.getName().getValue());
			if (qualifiedName != null) {
				acceptor.accept(EObjectDescription.create(qualifiedName, eObj));
			}
		}
		return true;
	}
	public boolean handleTLD(Def eObj, IAcceptor<IEObjectDescription> acceptor) {
		String modName = getModuleName(eObj);
		for (Name name : eObj.getName()) {
			QualifiedName qualifiedName = getConverter().toQualifiedName(modName + "." + name.getName().getValue());
			if (qualifiedName != null) {
				acceptor.accept(EObjectDescription.create(qualifiedName, eObj));
			}
		}
		return true;
	}
	public boolean handleTLD(DataDef eObj, IAcceptor<IEObjectDescription> acceptor) {
		return justLookUpNameAndAccept(eObj, acceptor);
	}
	public boolean handleTLD(ParDef eObj, IAcceptor<IEObjectDescription> acceptor) {
		return justLookUpNameAndAccept(eObj, acceptor);
	}
	public boolean handleTLD(PrintDef eObj, IAcceptor<IEObjectDescription> acceptor) {
		return justLookUpNameAndAccept(eObj, acceptor);
	}
	public boolean handleTLD(FlagDef eObj, IAcceptor<IEObjectDescription> acceptor) {
		return justLookUpNameAndAccept(eObj, acceptor);
	}
*/

	/**
	 * Get the module name of an EObject by climbing up the eContainer tree
	 * 
	 * @param eObj
	 * @return String module name or null
	 */
/*
	private String getModuleName(EObject eObj) {
		//Climb tree until we find ModDef, then grab the module name
		EObject temp = eObj;
		while (!temp instanceof ModDef) && temp.eContainer() != null) {
			temp = temp.eContainer();
		}
		String qualifiedName = (temp instanceof ModDef)
			? ((ModDef)temp).getType().getName().getValue()
			: null;
		return qualifiedName;
	}
*/
	
	@Override
	public boolean createEObjectDescriptions(EObject eObj, IAcceptor<IEObjectDescription> acceptor) {
		if (getQualifiedNameProvider() == null)
			return false;
		try {
			QualifiedName qualifiedName = getQualifiedNameProvider().getFullyQualifiedName(eObj);
			if (qualifiedName != null) {
				acceptor.accept(EObjectDescription.create(qualifiedName, eObj));
			}

//			// Strategy: export any (and only) Top-Level definitions
//			if (eObj instanceof TopDef) {
//				// Handle everything reflectively
//				for (EObject tld : ((TopDef)eObj).getDefinitions()) {
//					handleTLD.invoke(tld, acceptor);
//				}
//			}			
		} catch (Exception exc) {
			log.error(exc.getMessage());
		}
		return true;
	}	

}
