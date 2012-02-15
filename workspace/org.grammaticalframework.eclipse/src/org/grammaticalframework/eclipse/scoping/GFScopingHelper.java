package org.grammaticalframework.eclipse.scoping;

import org.eclipse.emf.ecore.EObject;
import org.grammaticalframework.eclipse.gF.SourceModule;
import org.grammaticalframework.eclipse.gF.TopDef;

public class GFScopingHelper {
	
	/**
	 * Climb the EMF tree and return the EObject's SourceModule object
	 * @param eObj
	 * @return SourceModule or null
	 */
	public static SourceModule getSourceModule(EObject eObj) {
		EObject temp = eObj;
		try {
			while (!(temp  instanceof SourceModule)) {
				temp = temp.eContainer();
			}
			return ((SourceModule)temp);
		}
		catch (NullPointerException _) {
			return null;
		}
	}

	/**
	 * Climb the EMF tree and return the EObject's TopDef object
	 * @param eObj
	 * @return TopDef or null
	 */
	public static TopDef getTopDef(EObject eObj) {
		EObject temp = eObj;
		try {
			while (!(temp  instanceof TopDef)) {
				temp = temp.eContainer();
			}
			return ((TopDef)temp);
		}
		catch (NullPointerException _) {
			return null;
		}
	}
}
