# The GF Eclipse Plugin

John  J. Camilleri  
Updated: 2 Feb 2012

_The research leading to these results has received funding from the European Union's Seventh Framework Programme (FP7/2007-2013) under grant agreement n° FP7-ICT-247914._

_This documentation is also available at the [MOLTO Project Wiki](http://www.molto-project.eu/node/1395)._

## Introduction

The aim behind developing a desktop IDE for GF is to provide more powerful tools than may be possible and/or practical in a web-based environment (the GF Web IDE). In particular, the ability to resolve identifier cross-references and browse external libraries quickly during development time is one of the primary motivations for the project.

The choice was made to develop this desktop IDE as a plugin for the Eclipse Platform as it emerged as the most popular choice among the GF developer community. Support for the platform is vast and many tools for adapting Eclipse to domain-specific languages already exist. Unlike the zero-click Web IDE approach, using the GF Eclipse plugin (GFEP) will require some manual installation and configuration on the development machine. Thus the GFEP is aimed more at seasoned developers rather than the curious GF newbie.

The starting point for the GFEP is using the [Xtext DSL Framework](http://www.eclipse.org/Xtext/) for Eclipse. By converting the GF grammar into the appropriate Extended-BNF form required by the LL(*) ANTLR parser, the framework provides a good starting point for future plugin development, already including a variery of syntax checking tools and some cross-reference resolution support. The specific requirements of the GF language, particularly in the way of its special module hierarchy, mean that significant customisations to this generated base plugin are needed.

The GFEP is being developed by  as part of Work Package 2 of the [MOLTO Project](http://www.molto-project.eu/).

### Links

- This document shall contain the most up-to-date information about the plugin. The most up-to-date version of this file can always be found in the source-code repository at <https://github.com/GrammaticalFramework/gf-eclipse-plugin/blob/master/README.markdown>
- Source code repository is at <https://github.com/GrammaticalFramework/gf-eclipse-plugin> (do not try to run the plugin from source; please only use the packaged releases).
- For reporting bugs and requesting features, please use the [GitHub Issue Tracker](https://github.com/GrammaticalFramework/gf-eclipse-plugin/issues)
- Here are some [example GF projects](http://www.grammaticalframework.org/eclipse/examples/) for testing out the plugin features.
- Software update site URL for installing through Eclipse: <http://www.grammaticalframework.org/eclipse/release/>

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
- Support for _Open Declaration_ (F3)
- Code generation for new languages in application grammars

### Near-term

- Built-in library browser (in particular for GF resource grammar library)
- Inline documentation for function calls, overloads
- Quick-fix suggestions for syntax and naming errors
- Code generation for concrete/instance modules
- Grouping of concrete syntaxes by language, fast switching and linked navigation

### Long-term goals

- Test-suite functionality
- Treebank management and testing
- Provide a single platform for developing and using embedded grammars
- Integration with ontology engineering tools

--------------------------------------------------------------------------------

## Major release history

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


--------------------------------------------------------------------------------

## Installation &amp; updating

### System requirements

1. The plugin makes use of the newest GF features, and **requires the latest developer version of GF** to be installed on your system (instructions [here](http://www.grammaticalframework.org/download/index.html)).
1. Paths to GF must be set within the plugin (see below). This means:
    - you don't necessarily need to have GF in your `PATH` environment variable
    - you can use a separate GF installation for GFEP if you wish
1. The plugin was developed using Eclipse 3.7. It has been successfully installed on Eclipse as low as 3.6.2.

### Installing the plugin for the first time

**Note about Available Software Sites**

In order for dependencies to be satisfied, you need to ensure that your Eclipse has the following update site URLs set:

- Eclipse releases (change version name to match): <http://download.eclipse.org/releases/indigo>
- Xtext: <http://download.eclipse.org/modeling/tmf/xtext/updates/composite/releases/>

**Steps for installation**

1. Inside Eclipse, go to **Help &rarr; Install New Software**.
1. Add new software site using the URL: <http://www.grammaticalframework.org/eclipse/release/>
1. Select the **GF Eclipse Plugin**, and make sure the **Contact all update sites during install to find required software** option is checked.
1. Click Next, accept the license agreement and install.
1. Accept the prompt warning that the software is unsigned.
1. Restart Eclipse when prompted.

#### Settings

1. Add the GF perspective by clicking **Open Perspective &rarr; Other** and choosing **GF**.
1. The plugin will try to determine the path to your GF executable automatically. You can always check/overwrite it by going to **Window &rarr; Preferences &rarr; Grammatical Framework**.  
1. You can also adjust the verbosity level of the GFEP console log in the preferences window.

### Updating the plugin

1. In Eclipse, go to **Help &rarr; Check for updates**.
1. Any available updates will appear in the dialog. Select them and follow the usual steps.

#### Deprecated stuff

- If your project has a folder named `(External)` you can safely delete this **via the Eclipse Project Explorer**. It is no longer used in GFEP >= 1.2.3
- If your workspace contains a log file `gfep.log` then you can safely delete it from your system. As of version 1.2.4, GFEP uses Eclipse's standard log file at `.metadata/.log`

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


--------------------------------------------------------------------------------

## Getting started

Some steps you can follow to get a feel of of the plugin's features.

- Create a new **GF Project**.

![New project wizard](http://www.grammaticalframework.org/eclipse/images/eclipse-projectwizard-1.png)
![New project wizard](http://www.grammaticalframework.org/eclipse/images/eclipse-projectwizard-2.png)

- Create some new modules using the **GF Module** wizard from **File &rarr; New &rarr; Other &rarr; GF Module**:

![New module wizard](http://www.grammaticalframework.org/eclipse/images/eclipse-modulewizard-1.png)

_If asked whether you want to add the **Xtext nature** to your project, you can safely say **No** (this prompt has been removed in newer versions)._

- You can find some small examples at <http://www.grammaticalframework.org/eclipse/examples/>. Download the 
files and manually add them to your Eclipse workspace to experiment with some of the plugin features.

- You can change your syntax colouring styles as you wish from **Window &rarr; Preferences &rarr; Grammatical Framework &rarr; Syntax Coloring**

![Syntax highlighting styles](http://www.grammaticalframework.org/eclipse/images/eclipse-syntaxcoloring.png)

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

You can set the log verbosity from **Window &rarr; Preferences &rarr; Grammatical Framework**.

#### Validation

For validation to work correctly, the project's **Build Automatically** option should be turned on.

The in-editor validation sometimes needs to be triggered/updated by a keystroke. If you can still see errors which you believe should be correct, try adding a space character to ensure the validation is re-triggered.

Sometimes you may get an entire file marked with errors, even though in fact there is only a single error which is causing the internal builder to fail. In such cases referring to the **Problems** view should help you locate the cause. This issue is particularly relevant when changes made to one module may induce errors in its descendants (e.g. renaming a parameter in a resource module). This behaviour will hopefully be improved in future versions. 

--------------------------------------------------------------------------------

## Evaluation & feedback

Please try to use the plugin for developing your own GF projects and report any issues you come up against.

For all bug reports and feature requests please use the GitHub Issue Tracker at <https://github.com/GrammaticalFramework/gf-eclipse-plugin/issues>.

Do not hesitate to let us know how you think the plugin can be improved!

### Criteria

As part of the evaluation of the GF Eclipse Plugin, feedback (both negative and positive) on the following would be appreciated:

1. Issues encountered with installation
1. Incorrect support of GF syntactic constructs, module hierarchy system
1. Performance issues (speed, resources footprint)
1. General intuitiveness of the UI
1. Feature wish-list
1. Compatibilities / conflicts with other Eclipse plugins

### Logs

The GFEP writes to the Eclipse platform log. This can be accessed in two ways:

1. By opening the **Error Log** view in Eclipse
1. Accessing the file directly at `workspace/.metadata/.log`