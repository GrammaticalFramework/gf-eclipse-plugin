/**
 * GF Eclipse Plugin
 * http://www.grammaticalframework.org/eclipse/
 * John J. Camilleri, 2012
 * 
 * The research leading to these results has received funding from the
 * European Union's Seventh Framework Programme (FP7/2007-2013) under
 * grant agreement no. FP7-ICT-247914.
 */
package org.grammaticalframework.eclipse.ui;

import org.apache.log4j.AppenderSkeleton;
import org.apache.log4j.Layout;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.WriterAppender;
import org.apache.log4j.spi.LoggingEvent;
import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.console.IOConsoleOutputStream;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.outline.actions.IOutlineContribution;
import org.grammaticalframework.eclipse.GFPreferences;
import org.grammaticalframework.eclipse.ui.editor.outline.ExpandAllAction;
import org.grammaticalframework.eclipse.ui.labeling.GFImages;
import org.grammaticalframework.eclipse.ui.perspectives.GFConsole;
import org.grammaticalframework.eclipse.ui.views.GFTreebankManagerView;

import com.google.inject.Binder;
import com.google.inject.name.Names;

/**
 * Use this class to register components to be used within the IDE.
 */
public class GFUiModule extends org.grammaticalframework.eclipse.ui.AbstractGFUiModule {

	/**
	 * The Constant LOG_FILE_NAME.
	 */
	private static final String CONSOLE_LOG_NAME = "gf-console";
	private static final String PLATFORM_LOG_NAME = "eclipse-platform";
	
	/**
	 * The Apache log4j logger
	 */
	public static final Logger log = Logger.getLogger("org.grammaticalframework.eclipse");
	public static void setConsoleLogLevel(Level level) {
		try {
			((WriterAppender)log.getAppender(CONSOLE_LOG_NAME)).setThreshold(level);
		} catch (Exception e) {
			log.warn("Error trying to change log level", e);
		}
	}
	
	private GFConsole consoleManager;
	
	/**
	 * Apache Log4j listener which writes to the Eclipse platform log
	 * @author John J. Camilleri
	 */
	private class EclipsePlatformLogWriter extends AppenderSkeleton {
		private ILog log;
		private String pluginID;
		public EclipsePlatformLogWriter(AbstractUIPlugin plugin) {
			this.log = plugin.getLog();
			this.pluginID = plugin.toString();
		}
		public boolean requiresLayout() {
			return false;
		}
		protected void append(LoggingEvent event) {
			int level = getSeverity(event);
			String message = event.getRenderedMessage();
			Throwable exp = (event.getThrowableInformation()!=null) ? event.getThrowableInformation().getThrowable() : null;
			this.log.log(new Status(level, pluginID, message, exp));
		}
		public void close() {
			// Nothing to close
		}
		/**
		 * Convert log4j LEVEL to Eclipse SEVERITY
		 * Ref: http://www.eclipsezone.com/articles/franey-logging/
		 */
		private int getSeverity(LoggingEvent ev) {
			Level level = ev.getLevel();
			if (level == Level.FATAL || level == Level.ERROR)
				return IStatus.ERROR;
			else if (level == Level.WARN)
				return IStatus.WARNING;
			else if (level == Level.INFO)
				return IStatus.INFO;
			else
				// debug, trace and custom levels
				return IStatus.OK;
		}
	}

	/**
	 * Instantiates a new GF UI module.
	 *
	 * @param plugin the plugin
	 */
	public GFUiModule(AbstractUIPlugin plugin) {
		super(plugin);
		
		// Setup logging and direct to console
		consoleManager = new GFConsole();
		IOConsoleOutputStream consoleStream = consoleManager.getLogOutputStream();
//		Layout layout = new PatternLayout("[%d{yyyy-MM-dd HH:mm:ss,SSS}] %-5p %m%n");
		Layout layout = new PatternLayout("%d{HH:mm:ss} [%-5p] %m%n");
		
		// At the top level, record everyting
		log.setLevel(Level.ALL);
		
		// Write to GF console (level is user-defined)
		WriterAppender appender1 = new WriterAppender(layout, consoleStream);
		appender1.setName(CONSOLE_LOG_NAME);
		Level userLevel = Level.toLevel(GFPreferences.getLogLevel(), Level.INFO);
		appender1.setThreshold(userLevel);
		log.addAppender(appender1);

		// Write to Eclipse platform log (level is hardcoded)
		EclipsePlatformLogWriter appender2 = new EclipsePlatformLogWriter(plugin);
		appender2.setName(PLATFORM_LOG_NAME);
		appender2.setThreshold(Level.ALL); // include everything!
		log.addAppender(appender2);

	}
	
