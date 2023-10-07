# GenJSONs

This program takes a directory of .smt2 files and converts them to a format compatible with the Extended Java String Analyser. 

## Background

The grammar used by antlr to generate the base parser is SMTLIBv2Strings.g4 in main.

The MainJSON class is what will output respective .json files in an 'output_{input_directory}' folder
This mainly uses the jsonBuilder utility to parse the .smt2 file and then walk it's syntax tree to create the .json

The Main class can be used to generate dot files and pngs for the syntax tree of specified directories for debugging/visualization

## Usage
You will want to run `mvn clean install` to make sure you have all the dependencies. 

To generate jsons from a directory with .smt2 files you have a couple options. You can place the directory in the root of the project and then adjust the pom.xml for Maven to include the directory name as an argument. At the bottom in the exec-maven-plugin simply change the the argument parameter. Then you can run `mvn exec:java` in the root directory of the project and a new directory 'output_{your_directory}' will be created with the same directory stucture and all the .smt2 files converted to JSONs. Alternatively you could run `java -cp target/GenJSONs-1.0-SNAPSHOT.jar edu.boisestate.cs.MainJSON path/to/your/directory` assuming you are in the root of the project.\

Furthermore, there are a couple scripts that can be used for debugging and testing. You will need to adjust both of these scripts to have the paths for the json files you are testing and the path to the directory with EJSA. Currently they are set up to run from the root of an EJSA directory but isn't necessary. testDots.sh can output dot graphs that show what your .json files look like, and testJSON.sh will actually run them through the solver and output to a log file. This is set up for the base SAT JSA solver to split failure's and sucesses based on its specific output format, so using other modes for the solver will almost always output everything to the fail log though that is still helpful.