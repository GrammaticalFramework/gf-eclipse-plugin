<html>
<head>
<title>GF Eclipse Plugin</title>
<link rel="stylesheet" type="text/css" href="http://www.grammaticalframework.org/css/style.css" />
<meta name="viewport" content="width=device-width" />
</head>
<body>


# The GF Eclipse Plugin

John J. Camilleri  
Updated: 12 April 2013

_The research leading to these results has received funding from the European Union's Seventh Framework Programme (FP7/2007-2013) under grant agreement no. FP7-ICT-247914 (the [MOLTO Project](http://www.molto-project.eu/))._

## Introduction

The aim behind developing a desktop IDE for GF is to provide more powerful tools than may be possible and/or practical in a web-based environment (the [GF Web IDE](http://www.grammaticalframework.org/demos/gfse/)). In particular, the ability to resolve identifier cross-references and browse external libraries quickly during development time is one of the primary motivations for the project.

The choice was made to develop this desktop IDE as a plugin for the Eclipse Platform as it emerged as the most popular choice among the GF developer community. Support for the platform is vast and many tools for adapting Eclipse to domain-specific languages already exist. Unlike the zero-click Web IDE approach, using the GF Eclipse plugin requires some manual installation and configuration on the development machine.

### License

The GF Eclipse Plugin is open-source under the **[GNU General Public License (GPL)](http://www.gnu.org/licenses/gpl-3.0.txt)**.  
_The licenses that cover the rest of GF are listed [here](http://www.grammaticalframework.org/LICENSE)._
_Xtext and Eclipse are released under the [Eclipse Public License (EPL)](http://www.eclipse.org/legal/epl-v10.html)._

### Links

- This document shall contain all collected information about the plugin. The most up-to-date version of this file can always be found [here](https://github.com/GrammaticalFramework/gf-eclipse-plugin/blob/master/README.md)
- This documentation is also available at the [GF website](http://www.grammaticalframework.org/eclipse/) and the [MOLTO Project Wiki](http://www.molto-project.eu/node/1395).
- Source code repository is at [github.com/GrammaticalFramework/gf-eclipse-plugin](https://github.com/GrammaticalFramework/gf-eclipse-plugin)
- For reporting bugs and requesting features, please use the [GitHub Issue Tracker](https://github.com/GrammaticalFramework/gf-eclipse-plugin/issues)
- Here are some [example GF projects](https://github.com/GrammaticalFramework/gf-eclipse-plugin/tree/master/workspace-demo/GF%20Project) for testing out the plugin features.
- Software update site URL for installing through Eclipse: `http://www.grammaticalframework.org/eclipse/release/`

### Publications

- [Poster](http://academic.johnjcamilleri.com/presentations/2012-05%20EAMT%20poster.pdf) at EAMT 2012 in Trento, Italy
- [Paper](http://academic.johnjcamilleri.com/papers/freerbmt2012.pdf) presented at FreeRBMT 2012 in Gothenburg, Sweden.

## Features

- Syntax highlighting and error detection
- Code folding, quick block-commenting, automatic code formatting
- Definition outlining, jump to declaration, find usage
- Warnings for problems in module dependency hierarchy
- Launch configurations, i.e. compilation directly from IDE
- Use GF Shell from within Eclipse
- Auto-completion for declared identifiers
- Background compilation (shallow) using project builder
- Support for _Open Declaration_ (F3), including qualified names
- Code generation for new languages in application grammars
- Inline documentation for function calls, overloads
- Proper cross-reference handling with qualified names
- Test management and testing tool
- External library browser

## Release history

**12/04/13**
: (1.5.3.x) Update for Xtext 2.3.1 / Eclipse 4.2 / JavaSE 1.6. Performance improvements with scoping.

**22/02/13**
: (1.5.2.x) New option for specifying include/exclude build files. Progress indicators during build.

**12/06/12**
: (1.5.1.x) Support for scoping when library sources not available. Performance and implementational improvements to External Library View.

**19/04/12**
: (1.5.0.x) Removed need for `.gfexternal` folder. Much improved "External Libraries" view allows you to search in current scope. Memory usage improvements in scoping implementation. Validation now occurs on file open. Re-added GF Library Path field in preferences.

**04/04/12**
: (1.4.3.x) Improvements to the Test Manager. Added support for arbitrary commands in launch. Made the license information clearer.

**22/03/12**
: (1.4.2.x) Added wizard for context-free grammars (no syntax support, though). Context-menu option for toggling the GF Nature and Builder together. Test Manager now parses languages & parameters, and includes filtering and toggling options.

**14/03/12**
: (1.4.1.x) GF source files can now be anywhere in project, not necessarily at top level.

**06/03/12**
: (1.4.0.x) Test manager view. Updated launch configurations. UI improvements, new icons. Inline contextual documentation. Correct resolution of qualified identifiers. Bug fixes and some refactoring.

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
: Third BETA (1.1.0.x) released, overhauled to take advantage of new compiler features. Tag-based scoping with caching for better performance. Interactive console (GF Shell) for launch configs.

**11/10/11**
: Second BETA (1.0.0.x) released, with improved support for qualified names, local variable bindings, selective inheritance, module outlining, and launch configurations. Also new GF Project type.

**01/10/11**
: Initial BETA released.


<!----------------------------------------------------------------------------->

## Installation &amp; updating

### System requirements

1. [Eclipse](http://www.eclipse.org/downloads/) 3.6 or above.
1. [GF 3.3.3](http://www.grammaticalframework.org/download/release-3.3.3.html) or above. The path to GF must be set within the plugin preferences (see below).

Using the GF Resource Grammar Library requires that the RGL binaries are also installed on your system.
If you are using the [pre-compiled binaries](http://www.grammaticalframework.org/download/index.html) but have separately downloaded the RGL sources to your system, you can optionally specify this path in the plugin preferences (see below).

### Installing the plugin for the first time

#### Available Software Sites

In order for dependencies to be satisfied, you need to ensure that your Eclipse has the following update site URLs set:

- Eclipse releases (change version name to match): `http://download.eclipse.org/releases/indigo`
- Xtext: `http://download.eclipse.org/modeling/tmf/xtext/updates/composite/releases/`

You can set these from **Preferences &rarr; Install/Update &rarr; Available Software Sites**.

#### Eclipse preferences

How to find the **Eclipse preferences** window depends on your Eclipse version and/or OS, and may be either of:

- **Window &rarr; Preferences**
- **Eclipse &rarr; Preferences**

### Installation

1. Inside Eclipse, go to **Help &rarr; Install New Software**.
1. Add new software site using the URL: `http://www.grammaticalframework.org/eclipse/release/`
1. Select the **GF Eclipse Plugin**, and make sure the **Contact all update sites during install to find required software** option is checked.
1. Click Next, accept the license agreement and install.
1. Accept the prompt warning that the software is unsigned.
1. Restart Eclipse when prompted.

#### Settings &amp; preferences

1. Add the GF perspective by clicking **Window &rarr; Open Perspective &rarr; Other** and choosing **GF**.
1. Open the plugin settings by going to **Preferences &rarr; Grammatical Framework** (image below).
1. The plugin will try to determine the path to your GF executable automatically, but this may need to be corrected.  
The path should include the name of the GF binary itself, e.g. `/home/john/.cabal/bin/gf` or `C:\Users\John\GF\bin\gf.exe`.
1. The _Additional path directive_ setting can be used if you want to avoid writing `--# -path=...` directives in your source files. By default it is set to `.:alltenses:prelude`, but can also be left blank. This is passed to GF using the `--path` flag.
1. If you are using a pre-compiled version of the Resource Grammar Library (i.e. you didn't build it from source yourself) but you have the sources available on your system, then you can enter their path in the _Library source path_ setting. This is optional and is only used for jumping to source definitions.  
You should enter an absolute system path, up to and including the `src` folder, e.g. `/home/john/GF/lib/src/` or `C:\Users\John\GF\lib\src\`.
1. You can also adjust the verbosity level of the GFEP console log in the preferences window.

![Plugin preferences window](https://raw.github.com/GrammaticalFramework/gf-eclipse-plugin/master/doc/images/eclipse-preferences.png)

### Updating the plugin

1. In Eclipse, go to **Help &rarr; Check for updates**.
1. Any available updates will appear in the dialog. Select them and follow the usual steps.

_Note:_ You will probably want to uncheck the **Contact all update sites during install to find required software** option, which is not usually needed when simply updating the plugin (it makes things go a lot slower).

#### Deprecations

- Any folders `.gfexternal` can safely deleted as of GFEP &ge; 1.5. Using Eclipse's **Clean** function from the **Run** menu will do this for you automatically.
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

#### Specifying build files

As of GFEP &ge; 1.5.2, you are now able to explicitly a set of modules in your GF project which should be either included or excluded
from the build process.
In the inclusive case, this would normally contain your "top-level" modules. This can be done right-clicking on your project in the Project Explorer and choosing **Properties &rarr; GF Build Settings**. From here you simply tick which modules in your project the GF builder should compile:

![Project-specific build settings](https://raw.github.com/GrammaticalFramework/gf-eclipse-plugin/master/doc/images/eclipse-project-build-settings.png)

When doing this, GFEP will never attempt to compile any other files in the project. Whenever you add a new top-level module or change your module hierarchy, be sure to check these build settings again.

<!----------------------------------------------------------------------------->

## Getting started

Some steps you can follow to get a feel of of the plugin's features.

### Video tutorial

A quick run through of the major features available in the GF Eclipse Plugin.

<iframe src="http://player.vimeo.com/video/38768382?byline=0&amp;portrait=0" width="693" height="512" frameborder="0" webkitAllowFullScreen mozallowfullscreen allowFullScreen></iframe>

_If the video doesn't appear above, you can view it at [https://vimeo.com/38768382](https://vimeo.com/38768382)_

### The Eclipse _workspace_ and _project_ concepts
When you run Eclipse, it asks you to create or specify a _workspace_ on your system, which is essentially the top directory that Eclipse will "see". Any code you wish to work on inside Eclipse must reside in this workspace.
A workspace contains one or more _projects_, which may or may not be related to each other. Generally each folder under the top-level workspace directory is considered an individual project, i.e.:

    workspace/
        Project1/
            file1-1.gf
            file1-2.gf
        Project2/
            subdir2-1/
                file2-1-1.gf
                file2-1-2.gf
            file2-1.gf
            file2-2.gf

If you open an existing folder as your workspace in Eclipse, then your folders in that workspace **do not** automatically become Eclipse projects.
To do this, you must follow the "Create new GF Project" wizard below, and give your project the exact name of the existing folder (e.g. `Project1` or `Project2` in the example above.)

#### GF Nature
The _GF Nature_ is what makes a regular Eclipse project a _GF_ project.
If you create a new GF Project from scratch then you don't need to worry too much about them.
If you already have some project set up in your Eclipse workspace, then you will need to associate the builder with your project in order for all the GF goodness to work.
This will internally add the _GF Builder_ to your project also.

As of 1.4.2, this can be done very easily by right-clicking on your project in the explorer and clicking **Add/Remove GF Nature**.
If your project has the GF icon overlayed on it, then the GF nature and builder are correctly associated with it.

See the **project settings** section above if you want to mess with your `.project` file.

#### Metadata folders
GFEP will create the following metadata directories within your project:

- A `.gfbuild` directory in every folder containing GF source code, containing `.gf-tags` files created using the GF `--tags` compiler flag.

These can be removed manually at any time, as they will always be regenerated as necessary.
You will probably want to ignore these directories in your version control system.

### Create a new GF Project
If you have a folder in your workspace which you want to convert into a GF Project, then you can select it from the drop-down. This folder will then appear as an Eclipse project in your workspace.

![New project wizard](https://raw.github.com/GrammaticalFramework/gf-eclipse-plugin/master/doc/images/eclipse-projectwizard-1.png)
![New project wizard](https://raw.github.com/GrammaticalFramework/gf-eclipse-plugin/master/doc/images/eclipse-projectwizard-2.png)

### New module wizard
Use the **GF Module** wizard from **File &rarr; New &rarr; Other &rarr; GF Module**:

![New module wizard](https://raw.github.com/GrammaticalFramework/gf-eclipse-plugin/master/doc/images/eclipse-modulewizard-1.png)

You can find some small examples [here](https://github.com/GrammaticalFramework/gf-eclipse-plugin/tree/master/workspace-demo/GF%20Project). Download the files and manually add them to your Eclipse workspace to experiment with some of the plugin features.

### Clone module wizard
If you want to clone an existing module into a new language, you can now do so via the **Clone GF Module** wizard. This is also available as a context menu option in the **Project Explorer**, via **&lt;Right click&gt; &rarr; Grammatical Framework &rarr; Compile for new language**:

![Clone GF module to new language wizard](https://raw.github.com/GrammaticalFramework/gf-eclipse-plugin/master/doc/images/eclipse-clonewizard.png)

This will create and open a new module with the relevant replacements made. Note how in this case string constants are replaced by the empty string `""`. This wizard currently only works on `concrete` and `instance` modules.

![Newly cloned file](https://raw.github.com/GrammaticalFramework/gf-eclipse-plugin/master/doc/images/eclipse-clonewizard-newfile.png)

### Workbench editor layout
Use Eclipse' own features to drag and drop your editor tabs to suit your needs.

![The editor and outline view](https://raw.github.com/GrammaticalFramework/gf-eclipse-plugin/master/doc/images/eclipse-editor-general.png)

### Outline view
The **Outline** view in the bottom-left offers a quite overview of your module structure. Clicking any of the terms will make your cursor jump to that point in the file.

### Cross-referencing errors and warnings
Notice how changing a `cat` definition for example will produce warnings and/or errors in other the modules.

![Warnings and errors in the editor](https://raw.github.com/GrammaticalFramework/gf-eclipse-plugin/master/doc/images/eclipse-editor-cat.png)

### Validation
The in-editor validation sometimes needs to be triggered/updated by a keystroke. If you can still see errors which you believe should be correct, try adding a space character to ensure the validation is re-triggered.

Sometimes you may get an entire file marked with errors, even though in fact there is only a single error which is causing the internal builder to fail. In such cases referring to the **Problems** view should help you locate the cause. This issue is particularly relevant when changes made to one module may induce errors in its descendants (e.g. renaming a parameter in a resource module). This behaviour will hopefully be improved in future versions.

#### Builder
For validation to work correctly, the project's **Build Automatically** option should be turned on.
Each time you save a file (or some other change occurs in your project), the builder should get triggered which re-compiles any GF files which have changed. If the builder does not seem to get triggered, try to run a _clean_ via **Project &rarr; Clean...**

### Code formatting
Use the built-in code formatter to tidy your code automatically. Right-click in the editor and choose **Format** or use the keyboard shortcut **Ctrl+Shift+F**.

![Before auto-formatting](https://raw.github.com/GrammaticalFramework/gf-eclipse-plugin/master/doc/images/eclipse-before-format.png) ![After auto-formatting](https://raw.github.com/GrammaticalFramework/gf-eclipse-plugin/master/doc/images/eclipse-after-format.png)

### Syntax highlighting
You can change your syntax colouring styles as you wish from **Preferences &rarr; Grammatical Framework &rarr; Syntax Colouring**

![Syntax highlighting styles](https://raw.github.com/GrammaticalFramework/gf-eclipse-plugin/master/doc/images/eclipse-syntaxcoloring.png)

### Launch configurations
Set up a launch configuration from **Run &rarr; Run Configurations... &rarr; Grammatical Framework**. You will see the dialog below with some fields automatically filled in for you. 

![Launch configuration dialog](https://raw.github.com/GrammaticalFramework/gf-eclipse-plugin/master/doc/images/eclipse-launchconfig.png)

Run the launch config and you will see the output from the GF compiler in the console view within Eclipse.

![Output from the GF compiler](https://raw.github.com/GrammaticalFramework/gf-eclipse-plugin/master/doc/images/eclipse-compileroutput.png)

#### Run As... launch shortcut
Using the **Run &rarr; Run As &rarr; Compile with GF** shortcut will take the current selection or active editor and do one of two things:

1. If a launch configuration already exists which the current file in its _Source filenames_ field, then that config will be launch directly.
1. Otherwise, a new a launch configuration window is displayed where you will need to review and confirm the default settings before continuing.

### Consoles
The plugin provides its own console view named _GFEP Log_, which shows log messages based on the **Log Level** preference (**Preferences &rarr; Grammatical Framework**).

Additionally, every time a grammar is **Run** a _new_ console is opened to display the output. This console may also serve as the interactive GF Shell, depending on the **Interactive Mode** checkbox in your **Run Configuration**.

Eclipse does not make it obvious when multiple console windows open; click on the **Display Selected Console** button to switch between open consoles:

![Display Selected Console icon](https://raw.github.com/GrammaticalFramework/gf-eclipse-plugin/master/doc/images/eclipse-console-icon.png)

If the process associated with a console window has terminated, it will be indicated in the upper-left corner as below. Such console windows can then be closed using the grey cross button:

![Close terminated console icon](https://raw.github.com/GrammaticalFramework/gf-eclipse-plugin/master/doc/images/eclipse-console-terminated.png)

_The Eclipse console implementation does not support command history (up arrow) or auto-completion (tab)._

### _External Libraries_ view
This view is automatically populated with a list of all the external modules referenced by the current file. Double-clicking on any item provides a quick way of opening GF files which are imported into your grammar from outside your Eclipse project, for example the GF Resource Grammar Library.

This view also provides a text box for searching within the current module's scope, as shown in the image below. Clicking the small arrow on the right-hand side of the view provides options for case sensitive and/or regular-expression based search.

![External libraries view](https://raw.github.com/GrammaticalFramework/gf-eclipse-plugin/master/doc/images/eclipse-external-libraries.png)

### _Test Manager_ view
This feature works together with the launch configurations to make the process of running regression tests on your grammars quick and easy. As described in the [GF Book](http://www.grammaticalframework.org/gf-book/) (Section 10.5), the general development-test cycle (independent of GFEP) is as follows:

1. Create a file `test.trees` which contains a bunch of abstract syntax trees, which you want to test
1. Compile your grammar and linearise the trees one by one, using some command like `rf -lines -tree -file=test.trees | l -table | wf -file=test.trees.out`
1. Manually correct the output in `test.trees.out` and save it as your gold standard file `test.trees.gold`.
1. Each time you update your grammar, repeat step 2, then compare your new output against the gold standard using `diff` or some other comparison tool.

The **Test Manager** view follows this same pattern but provides a convenient graphical interface for running your test cases and also for looking at the output, just using a few clicks:

![Test Manager view](https://raw.github.com/GrammaticalFramework/gf-eclipse-plugin/master/doc/images/eclipse-test-manager.png)

Note that GFEP assumes the following convention:

| Extension                            | Description                                                                                       |
|--------------------------------------|---------------------------------------------------------------------------------------------------|
| `*.trees` or `*.sentences`           | Test input files: trees file (for testing linearisation) and sentences file (for testing parsing) |
| `*.trees.out` or `*.sentences.out`   | Corresponding output files (generated each time a test is run)                                    |
| `*.trees.gold` or `*.sentences.gold` | Corresponding gold standard files (manually corrected from an output file)                        |

### Logs
The GFEP writes to the Eclipse platform log. This can be accessed in two ways:

1. By opening the **Error Log** view in Eclipse
1. Accessing the file directly at `<workspace>/.metadata/.log`

You can set the log verbosity from **Preferences &rarr; Grammatical Framework**.


<!----------------------------------------------------------------------------->

## Common issues and fixes

### No identifiers are resolved and my log contains messages saying "File Syntax.gf does not exist."

In general, this means that something is wrong with your _library path_ setting.

GFEP attempts to compile all of your files individually with GF, which is not the usual way in which you would compile your grammar.
As a result, when looking for the RGL files, GF needs a little help via the `path` argument.

The normal way to do this is to specify the _Library path_ setting from  **Preferences &rarr; Grammatical Framework**, setting it to something like `.:alltenses:prelude` (this is the default setting). Note that these paths are relative to the true RGL directory, which GF should already be aware of. The value of this setting is passed to GF from GFEP using the `--path` flag.

The _Library path_ setting is the same for all your GF projects. If you want finer-grain control over the `path` compiler option then you should use compiler pragmas in your source files, e.g.:

    --# -path=.:alltenses:prelude

The advantage of this method is that the information is bound to the file, so you can freely compile your modules outside of GFEP without having to specify the path as a command line option to GF.
The disadvantage is that you need to specify such a pragma in every single file (at least if you want to continue to use the GFEP).

### Other strange behaviour

When things seem strange, the very first step is always to clean the project via **Project &rarr; Clean...**.
I only support the latest version of the plugin, so make sure you are up to date too.

If problems persist, please contact me or better yet file an issue on the GitHub issue tracker (see below).

<!----------------------------------------------------------------------------->

## Ontology Grammar plugin

For information about the Ontology Grammar plugin developed by Ontotext AD, please refer [here](https://github.com/GrammaticalFramework/gf-eclipse-plugin/blob/master/README_ontology-grammar.md).

<!----------------------------------------------------------------------------->

## For developers

### Project setup

In order to build/run the GFEP from source, you need to have the Xtext libraries available in your Eclipse workspace. You have two choices:

1. Download the Xtext libraries from <http://www.eclipse.org/Xtext/download/> and add them to your existing Eclipse instance
1. Download a release of Eclipse packaged together with Xtext from <http://xtext.itemis.com/xtext/language=en/36553/downloads>

In both cases make sure you get the correct version of Xtext (see below).
Once you have Xtext set up, you can clone the repository locally with the following command:

    git clone git://github.com/GrammaticalFramework/gf-eclipse-plugin.git
    
You can then add the projects under the `workspace` directory to your Eclipse workspace, by using the **File &rarr; Import...** wizard.
The individual projects are:

| Namespace                                           | Description                                                                                                                      |
|-----------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------|
| `org.grammaticalframework.eclipse.ui`               | Covers all UI aspects of the plugin. Depends on `org.grammaticalframework.eclipse` (but the opposite is not true).               |
| `org.grammaticalframework.eclipse.tests`            | Contains unit tests for the plugin. Not required for running the plugin.                                                         |
| `org.grammaticalframework.eclipse.ontology-grammar` | GF Ontology Grammar Plugin for Eclipse, developed separately by Ontotext AD.                                                     |
| `org.grammaticalframework.feature`                  | Feature project for the GF Eclipse Plugin. Exports `org.grammaticalframework.eclipse` and `org.grammaticalframework.eclipse.ui`. |
| `org.grammaticalframework.feature.ontology-grammar` | Feature project for the GF Ontology Grammar Plugin. Exports `org.grammaticalframework.eclipse.ontology-grammar`.                 |
| `org.grammaticalframework.updatesite`               | Update site project which exports both feature projects under the same category.                                                 |

#### Extra dependencies for unit testing project

The unit testing project (`org.grammaticalframework.eclipse.tests`) has an extra requirement for the library `org.eclipselabs.xtext.utils.unittesting`, which you will probably get complaints about when importing your projects into Eclipse.
You only need to worry about this if you want to run the unit tests; otherwise you can ignore these errors.
You can get more information about this library [here](http://code.google.com/a/eclipselabs.org/p/xtext-utils/wiki/Unit_Testing), or just install it in Eclipse directly using the following update site URL: <http://xtext-utils.eclipselabs.org.codespot.com/git.distribution/releases/unittesting-0.9.x/>

#### Xtext version

GFEP currently uses **Xtext 2.3.1**.

### Running from source

Once you have set up your projects (see above), you can run/debug the GFEP by following the steps [here](http://www.eclipse.org/Xtext/documentation/2_1_0/020-domainmodel-step-by-step.php#DomainmodelWalkThrough_7).
Note that this means you will be running _two_ instances of Eclipse simultaneously; the first debugging the second.

### Building plugin package

To package the GFEP sources as `.jar` files and install/update the GFEP in a separate Eclipse installation, do the following:

1. Open `site.xml` in the `org.grammaticalframework.updatesite` project with Eclipse's Site Manifest Editor (default).
2. **Synchronize** the feature versions with the update site project.
3. Click **Build All** and the necessary `.jar` files should be created/updated in the project's folder. These can then be copied, along with `site.xml` to any local or web directory, which becomes the "update site".

#### `artifacts.jar` and `contents.jar`

These are two meta-data files created by the update site project. However there are known issues with categories sporadically not working in update sites, and it seems that if you delete these 2 files then the problems are solved.
More about this can be found [here](http://ekkescorner.wordpress.com/2010/04/18/who-eats-the-categories-from-update-sites/).

#### Other notes

Some have mentioned than when opening the GFEP sources, under Linux, they needed to install the following:

    sudo apt-get install appmenu-gtk
    sudo apt-get install gtk2-engines-pixbuf


<!----------------------------------------------------------------------------->

## Evaluation &amp; feedback

Please try to use the plugin for developing your own GF projects and report any issues you come up against.
Feedback (both negative and positive) on the following would be appreciated:

1. Issues encountered with installation
1. Incorrect support of GF syntactic constructs, module hierarchy system
1. Performance issues (speed, resources footprint)
1. General intuitiveness of the UI
1. Feature wish-list
1. Compatibilities / conflicts with other Eclipse plugins

For all bug reports and feature requests, please use the [GitHub Issue Tracker](https://github.com/GrammaticalFramework/gf-eclipse-plugin/issues).


<!----------------------------------------------------------------------------->

## Appendix

### Module types

Description of the GF module types and their icons within the GF Eclipse Plugin.

| Icon                                                                                                                  | Description           | Notes                                                  |
|-----------------------------------------------------------------------------------------------------------------------|-----------------------|--------------------------------------------------------|
| ![](https://raw.github.com/GrammaticalFramework/gf-eclipse-plugin/master/doc/images/module-abstract.png)              | Abstract module       | `abstract Foods = {...}`                               |
| ![](https://raw.github.com/GrammaticalFramework/gf-eclipse-plugin/master/doc/images/module-concrete.png)              | Concrete module       | `concrete FoodsEng of Foods = {...}`                   |
| ![](https://raw.github.com/GrammaticalFramework/gf-eclipse-plugin/master/doc/images/module-resource.png)              | Resource module       | `resource ResFoods = {...}`                            |
| ![](https://raw.github.com/GrammaticalFramework/gf-eclipse-plugin/master/doc/images/module-interface.png)             | Interface             | `interface LexFoods = {...}`                           |
| ![](https://raw.github.com/GrammaticalFramework/gf-eclipse-plugin/master/doc/images/module-instance.png)              | Instance              | `instance LexFoodsEng of LexFoods = {...}`             |
| ![](https://raw.github.com/GrammaticalFramework/gf-eclipse-plugin/master/doc/images/module-functor.png)               | Functor               | `incomplete concrete FoodsI of Foods = {...}`          |
| ![](https://raw.github.com/GrammaticalFramework/gf-eclipse-plugin/master/doc/images/module-functor-instantiation.png) | Functor instantiation | `concrete FoodsEng of Foods = FoodsI with (...) {...}` |

### Build command

This is the GF command run by the builder:

    gf --v=0 --tags --output-dir=.gfbuild [--path=PATH] FILE


</body>
</html>
