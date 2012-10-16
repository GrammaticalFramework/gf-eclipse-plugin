# Testing of Ontology Grammar Wizard
John J. Camilleri
20 Aug 2012

## Documentation

The template file format needs some sort of proper specification.
The example available at `resources/template.xml` is OK, but it needs some instructions to accompany it.

## Testing various SPARQL EndPoint URLs

So far I have not been able to get the SPARQL endpoint running locally on my machine.
So, I have tested the plugin with publicly available endpoints found here: <http://labs.mondeca.com/sparqlEndpointsStatus/>.
I selected various endpoint URLs at random and tested them with the Ontology Grammar Wizard. The results are below.

### (Default)
http://localhost:8080/repositories/molto-repository
(no local server running): Connection refused

### BBC Music
http://api.talis.com/stores/bbc-backstage/services/sparql
Remote service returned an error

### British National Bibliography (BNB) - Linked Open Data
http://bnb.data.bl.uk/sparql
Remote service returned an error

### CTIC Public Dataset Catalogs
http://data.fundacionctic.org/sparql
37000 Error SP030: SPARQL compiler, line 1: syntax error at 'group_concat' before '('

### DPpedia in German
http://de.dbpedia.org/sparql
Virtuoso 37000 Error SP030: SPARQL compiler, line 1: syntax error at 'group_concat' before '('

### EEA Reporting Obligations Database
http://cr.eionet.europa.eu/sparql
[Fatal Error] :1:1: Premature end of file.

### European Employment Services (EURES)
http://www4.wiwiss.fu-berlin.de/eures/sparql
Error returned as HTML document: 

    376377 [main] WARN  org.openrdf.http.client.HTTPClient  - Server reports problem: <html>
    <head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
    <title>Error 400 Parse error: 
    PREFIX ptop: &lt;http://proton.semanticweb.org/protontop#&gt;PREFIX owl: &lt;http://www.w3.org/2002/07/owl#&gt;PREFIX rdf: &lt;http://www.w3.org/2000/01/rdf-schema#&gt;SELECT ?class (group_concat(?class_label;separator = ' ; ') as ?cnc){ ?class a owl:Class . ?class rdf:label ?class_label . FILTER (!isBlank(?class)) .} group by ?class

    Encountered " "group" "group "" at line 1, column 166.
    Was expecting one of:
        &lt;IRIref&gt; ...
        &lt;PNAME_NS&gt; ...
        &lt;PNAME_LN&gt; ...

