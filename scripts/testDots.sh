#!/bin/bash

# Recursively navigate through directories and subdirectories
for file in $(find ~/antlr/SMTLIBv2Strings/current/output_reporting -name '*.json')
do

  # Run your Java program 
  java -cp ./target/string-constraint-solvers-1.0-SNAPSHOT-jar-with-dependencies.jar edu.boisestate.cs.util.DotGenerator "$file" 

  # Remove the file extension from $file
  filename=$(basename "$file")
  filename="${filename%.*}"
  echo "$filename"
  # Generate the PNG file using dot command
  dot -Tpng ./temp/"$filename"-graph.dot -o ~/antlr/SMTLIBv2Strings/current/DOTS/"$filename".png
done

