(set-info :smt-lib-version 2.6)
(set-logic QF_S)
(set-info :source |
Generated by: Murphy Berzish, Mitja Kulczynski, Federico Mora, Florin Manea, Joel Day, Dirk Nowotka, Vijay Ganesh, Zhengyang Lu
Generated on: 2020-10-01
Description: Translated from a collection of real-world regex queries, AutomataArk, collected by Loris D’Antoni and Fang Wang: https://github.com/lorisdanto/automatark
Application: Evaluate solvers on real-world regex queries
Target solver: Z3str3RE, CVC4, OSTRICH, Z3seq, Z3str3, Z3-Trau
Publications: Berzish, M., Kulczynski, M., Mora, F., Manea, F., Day, J. D., Nowotka, D., & Ganesh, V. (2021, July). An SMT solver for regular expressions and linear arithmetic over string length. In CAV 2021.
|)
(set-info :license "https://creativecommons.org/licenses/by/4.0/")
(set-info :category "industrial")
(set-info :status sat)

(declare-const X String)
(assert (not (str.in_re X (re.union (re.++ (re.+ (re.range "0" "9")) (str.to_re "-") (re.+ (re.range "0" "9"))) (re.++ (re.+ (re.range "0" "9")) (str.to_re "\u{a}"))))))
(assert (not (str.in_re X (re.++ ((_ re.loop 4 4) (re.union (str.to_re "6") (str.to_re "0") (str.to_re "1"))) ((_ re.loop 12 12) (re.range "0" "9")) (str.to_re "\u{a}")))))
(assert (not (str.in_re X (re.++ (re.range "2" "5") (re.union (str.to_re "2") (str.to_re "4") (str.to_re "6") (str.to_re "8") (str.to_re "0")) (re.union (re.++ (str.to_re "A") (re.opt (str.to_re "A"))) (str.to_re "B") (str.to_re "C") (re.++ (str.to_re "D") (re.opt (re.++ (str.to_re "D") (re.opt (str.to_re "D"))))) (str.to_re "E") (str.to_re "F") (str.to_re "G") (str.to_re "H")) (str.to_re "\u{a}")))))
(check-sat)

(exit)
