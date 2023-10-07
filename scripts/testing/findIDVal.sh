#!/bin/bash

# Parse the first JSON file and extract ID and input values
ids=()
inputs=()

while read -r line; do
  if [[ "$line" =~ "\"ID\" : ([0-9]+)," ]]; then
    id="${BASH_REMATCH[1]}"
    ids+=("$id")
  elif [[ "$line" =~ "\"input\" : \"([^\"]*)\"," ]]; then
    input="${BASH_REMATCH[1]}"
    inputs+=("$input")
  fi
done < file1.json

# Iterate through the extracted IDs and inputs
for ((i = 0; i < ${#ids[@]}; i++)); do
  id="${ids[$i]}"
  input="${inputs[$i]}"
  
  # Search for the corresponding value in the second JSON file
  value=$(grep -Po '"id" : \s*\K[0-9]+' file2.json | paste -d ' ' - <(grep -Po '"actualValue" : \s*"\K[^"]+' file2.json) | grep "$id" | awk -F ' ' '{print $2}')
  
  # Output the result
  echo "ID: $id, Input: $input, Corresponding Value: $value"
done
