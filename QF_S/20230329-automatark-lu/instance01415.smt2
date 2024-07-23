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
(assert (not (str.in_re X (re.++ (re.union (re.++ (str.to_re "00") (re.range "1" "9")) (re.++ (str.to_re "0") (re.range "1" "9") (re.range "0" "9")) (re.++ (re.range "1" "7") (re.range "0" "9") (re.range "0" "9")) (re.++ (str.to_re "7") (re.range "0" "7") (re.range "0" "2")) (re.++ (str.to_re "77") (re.range "0" "2"))) ((_ re.loop 6 6) (re.range "0" "9")) (re.union (str.to_re "A") (re.++ (str.to_re "B") (re.union (re.opt (re.range "1" "9")) (str.to_re "A") (str.to_re "D") (str.to_re "G") (str.to_re "H") (str.to_re "J") (str.to_re "K") (str.to_re "L") (str.to_re "N") (str.to_re "P") (str.to_re "Q") (str.to_re "R") (str.to_re "T") (str.to_re "W") (str.to_re "Y"))) (re.++ (str.to_re "C") (re.union (re.range "1" "9") (re.range "A" "Z"))) (re.++ (str.to_re "D") (re.union (re.opt (re.range "1" "9")) (str.to_re "A") (str.to_re "C") (str.to_re "D") (str.to_re "G") (str.to_re "H") (str.to_re "J") (str.to_re "K") (str.to_re "L") (str.to_re "M") (str.to_re "N") (str.to_re "P") (str.to_re "Q") (str.to_re "R") (str.to_re "S") (str.to_re "T") (str.to_re "V") (str.to_re "W") (str.to_re "X") (str.to_re "Y") (str.to_re "Z"))) (re.++ (str.to_re "E") (re.union (re.opt (re.range "1" "9")) (str.to_re "A") (str.to_re "B") (str.to_re "C") (str.to_re "D") (str.to_re "F") (str.to_re "G") (str.to_re "H") (str.to_re "J") (str.to_re "K") (str.to_re "M"))) (re.++ (str.to_re "F") (re.range "1" "8")) (re.++ (str.to_re "J") (re.range "1" "4")) (re.++ (str.to_re "K") (re.union (re.range "1" "9") (str.to_re "A") (str.to_re "B") (str.to_re "C") (str.to_re "D") (str.to_re "E") (str.to_re "F") (str.to_re "G") (str.to_re "H") (str.to_re "J") (str.to_re "L") (str.to_re "M"))) (re.++ (str.to_re "T") (re.opt (re.union (str.to_re "A") (str.to_re "B") (str.to_re "C") (str.to_re "D") (str.to_re "E") (str.to_re "F") (str.to_re "G") (str.to_re "H") (str.to_re "J") (str.to_re "K") (str.to_re "L") (str.to_re "M") (str.to_re "N") (str.to_re "P") (str.to_re "Q") (str.to_re "R") (str.to_re "S") (str.to_re "T") (str.to_re "U") (str.to_re "V") (str.to_re "W") (str.to_re "X") (str.to_re "Y") (str.to_re "Z") (str.to_re "2")))) (str.to_re "M") (re.++ (str.to_re "W") (re.union (re.opt (re.range "1" "9")) (str.to_re "B") (str.to_re "C") (str.to_re "F") (str.to_re "G") (str.to_re "J") (str.to_re "R") (str.to_re "T")))) (str.to_re "\u{a}")))))
(check-sat)

(exit)
