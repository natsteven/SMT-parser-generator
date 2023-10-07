import re
import json
import os

def find_false_TSAT(input_path, output_path):
    with open(input_path, "r") as file:
        lines = file.readlines()
    
    overwrite = False
    data = {}
    filename = None

    for line in lines:
        if line.startswith(".."):
            overwrite = False
            filename = os.path.basename(line.strip()).replace(".smt2.json", "").replace(".smt2.copy.json", "")
            if filename in data and data[filename]:
                overwrite = True
            data[filename] = True
        if line[0].isdigit():
            line_array = re.split(r"\s+", line.strip())
            if line_array[2] == "false" and not overwrite:
                data[filename] = False

    with open(output_path, "w") as file:
        json.dump(data, file, indent=4)

# List of input files with the same format
# input_files = ["success_log_sygus.txt", "success_log_woorpje.txt", "success_log_slog.txt"]  

# for input_file in input_files:
input_path = "/home/nathanael/Documents/SMT_to_JSON/GenJSONs/scripts/success_log.txt"
    
    # Create the output file name based on the input file name
output_file = "/home/nathanael/Documents/SMT_to_JSON/GenJSONs/scripts/report.json"
    
    # Process the input file and generate the JSON report
find_false_TSAT(input_path, output_file)
