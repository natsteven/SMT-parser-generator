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
(set-info :status unsat)

(declare-const X String)
(assert (str.in_re X (re.++ (re.+ (re.range "0" "9")) (re.opt (re.++ (str.to_re ",") ((_ re.loop 1 2) (re.range "0" "9")))) (str.to_re "\u{a}"))))
(assert (not (str.in_re X (re.++ (str.to_re "\u{5c}red") (re.union (re.++ (re.opt (re.union (str.to_re "0") (str.to_re "1"))) (re.range "0" "9") (re.opt (re.range "0" "9"))) (re.++ (str.to_re "2") (re.range "0" "4") (re.range "0" "9")) (re.++ (str.to_re "25") (re.range "0" "5"))) (str.to_re "\u{5c}green") (re.union (re.++ (re.opt (re.union (str.to_re "0") (str.to_re "1"))) (re.range "0" "9") (re.opt (re.range "0" "9"))) (re.++ (str.to_re "2") (re.range "0" "4") (re.range "0" "9")) (re.++ (str.to_re "25") (re.range "0" "5"))) (str.to_re "\u{5c}blue") (re.union (re.++ (re.opt (re.union (str.to_re "0") (str.to_re "1"))) (re.range "0" "9") (re.opt (re.range "0" "9"))) (re.++ (str.to_re "2") (re.range "0" "4") (re.range "0" "9")) (re.++ (str.to_re "25") (re.range "0" "5"))) (str.to_re ";\u{a}")))))
(assert (str.in_re X (re.++ (str.to_re "/filename=") (re.* (re.comp (str.to_re "\u{a}"))) (str.to_re ".ppt/i\u{a}"))))
(assert (not (str.in_re X (re.++ (str.to_re "/?id=") ((_ re.loop 20 20) (re.union (re.range "A" "Z") (re.range "0" "9"))) (str.to_re "&cmd=img/U\u{a}")))))
(assert (not (str.in_re X (re.++ (str.to_re "\u{a}on") (re.union (str.to_re "blur") (re.++ (str.to_re "c") (re.union (str.to_re "hange") (str.to_re "lick"))) (str.to_re "dblclick") (str.to_re "focus") (str.to_re "keypress") (re.++ (re.union (str.to_re "key") (str.to_re "mouse")) (re.union (str.to_re "down") (str.to_re "up"))) (re.++ (re.opt (str.to_re "un")) (str.to_re "load")) (re.++ (str.to_re "mouse") (re.union (str.to_re "move") (re.++ (str.to_re "o") (re.union (str.to_re "ut") (str.to_re "ver"))))) (str.to_re "reset") (re.++ (str.to_re "s") (re.union (str.to_re "elect") (str.to_re "ubmit"))))))))
(check-sat)

(exit)