### IEEE Papers (RKBExplorer)
http://ieee.rkbexplorer.com/sparql/
Exception while connecting:

    !SESSION 2012-08-20 09:15:58.974 -----------------------------------------------
    eclipse.buildId=M20110909-1335
    java.version=1.6.0_24
    java.vendor=Sun Microsystems Inc.
    BootLoader constants: OS=linux, ARCH=x86, WS=gtk, NL=en_GB
    Framework arguments:  -product org.eclipse.sdk.ide
    Command-line arguments:  -product org.eclipse.sdk.ide -data /home/john/repositories/gf-eclipse-plugin/workspace/../workspace-demo -dev file:/home/john/repositories/gf-eclipse-plugin/workspace/.metadata/.plugins/org.eclipse.pde.core/Eclipse Application/dev.properties -os linux -ws gtk -arch x86 -consoleLog

    !ENTRY org.eclipse.ui 4 0 2012-08-20 09:27:49.504
    !MESSAGE Unhandled event loop exception
    !STACK 0
    java.lang.NullPointerException
        at org.openrdf.query.impl.TupleQueryResultImpl.<init>(TupleQueryResultImpl.java:48)
        at org.openrdf.query.impl.TupleQueryResultBuilder.getQueryResult(TupleQueryResultBuilder.java:49)
        at org.openrdf.http.client.HTTPClient.sendTupleQuery(HTTPClient.java:417)
        at org.openrdf.repository.http.HTTPTupleQuery.evaluate(HTTPTupleQuery.java:41)
        at com.ontotext.molto.repositoryHelper.RepositoryUtils.executeQuery(RepositoryUtils.java:71)
        at com.ontotext.molto.repositoryHelper.RepositoryUtils.getAllClassesAndNames(RepositoryUtils.java:133)
        at org.grammaticalframework.eclipse.ontologygrammar.GFOntologyGrammarURLAndTemplatePage.validateURLField(GFOntologyGrammarURLAndTemplatePage.java:224)
        at org.grammaticalframework.eclipse.ontologygrammar.GFOntologyGrammarURLAndTemplatePage.access$0(GFOntologyGrammarURLAndTemplatePage.java:199)
        at org.grammaticalframework.eclipse.ontologygrammar.GFOntologyGrammarURLAndTemplatePage$1.widgetSelected(GFOntologyGrammarURLAndTemplatePage.java:122)
        at org.eclipse.swt.widgets.TypedListener.handleEvent(TypedListener.java:240)
        at org.eclipse.swt.widgets.EventTable.sendEvent(EventTable.java:84)
        at org.eclipse.swt.widgets.Widget.sendEvent(Widget.java:1258)
        at org.eclipse.swt.widgets.Display.runDeferredEvents(Display.java:3588)
        at org.eclipse.swt.widgets.Display.readAndDispatch(Display.java:3209)
        at org.eclipse.jface.window.Window.runEventLoop(Window.java:825)
        at org.eclipse.jface.window.Window.open(Window.java:801)
        at org.eclipse.ui.internal.handlers.WizardHandler$New.executeHandler(WizardHandler.java:257)
        at org.eclipse.ui.internal.handlers.WizardHandler.execute(WizardHandler.java:277)
        at org.eclipse.ui.internal.handlers.HandlerProxy.execute(HandlerProxy.java:293)
        at org.eclipse.core.commands.Command.executeWithChecks(Command.java:476)
        at org.eclipse.core.commands.ParameterizedCommand.executeWithChecks(ParameterizedCommand.java:508)
        at org.eclipse.ui.internal.handlers.HandlerService.executeCommand(HandlerService.java:169)
        at org.eclipse.ui.internal.handlers.SlaveHandlerService.executeCommand(SlaveHandlerService.java:241)
        at org.eclipse.ui.internal.actions.CommandAction.runWithEvent(CommandAction.java:157)
        at org.eclipse.jface.action.ActionContributionItem.handleWidgetSelection(ActionContributionItem.java:584)
        at org.eclipse.jface.action.ActionContributionItem.access$2(ActionContributionItem.java:501)
        at org.eclipse.jface.action.ActionContributionItem$5.handleEvent(ActionContributionItem.java:411)
        at org.eclipse.swt.widgets.EventTable.sendEvent(EventTable.java:84)
        at org.eclipse.swt.widgets.Widget.sendEvent(Widget.java:1258)
        at org.eclipse.swt.widgets.Display.runDeferredEvents(Display.java:3588)
        at org.eclipse.swt.widgets.Display.readAndDispatch(Display.java:3209)
        at org.eclipse.ui.internal.Workbench.runEventLoop(Workbench.java:2696)
        at org.eclipse.ui.internal.Workbench.runUI(Workbench.java:2660)
        at org.eclipse.ui.internal.Workbench.access$4(Workbench.java:2494)
        at org.eclipse.ui.internal.Workbench$7.run(Workbench.java:674)
        at org.eclipse.core.databinding.observable.Realm.runWithDefault(Realm.java:332)
        at org.eclipse.ui.internal.Workbench.createAndRunWorkbench(Workbench.java:667)
        at org.eclipse.ui.PlatformUI.createAndRunWorkbench(PlatformUI.java:149)
        at org.eclipse.ui.internal.ide.application.IDEApplication.start(IDEApplication.java:123)
        at org.eclipse.equinox.internal.app.EclipseAppHandle.run(EclipseAppHandle.java:196)
        at org.eclipse.core.runtime.internal.adaptor.EclipseAppLauncher.runApplication(EclipseAppLauncher.java:110)
        at org.eclipse.core.runtime.internal.adaptor.EclipseAppLauncher.start(EclipseAppLauncher.java:79)
        at org.eclipse.core.runtime.adaptor.EclipseStarter.run(EclipseStarter.java:344)
        at org.eclipse.core.runtime.adaptor.EclipseStarter.run(EclipseStarter.java:179)
        at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57)
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        at java.lang.reflect.Method.invoke(Method.java:616)
        at org.eclipse.equinox.launcher.Main.invokeFramework(Main.java:622)
        at org.eclipse.equinox.launcher.Main.basicRun(Main.java:577)
        at org.eclipse.equinox.launcher.Main.run(Main.java:1410)
        at org.eclipse.equinox.launcher.Main.main(Main.java:1386)

