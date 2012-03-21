# The GF Eclipse Plugin

John  J. Camilleri  
Updated: 21 March 2012

_The research leading to these results has received funding from the European Union's Seventh Framework Programme (FP7/2007-2013) under grant agreement no. FP7-ICT-247914._

_This documentation is also available at the [MOLTO Project Wiki](http://www.molto-project.eu/node/1395)._

## Introduction

The aim behind developing a desktop IDE for GF is to provide more powerful tools than may be possible and/or practical in a web-based environment (the GF Web IDE). In particular, the ability to resolve identifier cross-references and browse external libraries quickly during development time is one of the primary motivations for the project.

The choice was made to develop this desktop IDE as a plugin for the Eclipse Platform as it emerged as the most popular choice among the GF developer community. Support for the platform is vast and many tools for adapting Eclipse to domain-specific languages already exist. Unlike the zero-click Web IDE approach, using the GF Eclipse plugin (GFEP) will require some manual installation and configuration on the development machine. Thus the GFEP is aimed more at seasoned developers rather than the curious GF newbie.

The starting point for the GFEP is using the [Xtext DSL Framework](http://www.eclipse.org/Xtext/) for Eclipse. By converting the GF grammar into the appropriate Extended-BNF form required by the LL(*) ANTLR parser, the framework provides a good starting point for future plugin development, already including a variery of syntax checking tools and some cross-reference resolution support. The specific requirements of the GF language, particularly in the way of its special module hierarchy, mean that significant customisations to this generated base plugin are needed.

The GFEP is being developed by  as part of Work Package 2 of the [MOLTO Project](http://www.molto-project.eu/).

### Links

- This document shall contain the most up-to-date information about the plugin. The most up-to-date version of this file can always be found in the source-code repository at [GitHub](https://github.com/GrammaticalFramework/gf-eclipse-plugin/blob/master/README.md)
- Source code repository is at [github.com/GrammaticalFramework/gf-eclipse-plugin](https://github.com/GrammaticalFramework/gf-eclipse-plugin)
- For reporting bugs and requesting features, please use the [GitHub Issue Tracker](https://github.com/GrammaticalFramework/gf-eclipse-plugin/issues)
- Here are some [example GF projects](http://www.grammaticalframework.org/eclipse/examples/) for testing out the plugin features.
- Software update site URL for installing through Eclipse: `http://www.grammaticalframework.org/eclipse/release/`

## Features

- Syntax highlighting and error detection
- Code folding, quick block-commenting, automatic code formatting
- Definition outlining, jump to declaration, find usage
- Warnings for problems in module dependancy hierarchy
- Launch configurations, i.e. compilation directly from IDE
- Use GF Shell from within Eclipse
- Auto-completion for declared identifiers
- Background compilation (shallow) using project builder
- Support for _Open Declaration_ (F3), including qualified names
- Code generation for new languages in application grammars
- Inline documentation for function calls, overloads
- Proper cross-reference handling with qualified names
- Treebank management and testing tool
- External library browser

## Release history

**21/03/12**
: (1.4.2.x) Added wizard for context-free grammars (no syntax support, though).

**14/03/12**
: (1.4.1.x) GF source files can now be anywhere in project, not necessarily at top level.

**06/03/12**
: (1.4.0.x) Treebank manager view. Updated launch configurations. UI improvements, new icons. Inline contextual documentation. Correct resolution of qualified identifiers. Bug fixes and some refactoring.

**07/02/12**
: (1.3.0.x) Re-written underlying GF grammar.

**02/02/12**
: (1.2.5.x) Hugely improved scoping performance. New "Clone to new language" wizard. Improved code formatting. More efficient builder. Removed library path preference. GF runtime is now automatically found.

**23/01/12**
: (1.2.4.x) Logging is now done to the Eclipse Platform Log (use "Error Log" view). Tested with Eclipse 3.6.2. Bug fixes.

**11/01/12**
: (1.2.3.x) Updated to use Xtext 2.1.0. Links to external files now moved into new "GF Library View".

**24/11/11**
: (1.2.0.x) with support for "Open Declaration" (F3) function, including for external libraries.

**18/11/11**
: Third BETA (1.1.0.x) released, overhauled to take advantage of new compiler features. Tag-based scoping with caching for better performance. Interactive console (GF Shell) for luanch configs.

**11/10/11**
: Second BETA (1.0.0.x) released, with improved support for qualified names, local variable bindings, selective inheritance, module outlining, and launch configurations. Also new GF Project type.

**01/10/11**
: Initial BETA released.


<!----------------------------------------------------------------------------->

## Installation &amp; updating

### System requirements

1. [GF version 3.3.3](http://www.grammaticalframework.org/download/release-3.3.3.html) or above. The path to GF must be set within the plugin (see below).
1. [Eclipse](http://www.eclipse.org/downloads/) 3.6 or above.

### Installing the plugin for the first time

**Note about Available Software Sites**

In order for dependencies to be satisfied, you need to ensure that your Eclipse has the following update site URLs set:

- Eclipse releases (change version name to match): `http://download.eclipse.org/releases/indigo`
- Xtext: `http://download.eclipse.org/modeling/tmf/xtext/updates/composite/releases/`

**Steps for installation**

1. Inside Eclipse, go to **Help &rarr; Install New Software**.
1. Add new software site using the URL: `http://www.grammaticalframework.org/eclipse/release/`
1. Select the **GF Eclipse Plugin**, and make sure the **Contact all update sites during install to find required software** option is checked.
1. Click Next, accept the license agreement and install.
1. Accept the prompt warning that the software is unsigned.
1. Restart Eclipse when prompted.

#### Settings

1. Add the GF perspective by clicking **Open Perspective &rarr; Other** and choosing **GF**.
1. The plugin will try to determine the path to your GF executable automatically. You can always check/overwrite it by going to **Window &rarr; Preferences &rarr; Grammatical Framework**.
This path should **include** the name of the GF binary itself, e.g. `/home/john/.cabal/bin/gf` or `C:\Users\John\GF\gf.exe`.
1. You can also adjust the verbosity level of the GFEP console log in the preferences window.

### Updating the plugin

1. In Eclipse, go to **Help &rarr; Check for updates**.
1. Any available updates will appear in the dialog. Select them and follow the usual steps.

#### Deprecated stuff

- If your project has a folder named `(External)` you can safely delete this **via the Eclipse Project Explorer**. It is no longer used in GFEP &ge; 1.2.3
- If your workspace contains a log file `gfep.log` then you can safely delete it from your system. As of version 1.2.4, GFEP uses Eclipse's standard log file at `<workspace>/.metadata/.log`

### Project settings

Although the plugin should take care of your project settings for you, in case anything gets messed up you can always correct them manually as follows:

#### Project nature

Your `.project` file should include the GF Project Nature as follows:

    <natures>
      <nature>org.grammaticalframework.eclipse.ui.natures.projectNatureID</nature>
    </natures>


#### Builder

Your `.project` file should include the GF Builder as follows:

    <buildSpec>
      <buildCommand>
          <name>org.grammaticalframework.eclipse.ui.build.GFBuilderID</name>
          <arguments>
          </arguments>
      </buildCommand>
    </buildSpec>


<!----------------------------------------------------------------------------->

## Getting started

Some steps you can follow to get a feel of of the plugin's features.

### Video tutorial

A quick run through of the major features available in the GF Eclipse Plugin.

<iframe src="http://player.vimeo.com/video/38768382?byline=0&amp;portrait=0" width="693" height="512" frameborder="0" webkitAllowFullScreen mozallowfullscreen allowFullScreen></iframe>

_If the video doesn't appear above, you can view it at [https://vimeo.com/38768382](https://vimeo.com/38768382)_

### The Eclipse _workspace_ and _project_ concepts
When you run Eclipse, it asks you to create or specify a _workspace_ on your system. Any projects you wish to work
on inside Eclipse must reside in this workspace; generally each folder under the top-level workspace directory is
considered an individual project, i.e.:

    workspace/
        Project1/
            file1.gf
            file2.gf
        Project2/
            file3.gf
            file4.gf

If you open an existing folder as your workspace in Eclipse, then your folders in that workspace do not automatically
become Eclipse projects. You must follow the "Create new GF Project" wizards below, and give your project the exact
name of the existing folder (e.g. `Project1` or `Project2` in the example above.)

#### GF Nature and Builder
The _GF Nature_ and the _GF Builder_ are what make a regular Eclipse project a _GF_ project. If you create a new GF Project
from scratch then you don't need to worry too much about them. If you already have some project set up in your Eclipse
workspace, then you will need to associate these two items with your project in order for all the GF goodness to work.

As of 1.4.2, this can be done very easily by right-clicking on your project in the explorer and clicking **Add/Remove GF Nature &amp; Builder**.
If your project has the GF icon overlayed on it, then the GF nature and builder are correctly associated with it.

### Create a new GF Project
![New project wizard](http://www.grammaticalframework.org/eclipse/images/eclipse-projectwizard-1.png)
![New project wizard](http://www.grammaticalframework.org/eclipse/images/eclipse-projectwizard-2.png)

### New module wizard
Use the **GF Module** wizard from **File &rarr; New &rarr; Other &rarr; GF Module**:

![New module wizard](http://www.grammaticalframework.org/eclipse/images/eclipse-modulewizard-1.png)

You can find some small examples at [grammaticalframework.org/eclipse/examples](http://www.grammaticalframework.org/eclipse/examples/). Download the files and manually add them to your Eclipse workspace to experiment with some of the plugin features.

### Clone module wizard
If you want to clone an existing module into a new language, you can now do so via the **Clone GF Module** wizard. This is also available as a context menu option in the **Project Explorer**, via **&lt;Richt click&gt; &rarr; Grammatical Framework &rarr; Compile for new language**:

![Clone GF module to new language wizard](http://www.grammaticalframework.org/eclipse/images/eclipse-clonewizard.png)

This will create and open a new module with the relevant replacements made. Note how in this case string constants are replaced by the empty string `""`. This wizard currently only works on `concrete` and `instance` modules.

![Newly cloned file](http://www.grammaticalframework.org/eclipse/images/eclipse-clonewizard-newfile.png)

### Workbench editor layout
Use Eclipes' own features to drag and drop your editor tabs to suit your needs.

![The editor and outline view](http://www.grammaticalframework.org/eclipse/images/eclipse-editor-general.png)

### Outline view
The **Outline** view in the bottom-right offers a quite overview of your module structure. Clicking any of the terms will make your cursor jump to that point in the file.

### Cross-referencing errors and warnings
Notice how changing a `cat` definition for example will produce warnings and/or errors in other the modules.

![Warnings and errors in the editor](http://www.grammaticalframework.org/eclipse/images/eclipse-editor-cat.png)

### Validation
The in-editor validation sometimes needs to be triggered/updated by a keystroke. If you can still see errors which you believe should be correct, try adding a space character to ensure the validation is re-triggered.

Sometimes you may get an entire file marked with errors, even though in fact there is only a single error which is causing the internal builder to fail. In such cases referring to the **Problems** view should help you locate the cause. This issue is particularly relevant when changes made to one module may induce errors in its descendants (e.g. renaming a parameter in a resource module). This behaviour will hopefully be improved in future versions.

#### Builder
For validation to work correctly, the project's **Build Automatically** option should be turned on.
Each time you save a file (or some other change occurs in your project), the builder should get triggered which recompiles any GF files which have changed. If the builder does not seem to get triggered, try to run a _clean_ via **Project &rarr; Clean...**

### Code formatting
Use the built-in code formatter to tidy your code automatically. Right-click in the editor and choose **Format** or use the keyboard shortcut **Ctrl+Shift+F**.

![Before auto-formatting](http://www.grammaticalframework.org/eclipse/images/eclipse-before-format.png) ![After auto-formatting](http://www.grammaticalframework.org/eclipse/images/eclipse-after-format.png)

### Syntax highlighting
You can change your syntax colouring styles as you wish from **Window &rarr; Preferences &rarr; Grammatical Framework &rarr; Syntax Coloring**

![Syntax highlighting styles](http://www.grammaticalframework.org/eclipse/images/eclipse-syntaxcoloring.png)

### Launch configurations
Set up a launch configuration from **Run &rarr; Run Configurations... &rarr; Grammatical Framework**. You will see the dialog below with some fields automatically filled in for you. 

![Launch configuration dialog](http://www.grammaticalframework.org/eclipse/images/eclipse-launchconfig.png)

Run the launch config and you will see the output from the GF compiler in the console view within Eclipse.

![Output from the GF compiler](http://www.grammaticalframework.org/eclipse/images/eclipse-compileroutput.png)

#### Run As... launch shortcut
Using the **Run &rarr; Run As &rarr; Compile with GF** shortcut will take the current selection or active editor and do one of two things:

1. If a launch configuration already exists which the current file in its _Source filenames_ field, then that config will be launch directly.
1. Otherwise, a new a launch configuration window is displayed where you will need to review and confirm the default settings before continuing.

### Consoles
The plugin provides its own console view named _GFEP Log_, which shows log messages based on the **Log Level** preference (**Window &rarr; Preferences &rarr; Grammatical Framework**).

Additionally, every time a grammar is **Run** a _new_ console is opened to display the output. This console may also serve as the interactive GF Shell, depending on the **Interactive Mode** checkbox in your **Run Configuration**.

Eclipse does not make it obvious when multiple console windows open; click on the **Display Selected Console** button to switch between open consoles:

![Display Selected Console icon](http://www.grammaticalframework.org/eclipse/images/eclipse-console-icon.png)

If the process associated with a console window has terminated, it will be indicated in the upper-left corner as below. Such console windows can then be closed using the gray cross button:

![Close terminated console icon](http://www.grammaticalframework.org/eclipse/images/eclipse-console-terminated.png)

_The Eclipse console implementation does not support command history (up arrow) or auto-completion (tab)._

### _External Libraries_ view
This view is automatically populated with a list of all the external modules referenced by the current file. Double-clicking on any item provides a quick way of opening GF files which are imported into your grammar from outside your Eclipse project, for example the GF Resource Grammar Library.

![External libraries view](http://www.grammaticalframework.org/eclipse/images/eclipse-external-libraries.png)

_Future versions of this view will contain a full tree of all identifiers available in the current scope._

### _Treebank Manager_ view
This feature works together with the launch configurations to make the process of testing treebanks against your grammars quick and easy. As described in the [GF Book](http://www.grammaticalframework.org/gf-book/) (Section 10.5), the general development-test cycle (independent of GFEP) is as follows:

1. Create a file `test.trees` which contains a bunch of abstract syntax trees, which you want to test
1. Compile your grammar and linearise the trees one by one, using some command like `rf -lines -tree -file=test.trees | l -table | wf -file=test.trees.out`
1. Manually correct the output in `test.trees.out` and save it as your gold standard file `test.trees.gold`.
1. Each time you update your grammar, repeat step 2, then compare your new output against the gold standard using `diff` or some other comparison tool.

The **Treebank Manager** view follows this same pattern but provides a convenient graphical interface for running your treebanks and also for looking at the output, just using a few clicks:

![Treebank Manager view](http://www.grammaticalframework.org/eclipse/images/eclipse-treebank-manager.png)

Note that GFEP assumes the following convention:

`nouns.trees`
: Treebank file (abstract trees)

`nouns.trees.out`
: Output file (generated linearisations)

`nouns.trees.gold`
: Gold standard file (manually corrected linearisations)


### Logs
The GFEP writes to the Eclipse platform log. This can be accessed in two ways:

1. By opening the **Error Log** view in Eclipse
1. Accessing the file directly at `<workspace>/.metadata/.log`

You can set the log verbosity from **Window &rarr; Preferences &rarr; Grammatical Framework**.


<!----------------------------------------------------------------------------->

## Evaluation & feedback

Please try to use the plugin for developing your own GF projects and report any issues you come up against.

For all bug reports and feature requests please use the [GitHub Issue Tracker](https://github.com/GrammaticalFramework/gf-eclipse-plugin/issues).

Do not hesitate to let us know how you think the plugin can be improved!

### Criteria

As part of the evaluation of the GF Eclipse Plugin, feedback (both negative and positive) on the following would be appreciated:

1. Issues encountered with installation
1. Incorrect support of GF syntactic constructs, module hierarchy system
1. Performance issues (speed, resources footprint)
1. General intuitiveness of the UI
1. Feature wish-list
1. Compatibilities / conflicts with other Eclipse plugins


<!----------------------------------------------------------------------------->

## Appendix

### Icons

Description of some of the icons which are used in the GF Eclipse Plugin.

| Icon | Description | Notes |
|:----:|:------------|:------|
|![](http://www.grammaticalframework.org/eclipse/images/module-abstract.png)  | Abstract module |`abstract Foods = ...`|
|![](http://www.grammaticalframework.org/eclipse/images/module-concrete.png)  | Concrete module |`concrete FoodsEng of Foods = ...`|
|![](http://www.grammaticalframework.org/eclipse/images/module-resource.png)  | Resource module |`resource ResFoods = ...`|
|![](http://www.grammaticalframework.org/eclipse/images/module-interface.png)  | Interface |`interface LexFoods = ...`|
|![](http://www.grammaticalframework.org/eclipse/images/module-instance.png)  | Instance |`instance LexFoodsEng of LexFoods = ...`|
|![](http://www.grammaticalframework.org/eclipse/images/module-functor.png)  | Functor |`incomplete concrete FodosI of Foods = ...`|
|![](http://www.grammaticalframework.org/eclipse/images/module-functor-instantiation.png)  | Functor instantiation |`concrete FoodsEng of Foods = FoodsI with (...) ...`|

