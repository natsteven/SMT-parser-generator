#!/bin/bash

cd src/main/java/edu/boisestate/cs/antlrTools/

/usr/lib/jvm/java-21-openjdk-amd64/bin/java -jar antlr-4.13.1-complete.jar -Dlanguage=Java SMTLIBv2Strings.g4

for file in SMTLIBv2Strings*.java; do
  sed -i '1s/^/package edu.boisestate.cs.antlrTools;\n/' "$file"
done