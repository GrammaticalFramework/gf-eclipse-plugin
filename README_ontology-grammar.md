# GF Ontology Grammar Plugin for Eclipse

This project is developed in Ontotext as a part of the MOLTO Project's WP2.

It is an Eclipse plugin that is part of the [Grammatical Framework plugin for Eclipse (GFEP)](http://www.grammaticalframework.org/eclipse/) but can be installed and used on its own.
The GF Ontology Grammar Plugin provides a GUI for calls to the MOLTO Repository Helper projects' code.
It is under the form of a wizard that leads a user to create abstract, concrete and SPARQL **GF grammar**, based on user-friendly templates that are filled in with repository entities by the user.
The wizard connects to a SPARQL endpoint and uses the ontology provided by it.
Then the user has to provide a specific templates file.
Next, pages for filling the templates are available.
Finally, the user is prompted to export the grammars created from the templates.
The exported grammars can then be edited by the GF Eclipse plugin.

## Developer notes

The code of the plugin is publicly available at Github in two places:

- The [main GFEP repository](https://github.com/GrammaticalFramework/gf-eclipse-plugin/tree/master/workspace/org.grammaticalframework.eclipse.ontology-grammar) which contains code used in the released version of the plugin.
- The forked [GF Ontology Grammar Plugin repository](https://github.com/mmateva/gf-eclipse-plugin/tree/master/workspace/org.grammaticalframework.eclipse.ontology-grammar) which contains the most up-to-date code.

### Git notes
To see how to install `git`, check out [this](https://help.github.com/articles/set-up-git) page.
To "checkout" the project as read-only, you just need to perform:

    git clone https://github.com/mmateva/gf-eclipse-plugin/

If you would like to contribute to the project at Github, [create a Github account](https://github.com/signup/free) and follow the instructions [here](https://help.github.com/articles/generating-ssh-keys).
A basic Git explanation is introduced on [this page](http://scottr.org/presentations/git-in-5-minutes/). Generally, all you need is on the Github help pages.

### Importing and using the project in Eclipse

We will refer to the project's home(Git's checkout directory) as `$GFEP_HOME`.
Basically, what you need to do is create an Eclipse workspace(can be the default one), and in the Project Explorer perform **Import &rarr; General &rarr; Existing Project into Workspace**, then via the file browser select the folder

    $GFEP_HOME/gf-eclipse-plugin/workspace

The result is that you get (currently) six projects that you can import in your Eclipse workspace. The one that is described in this manual is `org.grammaticalframework.eclipse.ontology-grammar`.
You can optionally import the rest as well, they are part of the more general [GF Eclipse plugin](http://www.grammaticalframework.org/eclipse/).

After you have imported the plugin project, you can directly run it in Eclipse.
Just select the `plugin.xml` file in the Project Explorer, right-click it, and **Run As &rarr; Eclipse Application**.

Eclipse will run another Eclipse within itself, with its own classpath and Running Configuration.
The VM parameters are defined through **Run As &rarr; Run Configuration**, all the rest is described via the plugin's `plugin.xml`, `build.properties`, `Manifest.MF`; [details on these](http://help.eclipse.org/indigo/index.jsp?topic=%2Forg.eclipse.platform.doc.isv%2Fguide%2Fdialogs_wizards_newWizards.htm).
The "child" Eclipse instance has the GF Ontology Grammar Plugin installed.
You can start the plugin from it.
See below how to Run the plugin in Eclipse.

### Eclipse plugins
Eclipse plugins are very well organized standalone modules that can be added to the Eclipse IDE and serve for various purposes.
Generally, they are any java code that is bound to the Eclipse IDE through extension points.
The two most important descriptor files are the plugin.xml and the Manifest.MF. Eclipse PDT provides a handy editor for them.
More about writing Eclipse plugins can be found at Eclipse Plugins Developer's guide and on this tutorial.

## User guide

### Import the plugin

_Currently the plugin is not available for download from the Eclipse Plugin management pages. Hopefully, It will be soon._

### Run the plugin in Eclipse

_Eclipse 3.7 or above is recommended_

#### 1. Open the wizard
Navigate to **File &rarr; New &rarr; Other...** (or use Ctrl+N) from the Eclipse GUI.
Write "gf" in the search box, or scroll down to the "Grammatical Framework" category.
Select "GF Ontology Grammar Wizard".

![New project wizard](http://www.grammaticalframework.org/eclipse/images/ontology-new-wizard.png)

#### 2. Connect to endpoint
Provide a SPARQL endpoint to be connected to(ontology repository).  
**Note:** do not forget to explicitly add the port number in the address.  
After the username and password are populated, use the "Connect" button to verify the connection is successful.

![Connect to endpoint](http://www.grammaticalframework.org/eclipse/images/ontology-connect.png)

#### 3. Provide a templates file
Select a templates from the file system.
An example for such a file is provided in the resources folder of the plugin.

![Connected to endpoint](http://www.grammaticalframework.org/eclipse/images/ontology-connect-success.png)

It is automatically validated, but you can still use the "Validate template" button to check if it is valid.
Then you can proceed to the next page via the "Next" button.

#### 4. Select a template from the list
Select a single template from the list - as on the screenshot.
The binding in square brackets, e.g. [CLASS\_INSTANCE], [CLASS\_NAME], will be populated on the next page.

![Select template](http://www.grammaticalframework.org/eclipse/images/ontology-template-select.png)

#### 5. Fill the templates
On the page for entities selection, currently one has "Classes" and "Instances".
The instances on the left are the corresponding ones to the classes on the right(they are the instances of the selected class).
If a class has no instances, then an [EMPTY LIST] note is shown.
The template is automatically populated with a matching binding when one is selected(see the screenshot below).

![Fill in template](http://www.grammaticalframework.org/eclipse/images/ontology-template-fill.png)

_If you constantly get the "LOADING" sign in the Instances box, you might need to consider a better connection speed to your SPARQL endpoint._

#### 6. Add templates
Use the "Add Template" button to add new templates.

![Add template](http://www.grammaticalframework.org/eclipse/images/ontology-template-add.png)

Also, you can "Reset" the template, to see the binding type that is populated.

When enough templates, you can either continue with adding new template patterns("Select more templates"), or save the grammar created to a file("Export Grammar").
The first option actually brings to 4.

#### 7. Export Grammars
The grammar exportpage simply gives you the opportunity to choose where to store the ontology grammar files.
After selecting the destination, you need to press the "Export Grammar" button.

![Export grammar](http://www.grammaticalframework.org/eclipse/images/ontology-export-grammar.png)

This will create the following three grammar files in the destination folder:

- `Abstract<GrammarName>.gf` - abstract ontology grammar that was created
- `Concrete<GrammarName>.gf` - concrete ontology grammar that was created
- `<GrammarName>SPARQL.gf` - SPARQL query grammar that was created

## MOLTO Repository Helper project

The MOLTO Repository Helper is developed in Ontotext, also as part of the Molto project.
It provides an API for creation of abstract, concrete and SPARQL GF grammars.
They are based on user-friendly templates that are filled in with repository entities.
