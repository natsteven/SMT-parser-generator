(set-info :smt-lib-version 2.6)
(set-logic QF_S)
(set-info :source |
Generated by: Hung-En Wang, Tzung-Lin Tsai, Chun-Han Lin, Fang Yu, and Jie-Hong R. Jiang
Generated on: 2019-02-28
Generator: Stranger
Application: Security analysis of string manipulating web applications
Target solver: CVC4, Norn, Z3-str2
Publication:
Hung-En Wang, Tzung-Lin Tsai, Chun-Han Lin, Fang Yu, Jie-Hong R. Jiang:
String Analysis via Automata Manipulation with Logic Circuit Representation. CAV (1) 2016: 241-260.
|)
(set-info :license "https://creativecommons.org/licenses/by/4.0/")
(set-info :category "industrial")
(set-info :status unknown)

(declare-fun sigmaStar_0 () String)
(declare-fun sigmaStar_1 () String)
(declare-fun sigmaStar_2 () String)
(declare-fun literal_7 () String)
(declare-fun x_6 () String)
(declare-fun literal_4 () String)
(declare-fun literal_5 () String)
(declare-fun x_8 () String)
(declare-fun x_10 () String)
(declare-fun epsilon () String)
(declare-fun x_11 () String)
(declare-fun literal_12 () String)
(declare-fun x_13 () String)
(declare-fun x_14 () String)
(declare-fun x_15 () String)
(declare-fun x_16 () String)
(declare-fun literal_17 () String)
(declare-fun x_18 () String)
(declare-fun x_19 () String)
(declare-fun literal_20 () String)
(declare-fun x_21 () String)
(assert (= literal_7 "\u{5b}\u{3c}\u{61}\u{20}\u{68}\u{72}\u{65}\u{66}\u{3d}\u{27}"))
(assert (= literal_4 ""))
(assert (= literal_5 "\u{68}\u{74}\u{74}\u{70}\u{3a}\u{2f}\u{2f}"))
(assert (or (= x_6 literal_4) (= x_6 literal_5)))
(assert (= x_8 (str.++ literal_7 x_6)))
(assert (= epsilon ""))
(assert (or (= x_10 epsilon) (= x_10 sigmaStar_2)))
(assert (= x_11 (str.++ x_8 x_10)))
(assert (= literal_12 "\u{27}\u{20}\u{74}\u{69}\u{74}\u{6c}\u{65}\u{3d}\u{27}"))
(assert (= x_13 (str.++ x_11 literal_12)))
(assert (= x_14 (str.++ x_13 x_6)))
(assert (or (= x_15 epsilon) (= x_15 sigmaStar_0)))
(assert (= x_16 (str.++ x_14 x_15)))
(assert (= literal_17 "\u{27}\u{20}\u{74}\u{61}\u{72}\u{67}\u{65}\u{74}\u{3d}\u{27}\u{5f}\u{62}\u{6c}\u{61}\u{6e}\u{6b}\u{27}\u{3e}"))
(assert (= x_18 (str.++ x_16 literal_17)))
(assert (= x_19 (str.++ x_18 sigmaStar_1)))
(assert (= literal_20 "\u{3c}\u{2f}\u{61}\u{3e}\u{5d}\u{5c}\u{6e}"))
(assert (= x_21 (str.++ x_19 literal_20)))
(assert (str.in_re x_21 (re.++ (re.* re.allchar) (re.++ (str.to_re "\u{5c}\u{3c}\u{53}\u{43}\u{52}\u{49}\u{50}\u{54}") (re.* re.allchar)))))
(check-sat)
(exit)
