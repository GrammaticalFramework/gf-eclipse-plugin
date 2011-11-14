
# The GF Eclipse Plugin

_The research leading to these results has received funding from the European Union's Seventh Framework Programme (FP7/2007-2013) under grant agreement n° FP7-ICT-247914._


## Intro & motivation

The aim behind developing a desktop IDE for GF is to provide more powerful tools than may be possible and/or practical in a web-based setting. In particular, the ability to resolve cross-references between source files and libraries instantaneously during development time is one of the primary goals and motivations for the project.

The choice was made to develop this desktop IDE as a plugin for the Eclipse Platform as it seemed to be the most popular choice among the GF developer community. Support for the platform is vast and many tools for adapting Eclipse to domain-specific languages already exist. Unlike the zero-click WIDE approach, using the GF Eclipse plugin (GFEP) will require some manual installation and configuration on the development machine. Thus the GFEP is aimed more at seasoned developers rather than just the curious.

## Who

The GFEP is being developed as part of Work Package 2 of the MOLTO Project.

Primary developer is **John J. Camilleri**, who should be contacted for all queries directly related to the plugin on `john.j.camilleri` at the domain `chalmers.se`.

## Status

The starting point for the GFEP is using the Xtext DSL Framework for Eclipse (http://www.eclipse.org/Xtext/). By converting the GF grammar into the appropriate Extended-BNF form required by the LL(*) ANTLR parser, the framework provides a good starting point for future plugin development, already including a variery of syntax checking tools and some cross-reference resolution support. The specific requirements of the GF language, particularly in the way of its special module hierarchy, mean that significant customisations to this generated base plugin are needed.

As of 1st October 2011, a first prototype of the GFEP has been released to GF developers to gather some initial feedback. This first release is not intended to be a mature development tool, but a showcase of some of the potential features that can be provided by developing GF grammars within a powerful desktop IDE. Reactions from within the GF developer community will guide the way forward, both in prioritizing the future tasks and also in better guaging the person-month cost that an eventual mature version of the plugin would require.

## Update history

**11/10/11**
: Second BETA released, with improved support for qualified names, local variable bindings, selective inheritance, module outlining, and launch configurations. Also new GF Project type.

**01/10/11**
: Initial BETA released.

**20/09/11**
: Refactoring of grammar to provide neater syntax trees, and handle cross-referencing contraints. Major work on name resolution across modules, implementing custom `Scoping`, `Naming`, `ResourceDescription` implementations.

**08/09/11**
: Successfully converted GF language grammar into ANTLR-compaticble format. Refactoring to avoid left-recursion took up the majority of this time so far.

**Late August 2011**
: Started investigation the use of Xtext as a basis for building the Eclipse plugin. Xtext requires a EBNF-style language grammar in order to generate development tools as a plugin for the Eclipse IDE.


--------------------------------------------------------------------------------

# Features & issues

## Features

### Implemented (or partially implemented)

- Syntax highlighting and error detection
- Code folding, quick block-commenting, automatic code formatting
- Definition outlining, jump to declaration, find usage
- Warnings for problems in module dependancy hierarchy
- Launch configurations, i.e. compilation directly from IDE

### Coming soon

- Auto-completion for declared identifiers
- Inline documentation for function calls, overloads
- Quick-fix suggestions for syntax and naming errors
- Code generation for concrete/instance modules
- Code generation for new languages in application grammars
- Grouping of concrete syntaxes by language, fast switching and linked navigation
- Built-in library browser (in particular for GF resource grammar library)

### Long-term goals

- Test-suite functionality
- Treebank management and testing
- Possibility to incorporate treebank tool demonstrated by Jordi Saludes in the Math Grammar Library
- Provide a single platform for developing and using embedded grammars
- Integration with ontology engineering tools


## Known issues

1. Interfaces/functors are currently not supported.
1. The in-editor validation often needs to be triggered by some keystrokes, especially when Eclipse laods
with some already-opened files.


## Other remarks

1. Interface decisions such as icons were made reltively hastily and may not be entirely suitable or intuitive.
This will get better as the plugin gets used by more users (and provide feedback).
1. A wiki or bug tracker may be set up if there is enough usage feedback to justify it.

--------------------------------------------------------------------------------

# Installation & Updating

## Requirements

1. The plugin was developed using Eclipse 3.7, and has **not** been tested with older versions of Eclipse.
1. GFEP makes use of the newest GF features, and requires that **GF >= 3.3** is already installed on your system. Paths to GF must be set within the Eclipse plugin (meaning you don't necessarily need to have GF in your `PATH` environment variable).

## Installing the plugin for the first time

1. Inside Eclipse, go to **Help &rarr; Install New Software**.
1. Add new software site using the URL: http://www.grammaticalframework.org/eclipse/release/
1. Select the **GF Eclipse Plugin**, click Next, accept the license agreement and install.
1. Accept the prompt warning that the software is unsigned.
1. Restart Eclipse when prompted.

### Customizing
1. Add the GF perspective by clicking **Open Perspective &rarr; Other** and choosing **GF**.
1. Set your paths to the GF executable and libraries by going to **Window &rarr; Preferences &rarr; Grammatical Framework**.  
_The runtime path is assumed to be `~/.cabal/bin/gf`, which may be wrong depending on your
system and how you installed GF._  
_The library path should get automatically set from your environment's `GF_LIB_PATH` variable._


## Updating the plugin

1. In Eclipse, go to **Help &rarr; Check for updates**.
1. Any available updates will appear in the dialog. Select them and follow the usual steps.

--------------------------------------------------------------------------------

# Getting started

- Create a new **GF Project**.

![New project wizard](http://www.grammaticalframework.org/eclipse/images/eclipse-projectwizard-1.png)
![New project wizard](http://www.grammaticalframework.org/eclipse/images/eclipse-projectwizard-2.png)

- Create some new modules using the **GF Module** wizard from **File > New > Other > GF Module**:

![New module wizard](http://www.grammaticalframework.org/eclipse/images/eclipse-modulewizard-1.png)

_If asked whether you want to add the **Xtext nature** to your project, you can safely say _no_ (this prompt has been removed in the most recent version of GFEP)._

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

--------------------------------------------------------------------------------

# Feedback

As part of the evaluation of the GF Eclipse Plugin, feedback (both negative and positive) on the following would be appreciated:

1. Issues encountered with installation
1. Compatibilities / conflicts with other Eclipse plugins
1. Lack of (or incorrect) support of GF syntactic constructs, module hierarchy system
1. Performance issues (speed, resources footprint)
1. General intuitiveness of the UI
1. Feature wish-list
