#!/bin/bash

# Usage: ./GetStringFunctions.sh <directory> <output file>

if [ -z "$1" ] || [ -z "$2" ]; then
  echo "Usage: $0 <directory> <output file>" >&2
  exit 1
fi

directory=$1
output=$2

rm "$output" 2>/dev/null

# Count the total number of relevant JSON files
total_files=$(find "$directory" -name "*.json" | grep -v "copy" | wc -l)
processed_files=0

echo "Processing $total_files files..."

find "$directory" -name "*.json" | while read -r file; do
  if [[ "$file" == *"copy"* ]]; then
    continue
  fi
  java -cp target/GenJSONs-1.0-SNAPSHOT-jar-with-dependencies.jar edu.boisestate.cs.utils.GetStringFunctions "$file" >> "$output"
  echo "" >> "$output"

  ((processed_files++))
  # Clear the line and display the progress
  echo -ne "\rProcessed $processed_files out of $total_files files."
done

echo -e "\nProcessing complete."