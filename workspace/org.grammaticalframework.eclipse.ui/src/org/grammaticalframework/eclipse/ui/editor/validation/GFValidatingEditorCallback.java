/**
 * GF Eclipse Plugin
 * http://www.grammaticalframework.org/eclipse/
 * John J. Camilleri, 2011
 * 
 * The research leading to these results has received funding from the
 * European Union's Seventh Framework Programme (FP7/2007-2013) under
 * grant agreement n° FP7-ICT-247914.
 */
package org.grammaticalframework.eclipse.ui.editor.validation;

import org.eclipse.xtext.ui.editor.AbstractDirtyStateAwareEditorCallback;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.validation.MarkerCreator;
import org.eclipse.xtext.ui.editor.validation.MarkerIssueProcessor;
import org.eclipse.xtext.ui.editor.validation.ValidationJob;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.grammaticalframework.eclipse.builder.GFLibraryHelper;

import com.google.inject.Inject;

/**
 * This class exists to prevent validation on an exernal linked resource
 * when opening a linked resource.
 * 
 * THIS IS NOT CURENTLY IN USE!
 * 
 * 
 * @author John J. Camilleri
 *
 */
//public class GFValidatingEditorCallback extends ValidatingEditorCallback {
//
//	@Override
//	public void afterCreatePartControl(XtextEditor editor) {
//		if (!GFLibraryHelper.isLinkedResource(editor.getResource())) {
//			super.afterCreatePartControl(editor);
//		}
//	}
//}

public class GFValidatingEditorCallback extends AbstractDirtyStateAwareEditorCallback {
	@Inject
	private IResourceValidator resourceValidator;
	
	@Inject 
	private MarkerCreator markerCreator;

	@Override
	public void afterCreatePartControl(XtextEditor editor) {
		super.afterCreatePartControl(editor);
		if (shouldPerformValidation(editor)) {
			ValidationJob validationJob = newValidationJob(editor);
			validationJob.schedule();
		}
	}

	@Override
	public void afterSave(XtextEditor editor) {
		super.afterSave(editor);
		if (shouldPerformValidation(editor)) {
			ValidationJob validationJob = newValidationJob(editor);
			validationJob.schedule();
		}
	}
	
	private boolean shouldPerformValidation(XtextEditor editor) {
		return !GFLibraryHelper.isLinkedResource(editor.getResource()) && editor.isEditable();
	}

	private ValidationJob newValidationJob(XtextEditor editor) {
		MarkerIssueProcessor markerIssueProcessor = new MarkerIssueProcessor(editor.getResource(),markerCreator);
		ValidationJob validationJob = new ValidationJob(resourceValidator, editor.getDocument(), markerIssueProcessor, CheckMode.NORMAL_AND_FAST);
		return validationJob;
	}
}