(set-info :smt-lib-version 2.6)
(set-logic QF_S)
(set-info :source |
Generated by: Andrew Reynolds
Generated on: 2020-02-27
Generator: CVC4
Application: Testing of string solvers
Target solver: CVC4
|)
(set-info :license "https://creativecommons.org/licenses/by/4.0/")
(set-info :category "random")
(set-info :status unknown)
(declare-fun x () String)
(assert (let ((_let_0 (str.to_re "C"))) (let ((_let_1 (str.to_re (str.++ "C" (str.++ "C" "C"))))) (let ((_let_2 (str.in_re x (re.++ (re.* re.allchar ) re.allchar  (re.* re.allchar ) (str.to_re (str.++ "C" "C")) (re.* re.allchar ) (str.to_re (str.++ "C" "C")) (re.* re.allchar ))))) (and (not (= _let_2 (str.in_re x (re.++ (re.* re.allchar ) re.allchar  (re.* re.allchar ) _let_0 (re.* re.allchar ) _let_1 (re.* re.allchar ))))) (not (= (str.in_re x (re.++ (re.* re.allchar ) re.allchar  (re.* re.allchar ) _let_1 (re.* re.allchar ) _let_0 (re.* re.allchar ))) _let_2)))))))
(check-sat)
(get-model)
(exit)
