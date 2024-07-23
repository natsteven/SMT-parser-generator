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
(declare-fun sigmaStar_3 () String)
(declare-fun sigmaStar_4 () String)
(declare-fun sigmaStar_5 () String)
(declare-fun sigmaStar_6 () String)
(declare-fun sigmaStar_7 () String)
(declare-fun sigmaStar_8 () String)
(declare-fun sigmaStar_9 () String)
(declare-fun literal_10 () String)
(declare-fun x_12 () String)
(declare-fun literal_11 () String)
(declare-fun x_13 () String)
(declare-fun literal_14 () String)
(declare-fun x_15 () String)
(declare-fun x_16 () String)
(declare-fun literal_17 () String)
(declare-fun x_19 () String)
(declare-fun literal_18 () String)
(declare-fun x_20 () String)
(declare-fun x_21 () String)
(declare-fun x_22 () String)
(declare-fun literal_23 () String)
(declare-fun x_24 () String)
(declare-fun x_25 () String)
(declare-fun x_26 () String)
(declare-fun literal_27 () String)
(declare-fun x_28 () String)
(assert (= literal_10 "\u{52}\u{45}\u{3a}\u{20}"))
(assert (= x_12 (str.++ literal_10 sigmaStar_1)))
(assert (= literal_11 "\u{52}\u{45}\u{3a}\u{20}"))
(assert (= x_13 (str.++ literal_11 sigmaStar_4)))
(assert (= literal_14 "\u{3c}\u{2f}\u{74}\u{64}\u{3e}\u{0d}\u{0a}\u{3c}\u{74}\u{64}\u{20}\u{63}\u{6c}\u{61}\u{73}\u{73}\u{3d}\u{27}\u{74}\u{62}\u{6c}\u{32}\u{27}\u{3e}"))
(assert (or (= x_15 x_13) (= x_15 x_12)))
(assert (= x_16 (str.++ literal_14 x_15)))
(assert (= literal_17 "\u{3c}\u{2f}\u{74}\u{64}\u{3e}\u{0d}\u{0a}\u{3c}\u{2f}\u{74}\u{72}\u{3e}\u{0d}\u{0a}\u{3c}\u{74}\u{72}\u{3e}\u{0d}\u{0a}\u{3c}\u{74}\u{64}\u{20}\u{76}\u{61}\u{6c}\u{69}\u{67}\u{6e}\u{3d}\u{27}\u{74}\u{6f}\u{70}\u{27}\u{20}\u{72}\u{6f}\u{77}\u{73}\u{70}\u{61}\u{6e}\u{3d}\u{27}\u{32}\u{27}\u{20}\u{77}\u{69}\u{64}\u{74}\u{68}\u{3d}\u{27}\u{31}\u{34}\u{35}\u{27}\u{20}\u{63}\u{6c}\u{61}\u{73}\u{73}\u{3d}\u{27}\u{74}\u{62}\u{6c}\u{31}\u{27}\u{3e}"))
(assert (= x_19 (str.++ x_16 literal_17)))
(assert (= literal_18 "\u{3c}\u{74}\u{61}\u{62}\u{6c}\u{65}\u{20}\u{63}\u{65}\u{6c}\u{6c}\u{70}\u{61}\u{64}\u{64}\u{69}\u{6e}\u{67}\u{3d}\u{27}\u{30}\u{27}\u{20}\u{63}\u{65}\u{6c}\u{6c}\u{73}\u{70}\u{61}\u{63}\u{69}\u{6e}\u{67}\u{3d}\u{27}\u{30}\u{27}\u{20}\u{77}\u{69}\u{64}\u{74}\u{68}\u{3d}\u{27}\u{31}\u{30}\u{30}\u{25}\u{27}\u{20}\u{63}\u{6c}\u{61}\u{73}\u{73}\u{3d}\u{27}\u{74}\u{62}\u{6c}\u{2d}\u{62}\u{6f}\u{72}\u{64}\u{65}\u{72}\u{27}\u{3e}\u{0d}\u{0a}\u{3c}\u{74}\u{72}\u{3e}\u{0d}\u{0a}\u{3c}\u{74}\u{64}\u{3e}\u{0d}\u{0a}\u{3c}\u{74}\u{61}\u{62}\u{6c}\u{65}\u{20}\u{63}\u{65}\u{6c}\u{6c}\u{70}\u{61}\u{64}\u{64}\u{69}\u{6e}\u{67}\u{3d}\u{27}\u{30}\u{27}\u{20}\u{63}\u{65}\u{6c}\u{6c}\u{73}\u{70}\u{61}\u{63}\u{69}\u{6e}\u{67}\u{3d}\u{27}\u{31}\u{27}\u{20}\u{77}\u{69}\u{64}\u{74}\u{68}\u{3d}\u{27}\u{31}\u{30}\u{30}\u{25}\u{27}\u{3e}\u{0d}\u{0a}\u{3c}\u{74}\u{72}\u{3e}\u{0d}\u{0a}\u{3c}\u{74}\u{64}\u{20}\u{77}\u{69}\u{64}\u{74}\u{68}\u{3d}\u{27}\u{31}\u{34}\u{35}\u{27}\u{20}\u{63}\u{6c}\u{61}\u{73}\u{73}\u{3d}\u{27}\u{74}\u{62}\u{6c}\u{32}\u{27}\u{3e}"))
(assert (= x_20 (str.++ literal_18 sigmaStar_3)))
(assert (= x_21 (str.++ x_20 x_19)))
(assert (= x_22 (str.++ x_21 sigmaStar_6)))
(assert (= literal_23 "\u{3c}\u{62}\u{72}\u{3e}\u{0d}\u{0a}\u{3c}\u{73}\u{70}\u{61}\u{6e}\u{20}\u{63}\u{6c}\u{61}\u{73}\u{73}\u{3d}\u{27}\u{61}\u{6c}\u{74}\u{27}\u{3e}"))
(assert (= x_24 (str.++ x_22 literal_23)))
(assert (or (= x_25 sigmaStar_2) (= x_25 sigmaStar_7)))
(assert (= x_26 (str.++ x_24 x_25)))
(assert (= literal_27 "\u{3c}\u{2f}\u{73}\u{70}\u{61}\u{6e}\u{3e}\u{3c}\u{62}\u{72}\u{3e}\u{3c}\u{62}\u{72}\u{3e}\u{5c}\u{6e}"))
(assert (= x_28 (str.++ x_26 literal_27)))
(assert (str.in_re x_28 (re.++ (re.* re.allchar) (re.++ (str.to_re "\u{5c}\u{3c}\u{53}\u{43}\u{52}\u{49}\u{50}\u{54}") (re.* re.allchar)))))
(check-sat)
(exit)