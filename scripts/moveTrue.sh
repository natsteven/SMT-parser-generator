#!/bin/bash

# Define the input file and directories
input_file="report.json"
input_directory="/home/nathanael/Documents/SMT_to_JSON/GenJSONs/false_negatives/still"
output_directory="/home/nathanael/Documents/SMT_to_JSON/GenJSONs/false_negatives/at12"

# Create the output directory if it doesn't exist
mkdir -p "$output_directory"

# Use jq to parse the JSON file and get the keys (filenames) where the value is "true"
jq -r 'to_entries[] | select(.value == true) | .key' "$input_file" | while read -r filename; do
    find "$input_directory" -type f -name "${filename}.smt2.json" -exec mv {} "$output_directory/" \;
    echo "Moved ${filename}.smt2.json to $output_directory/"
done

echo "Done!"
