import json
import sys

z3_sol = sys.argv[1]
ejsa_sol_path = sys.argv[2]
graph_path = sys.argv[3]

z3_sol = eval(z3_sol.replace('=', ':'))
# print(z3_sol, ejsa_sol_path, graph_path)

ejsa_sol_set = {}

with open(ejsa_sol_path, 'r') as ejsa_sol_file:
    ejsa_sol = json.load(ejsa_sol_file)

with open(graph_path, 'r') as graph_file:
    graph = json.load(graph_file)

for input in ejsa_sol['inputs']:
    sol_id = input['ID']
    sol_string = input['input']
    for vertex in graph['vertices']:
        if vertex['id'] == sol_id :
            sol_val = vertex['actualValue']
    ejsa_sol_set[sol_val] = sol_string

sum=0
# print(z3_sol, ejsa_sol_set)
if (ejsa_sol_set == {}):
    print(" , ")
    sys.exit(1)
for key in z3_sol:
    sum+=len(z3_sol[key]) - len(ejsa_sol_set[key])

print(ejsa_sol_set == z3_sol, ",", sum)