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
(assert (not (str.in_re X (re.++ (str.to_re "/GET /plus.asp?") (re.* (re.union (str.to_re "\u{d}") (str.to_re "\u{a}"))) (str.to_re "query=") ((_ re.loop 2 40) (re.union (re.range "a" "z") (re.range "0" "9") (str.to_re "+") (str.to_re "/"))) ((_ re.loop 0 2) (str.to_re "@")) (str.to_re "/i\u{a}")))))
(assert (not (str.in_re X (re.++ (str.to_re "/.ogg") (re.union (str.to_re "?") (str.to_re "\u{5c}") (str.to_re "/")) (str.to_re "/smiU\u{a}")))))
(assert (not (str.in_re X (re.++ (str.to_re ".exe") (re.+ (re.union (str.to_re " ") (str.to_re "\u{9}") (str.to_re "\u{a}") (str.to_re "\u{c}") (str.to_re "\u{d}"))) (str.to_re "v2.0") (re.+ (re.union (str.to_re " ") (str.to_re "\u{9}") (str.to_re "\u{a}") (str.to_re "\u{c}") (str.to_re "\u{d}"))) (str.to_re "smrtshpr-cs-\u{13}\u{a}")))))
(assert (not (str.in_re X (re.++ (str.to_re "www.yok.com") (re.+ (re.union (str.to_re " ") (str.to_re "\u{9}") (str.to_re "\u{a}") (str.to_re "\u{c}") (str.to_re "\u{d}"))) (str.to_re "jupitersatellites.biz") (re.* re.allchar) (str.to_re "User-Agent:clvompycem/cen.vcn\u{a}")))))
(assert (str.in_re X (str.to_re "/\u{b6}\u{b6}\u{ff}\u{ff}\u{ff}\u{ff}/\u{a}")))
(check-sat)

(exit)