### Italian Museums
http://sparql.linkedopendata.it/musei
Sucessfully connected.

### Linked Life Data
http://linkedlifedata.com/sparql
Application hangs.

### Open Data Thesaurus
http://vocabulary.semantic-web.at/PoolParty/sparql/OpenData
Server responded with an unsupported file format: text/plain

### OpenUpLabs Geographic
http://os.services.tso.co.uk/geo/sparql
Server returned HTTP response code: 400 for URL: http://rhapp015240:1433/sparql/os-geo

### STW Thesaurus for Economics
http://zbw.eu/beta/sparql/stw
Successfully connected.

### Cancer Genome Atlas
http://hcls.deri.org:8080/openrdf-sesame/repositories/tcga
Successfully connected.

### WordNet (RKBExplorer)
http://wordnet.rkbexplorer.com/sparql/
Exception while connecting:

    !SESSION 2012-08-20 09:33:42.395 -----------------------------------------------
    eclipse.buildId=M20110909-1335
    java.version=1.6.0_24
    java.vendor=Sun Microsystems Inc.
    BootLoader constants: OS=linux, ARCH=x86, WS=gtk, NL=en_GB
    Framework arguments:  -product org.eclipse.sdk.ide
    Command-line arguments:  -product org.eclipse.sdk.ide -data /home/john/repositories/gf-eclipse-plugin/workspace/../workspace-demo -dev file:/home/john/repositories/gf-eclipse-plugin/workspace/.metadata/.plugins/org.eclipse.pde.core/Eclipse Application/dev.properties -os linux -ws gtk -arch x86 -consoleLog

    !ENTRY org.eclipse.ui 4 0 2012-08-20 09:58:01.892
    !MESSAGE Unhandled event loop exception
    !STACK 0
    java.lang.NullPointerException
        at org.openrdf.query.impl.TupleQueryResultImpl.<init>(TupleQueryResultImpl.java:48)
        at org.openrdf.query.impl.TupleQueryResultBuilder.getQueryResult(TupleQueryResultBuilder.java:49)
        at org.openrdf.http.client.HTTPClient.sendTupleQuery(HTTPClient.java:417)
        at org.openrdf.repository.http.HTTPTupleQuery.evaluate(HTTPTupleQuery.java:41)
        at com.ontotext.molto.repositoryHelper.RepositoryUtils.executeQuery(RepositoryUtils.java:71)
        at com.ontotext.molto.repositoryHelper.RepositoryUtils.getAllClassesAndNames(RepositoryUtils.java:133)
        at org.grammaticalframework.eclipse.ontologygrammar.GFOntologyGrammarURLAndTemplatePage.validateURLField(GFOntologyGrammarURLAndTemplatePage.java:224)
        at org.grammaticalframework.eclipse.ontologygrammar.GFOntologyGrammarURLAndTemplatePage.access$0(GFOntologyGrammarURLAndTemplatePage.java:199)
        at org.grammaticalframework.eclipse.ontologygrammar.GFOntologyGrammarURLAndTemplatePage$1.widgetSelected(GFOntologyGrammarURLAndTemplatePage.java:122)
        at org.eclipse.swt.widgets.TypedListener.handleEvent(TypedListener.java:240)
        at org.eclipse.swt.widgets.EventTable.sendEvent(EventTable.java:84)
        at org.eclipse.swt.widgets.Widget.sendEvent(Widget.java:1258)
        at org.eclipse.swt.widgets.Display.runDeferredEvents(Display.java:3588)
        at org.eclipse.swt.widgets.Display.readAndDispatch(Display.java:3209)
        at org.eclipse.jface.window.Window.runEventLoop(Window.java:825)
        at org.eclipse.jface.window.Window.open(Window.java:801)
        at org.eclipse.ui.internal.handlers.WizardHandler$New.executeHandler(WizardHandler.java:257)
        at org.eclipse.ui.internal.handlers.WizardHandler.execute(WizardHandler.java:277)
        at org.eclipse.ui.internal.handlers.HandlerProxy.execute(HandlerProxy.java:293)
        at org.eclipse.core.commands.Command.executeWithChecks(Command.java:476)
        at org.eclipse.core.commands.ParameterizedCommand.executeWithChecks(ParameterizedCommand.java:508)
        at org.eclipse.ui.internal.handlers.HandlerService.executeCommand(HandlerService.java:169)
        at org.eclipse.ui.internal.handlers.SlaveHandlerService.executeCommand(SlaveHandlerService.java:241)
        at org.eclipse.ui.internal.actions.CommandAction.runWithEvent(CommandAction.java:157)
        at org.eclipse.ui.internal.actions.CommandAction.run(CommandAction.java:171)
        at org.eclipse.ui.actions.NewWizardDropDownAction.run(NewWizardDropDownAction.java:182)
        at org.eclipse.jface.action.Action.runWithEvent(Action.java:498)
        at org.eclipse.jface.action.ActionContributionItem.handleWidgetSelection(ActionContributionItem.java:584)
        at org.eclipse.jface.action.ActionContributionItem.access$2(ActionContributionItem.java:501)
        at org.eclipse.jface.action.ActionContributionItem$6.handleEvent(ActionContributionItem.java:452)
        at org.eclipse.swt.widgets.EventTable.sendEvent(EventTable.java:84)
        at org.eclipse.swt.widgets.Widget.sendEvent(Widget.java:1258)
        at org.eclipse.swt.widgets.Display.runDeferredEvents(Display.java:3588)
        at org.eclipse.swt.widgets.Display.readAndDispatch(Display.java:3209)
        at org.eclipse.ui.internal.Workbench.runEventLoop(Workbench.java:2696)
        at org.eclipse.ui.internal.Workbench.runUI(Workbench.java:2660)
        at org.eclipse.ui.internal.Workbench.access$4(Workbench.java:2494)
        at org.eclipse.ui.internal.Workbench$7.run(Workbench.java:674)
        at org.eclipse.core.databinding.observable.Realm.runWithDefault(Realm.java:332)
        at org.eclipse.ui.internal.Workbench.createAndRunWorkbench(Workbench.java:667)
        at org.eclipse.ui.PlatformUI.createAndRunWorkbench(PlatformUI.java:149)
        at org.eclipse.ui.internal.ide.application.IDEApplication.start(IDEApplication.java:123)
        at org.eclipse.equinox.internal.app.EclipseAppHandle.run(EclipseAppHandle.java:196)
        at org.eclipse.core.runtime.internal.adaptor.EclipseAppLauncher.runApplication(EclipseAppLauncher.java:110)
        at org.eclipse.core.runtime.internal.adaptor.EclipseAppLauncher.start(EclipseAppLauncher.java:79)
        at org.eclipse.core.runtime.adaptor.EclipseStarter.run(EclipseStarter.java:344)
        at org.eclipse.core.runtime.adaptor.EclipseStarter.run(EclipseStarter.java:179)
        at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57)
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        at java.lang.reflect.Method.invoke(Method.java:616)
        at org.eclipse.equinox.launcher.Main.invokeFramework(Main.java:622)
        at org.eclipse.equinox.launcher.Main.basicRun(Main.java:577)
        at org.eclipse.equinox.launcher.Main.run(Main.java:1410)
        at org.eclipse.equinox.launcher.Main.main(Main.java:1386)
    
### WordNet 3.0 (VU Amsterdam)
http://api.talis.com/stores/wordnet/services/sparql

    20-Aug-2012 10:00:24 org.apache.commons.httpclient.HttpMethodBase getResponseBody
    WARNING: Going to buffer response body of large or unknown size. Using getResponseBodyAsStream instead is recommended.
    10116 [main] WARN  org.openrdf.http.client.HTTPClient  - Server reports problem: Remote service returned an error

### RxNorm
http://link.informatics.stonybrook.edu/sparql/

    112491 [main] WARN  org.openrdf.http.client.HTTPClient  - Server reports problem: Virtuoso 37000 Error SP030: SPARQL compiler, line 1: syntax error at 'group_concat' before '('

    SPARQL query:
    define sql:big-data-const 0 PREFIX ptop: <http://proton.semanticweb.org/protontop#>PREFIX owl: <http://www.w3.org/2002/07/owl#>PREFIX rdf: <http://www.w3.org/2000/01/rdf-schema#>SELECT ?class (group_concat(?class_label;separator = ' ; ') as ?cnc){ ?class a owl:Class . ?class rdf:label ?class_label . FILTER (!isBlank(?class)) .} group by ?class

...
