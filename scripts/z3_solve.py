import sys
import time
from z3 import *

def sat_smt_query(smt_path):
    with open(smt_path, "r") as f:
        smt_query = f.read()
    solver = Solver()
    solver.from_string(smt_query)
    try:
        result = solver.check()
    except:
        return None
    if result == sat:
        model = solver.model()
        return result, model
    elif result == unsat:
        return result, None
    else:  # result == unknown
        return None, None
    
if len(sys.argv) != 2:
    print("Usage: python3 z3_solve.py <path_to_smt2_file>")
    sys.exit(1)

smt_file_path = sys.argv[1]

start_time = time.perf_counter()
sat, model = sat_smt_query(smt_file_path)
elapsed = time.perf_counter() - start_time

result = sat, model, int(elapsed*1000)

print(str(result))