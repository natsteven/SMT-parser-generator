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
(assert (not (str.in_re X (re.++ ((_ re.loop 1 1) (re.union (re.++ (re.range "0" "1") (re.range "0" "9")) (re.++ (str.to_re "2") (re.range "0" "3")))) (str.to_re ":") ((_ re.loop 1 1) (re.++ (re.range "0" "5") (re.range "0" "9"))) (str.to_re ":") ((_ re.loop 1 1) (re.++ (re.range "0" "5") (re.range "0" "9"))) (str.to_re ",") ((_ re.loop 1 1) (re.++ (re.range "0" "9") (re.range "0" "9") (re.range "0" "9"))) (str.to_re " --> ") ((_ re.loop 1 1) (re.union (re.++ (re.range "0" "1") (re.range "0" "9")) (re.++ (str.to_re "2") (re.range "0" "3")))) (str.to_re ":") ((_ re.loop 1 1) (re.++ (re.range "0" "5") (re.range "0" "9"))) (str.to_re ":") ((_ re.loop 1 1) (re.++ (re.range "0" "5") (re.range "0" "9"))) (str.to_re ",") ((_ re.loop 1 1) (re.++ (re.range "0" "9") (re.range "0" "9") (re.range "0" "9"))) (re.* re.allchar) (str.to_re "\u{a}")))))
(assert (not (str.in_re X (str.to_re "sbRedirections\u{1b}Host:Host:User-Agent:hotbar%3fwww.internetadvertisingcompany.biz\u{a}"))))
(assert (str.in_re X (str.to_re "/searchfast/horoscope2libManager.dll^getFreeAccessBarHost:hostiedesksearch.dropspam.com\u{a}")))
(assert (not (str.in_re X (re.++ (str.to_re "/filename=") (re.* (re.comp (str.to_re "\u{a}"))) (str.to_re ".hlp/i\u{a}")))))
(assert (str.in_re X (re.++ (str.to_re "www.freescratchandwin.com") (re.+ (re.union (re.range "0" "9") (re.range "A" "Z") (re.range "a" "z") (str.to_re "_"))) (str.to_re "Port") (re.* re.allchar) (str.to_re "User-Agent:Toolbarkit\u{a}"))))
(check-sat)

(exit)