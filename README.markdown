
# The GF Eclipse Plugin

John  J. Camilleri  
Updated: 18 Nov 2011

_The research leading to these results has received funding from the European Union's Seventh Framework Programme (FP7/2007-2013) under grant agreement n° FP7-ICT-247914._

_This documentation is also available at the [MOLTO Project Wiki](http://www.molto-project.eu/node/1395)._

## Introduction

The aim behind developing a desktop IDE for GF is to provide more powerful tools than may be possible and/or practical in a web-based environment (the GF Web IDE). In particular, the ability to resolve identifier cross-references and browse external libraries quickly during development time is one of the primary motivations for the project.

The choice was made to develop this desktop IDE as a plugin for the Eclipse Platform as it emerged as the most popular choice among the GF developer community. Support for the platform is vast and many tools for adapting Eclipse to domain-specific languages already exist. Unlike the zero-click Web IDE approach, using the GF Eclipse plugin (GFEP) will require some manual installation and configuration on the development machine. Thus the GFEP is aimed more at seasoned developers rather than the curious GF newbie.

The starting point for the GFEP is using the [Xtext DSL Framework](http://www.eclipse.org/Xtext/) for Eclipse. By converting the GF grammar into the appropriate Extended-BNF form required by the LL(*) ANTLR parser, the framework provides a good starting point for future plugin development, already including a variery of syntax checking tools and some cross-reference resolution support. The specific requirements of the GF language, particularly in the way of its special module hierarchy, mean that significant customisations to this generated base plugin are needed.

### Who

The GFEP is being developed as part of Work Package 2 of the [MOLTO Project](http://www.molto-project.eu/).

Primary developer is **John J. Camilleri**, who should be contacted for all queries and feedback related to the plugin on `john.j.camilleri` at domain `chalmers.se`.

### Links

- This document shall contain the most up-to-date information about the plugin. The most up-to-date version of this file can always be found in the source-code repository at <https://github.com/GrammaticalFramework/gf-eclipse-plugin/blob/master/README.markdown>
- Source code repository is at <https://github.com/GrammaticalFramework/gf-eclipse-plugin> (do not try to run the plugin from source; please only use the packaged releases).
- Here are some [example GF projects](http://www.grammaticalframework.org/eclipse/examples/) for testing out the plugin features.
- Software update site URL for installing through Eclipse:
`http://www.grammaticalframework.org/eclipse/release/`

--------------------------------------------------------------------------------

## Features

### Implemented

- Syntax highlighting and error detection
- Code folding, quick block-commenting, automatic code formatting
- Definition outlining, jump to declaration, find usage
- Warnings for problems in module dependancy hierarchy
- Launch configurations, i.e. compilation directly from IDE
- Use GF Shell from within Eclipse
- Auto-completion for declared identifiers
- Background compilation (shallow) using project builder
- Full support for _Open Declaration_ (F3)

### Near-term

- Inline documentation for function calls, overloads
- Quick-fix suggestions for syntax and naming errors
- Code generation for concrete/instance modules
- Code generation for new languages in application grammars
- Grouping of concrete syntaxes by language, fast switching and linked navigation
- Built-in library browser (in particular for GF resource grammar library)

### Long-term goals

- Test-suite functionality
- Treebank management and testing
- Provide a single platform for developing and using embedded grammars
- Integration with ontology engineering tools

--------------------------------------------------------------------------------

## Update history

**24/11/11**
: (1.2.0.x) with support for "Open Declaration" (F3) function, including for external libraries.

**18/11/11**
: Third BETA (1.1.0.x) released, overhauled to take advantage of new compiler features. Tag-based scoping with caching for better performance. Interactive console (GF Shell) for luanch configs.

**11/10/11**
: Second BETA (1.0.0.x) released, with improved support for qualified names, local variable bindings, selective inheritance, module outlining, and launch configurations. Also new GF Project type.

**01/10/11**
: Initial BETA released.

**20/09/11**
: Refactoring of grammar to provide neater syntax trees, and handle cross-referencing contraints. Major work on name resolution across modules, implementing custom `Scoping`, `Naming`, `ResourceDescription` implementations.

**08/09/11**
: Successfully converted GF language grammar into ANTLR-compaticble format. Refactoring to avoid left-recursion took up the majority of this time so far.

**Late August 2011**
: Started investigation the use of Xtext as a basis for building the Eclipse plugin. Xtext requires a EBNF-style language grammar in order to generate development tools as a plugin for the Eclipse IDE.

--------------------------------------------------------------------------------

## Installation &amp; updating

### System requirements

1. The plugin makes use of the newest GF features, and **requires the latest developer version of GF** to be installed on your system (instructions [here](http://www.grammaticalframework.org/download/index.html)).
1. Paths to GF must be set within the plugin (see below). This means:
    - you don't necessarily need to have GF in your `PATH` environment variable
    - you can use a separate GF installation for GFEP if you wish
1. The plugin was developed using Eclipse 3.7, and has **not** been tested with older versions of Eclipse.

### Installing the plugin for the first time

1. Inside Eclipse, go to **Help &rarr; Install New Software**.
1. Add new software site using the URL: `http://www.grammaticalframework.org/eclipse/release/`
1. Select the **GF Eclipse Plugin**, click Next, accept the license agreement and install.
1. Accept the prompt warning that the software is unsigned.
1. Restart Eclipse when prompted.

#### Settings
1. Add the GF perspective by clicking **Open Perspective &rarr; Other** and choosing **GF**.
1. Set your paths to the GF executable and libraries by going to **Window &rarr; Preferences &rarr; Grammatical Framework**.  
_The runtime path is assumed to be `~/.cabal/bin/gf`, which may be wrong depending on your
system and how you installed GF._  
_The library path should get automatically set from your environment's `GF_LIB_PATH` variable._
1. You can also adjust the verbosity level of the GFEP logger.


### Updating the plugin

1. In Eclipse, go to **Help &rarr; Check for updates**.
1. Any available updates will appear in the dialog. Select them and follow the usual steps.

#### Upgrading to GFEP 1.2.0

- You may receive a prompt asking if you want to add the Xtext nature to your project; click **Yes** to this (should not apply for newly-created projects).

- A new folder named `(External)` may be created in your project, which contains symbolic links to any external GF libraries referenced by your files. You may double click these links as usual (the libraries will be opened as _read-only_).

--------------------------------------------------------------------------------

## Getting started

Some steps you can follow to get a feel of of the plugin's features.

- Create a new **GF Project**.

![New project wizard](http://www.grammaticalframework.org/eclipse/images/eclipse-projectwizard-1.png)
![New project wizard](http://www.grammaticalframework.org/eclipse/images/eclipse-projectwizard-2.png)

- Create some new modules using the **GF Module** wizard from **File > New > Other > GF Module**:

![New module wizard](http://www.grammaticalframework.org/eclipse/images/eclipse-modulewizard-1.png)

_If asked whether you want to add the **Xtext nature** to your project, you can safely say **No** (this prompt has been removed in newer versions)._

- You can find some small examples at http://www.grammaticalframework.org/eclipse/examples/. Download the 
files and manually add them to your Eclipse workspace. To experiment with some of the plugin features.

- Use Eclipes' own features to drag and drop your editor tabs to suit your needs. Notice the **Outline** view in the bottom-right offers a quite overview of your module structure. Clicking any of the terms will make your cursor jump to that point in the file.

![The editor and outline view](http://www.grammaticalframework.org/eclipse/images/eclipse-editor-general.png)

- Note how changing a `cat` definition for example will produce warnings and/or errors in other the modules.

![Warnings and errors in the editor](http://www.grammaticalframework.org/eclipse/images/eclipse-editor-cat.png)

- Use the built-in code formatter to tidy your code automatically. Right-click in the editor and choose **Format** or use the keyboard shortcut **Ctrl+Shift+F**.

![Before auto-formatting](http://www.grammaticalframework.org/eclipse/images/eclipse-before-format.png) ![After auto-formatting](http://www.grammaticalframework.org/eclipse/images/eclipse-after-format.png)

- Set up a launch configuration from **Run &rarr; Run Configurations... &rarr; Grammatical Framework**. You will see the dialog below with some fields automatically filled in for you. 

![Launch configuration dialog](http://www.grammaticalframework.org/eclipse/images/eclipse-launchconfig.png)

- Run the launch config and you will see the output from the GF compiler in the console view within Eclipse.

![Output from the GF compiler](http://www.grammaticalframework.org/eclipse/images/eclipse-compileroutput.png)

### Usage hints & issues

#### Consoles

The plugin provides its own console view named _GFEP Log_, which shows log messages based on the **Log Level** preference (**Window &rarr; Preferences &rarr; Grammatical Framework**).

Additionally, everytime a grammar is **Run** a _new_ console is opened to display the output. This console may also serve as the interactive GF Shell, depending on the **Interactive Mode** checkbox in your **Run Configuration**.

Eclipse does not make it obvious when multiple console windows open; click on the **Display Selected Console** button to switch between open consoles:

![Display Selected Console icon](http://www.grammaticalframework.org/eclipse/images/eclipse-console-icon.png)

_The Eclipse console implementation does not support command history (up arrow) or auto-completion (tab)._

#### Logs

You can set the log verbosity from **Window &rarr; Preferences &rarr; Grammatical Framework**. This setting also affects the verbosity of the log file `gfep.log`.

#### Validation

For validation to work correctly, the project's **Build Automatically** option should be turned on.

The in-editor validation sometimes needs to be triggered/updated by a keystroke. If you can still see errors which you believe should be correct, try adding a space character to ensure the validation is re-triggered.

Sometimes you may get an entire file marked with errors, even though in fact there is only a single error which is causing the internal builder to fail. In such cases referring to the **Problems** view should help you locate the cause. This issue is particularly relevant when changes made to one module may induce errors in its descendants (e.g. renaming a parameter in a resource module). This behaviour will hopefully be improved in future versions. 

--------------------------------------------------------------------------------

## Evaluation & feedback

Please try to use the plugin for developing your own GF projects and report any issues you come up against.
Do not hesitate to contact me on `john.j.camilleri` at domain `chalmers.se` and let me know how you think the plugin can be improved.

### Criteria

As part of the evaluation of the GF Eclipse Plugin, feedback (both negative and positive) on the following would be appreciated:

1. Issues encountered with installation
1. Incorrect support of GF syntactic constructs, module hierarchy system
1. Performance issues (speed, resources footprint)
1. General intuitiveness of the UI
1. Feature wish-list
1. Compatibilities / conflicts with other Eclipse plugins

### Logs

The GFEP writes a log file in your Eclipse workspace folder, self-evidently named `gfep.log`. When things go wrong it may be useful to consult this file, or even send it as part of any feedback you provide.