	/**
	 * Bind language root preference page.
	 */
	public Class<? extends org.eclipse.xtext.ui.editor.preferences.LanguageRootPreferencePage> bindLanguageRootPreferencePage() {
		return org.grammaticalframework.eclipse.ui.editor.preferences.GFLanguageRootPreferencePage.class;
	}
	
	/* (non-Javadoc)
	 * @see org.grammaticalframework.eclipse.ui.AbstractGFUiModule#bindIOutlineTreeProvider()
	 */
	@Override
	public Class<? extends org.eclipse.xtext.ui.editor.outline.IOutlineTreeProvider> bindIOutlineTreeProvider() {
		return org.grammaticalframework.eclipse.ui.outline.GFOutlineTreeProvider.class;
	}
//	@Override
//	public Class<? extends org.eclipse.xtext.ui.editor.outline.impl.IOutlineTreeStructureProvider> bindIOutlineTreeStructureProvider() {
//		return org.grammaticalframework.eclipse.ui.outline.GFOutlineTreeProvider.class;
//	}

	
	/**
	 * Bind custom hover implementation
	 */
	public Class<? extends org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider> bindEObjectHoverProvider() {
		return org.grammaticalframework.eclipse.ui.editor.GFEObjectHoverProvider.class;
	}
	
	/**
	 * Bind custom URI opener implementation
	 */
	public Class<? extends org.eclipse.xtext.ui.editor.LanguageSpecificURIEditorOpener> bindLanguageSpecificURIEditorOpener() {
		return org.grammaticalframework.eclipse.ui.editor.GFURIEditorOpener.class;
	}
	
	/**
	 * Bind highlighting configuration.
	 */
	public Class<? extends org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration> bindIHighlightingConfiguration() {
		return org.grammaticalframework.eclipse.ui.editor.syntaxcoloring.GFHighlightingConfiguration.class;
	}
	
	/**
	 * Bind abstract antlr token to attribute id mapper.
	 */
	public Class<? extends org.eclipse.xtext.ui.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper> bindAbstractAntlrTokenToAttributeIdMapper() {
		return org.grammaticalframework.eclipse.ui.editor.syntaxcoloring.GFAntlrTokenToAttributeIdMapper.class;
	}
	
	/**
	 * Remove the prompt for Xtext nature
	 */
	@Override
	public Class<? extends org.eclipse.xtext.ui.editor.IXtextEditorCallback> bindIXtextEditorCallback() {
		return org.grammaticalframework.eclipse.ui.editor.GFEditorCallback.class;
	}
	
	/**
	 * This has 2 functions:
	 * 		Remove the prompt for Xtext nature (Refer: http://www.eclipse.org/forums/index.php/mv/msg/173440/552043/#msg_552043)
	 * 		Disabling validation when openind a linked external resource
	 * 
	 * 	BUT It introduces a lot of problems when using external files! Therefore I have resolved to solution above. 
	 */
//	@Override
//	public Class<? extends org.eclipse.xtext.ui.editor.IXtextEditorCallback> bindIXtextEditorCallback() {
//		return org.grammaticalframework.eclipse.ui.editor.validation.GFValidatingEditorCallback.class;
////		return org.eclipse.xtext.ui.editor.validation.ValidatingEditorCallback.class;
//	}
	
	/**
	 * Expand all action for outline view
	 * @param binder
	 */
	public void configureExpandAction(Binder binder) {
		binder
			.bind(IOutlineContribution.class)
			.annotatedWith(Names.named("expandOutline"))
			.to(ExpandAllAction.class);
	}
	
	/**
	 * 
	 * @param binder
	 */
	public void configureGFImageHelper(Binder binder) {
		binder
			.bind(GFImages.class);
	}
}
