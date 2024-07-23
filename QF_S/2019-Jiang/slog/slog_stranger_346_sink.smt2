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

(declare-fun sigmaStar_5 () String)
(declare-fun x_2 () String)
(declare-fun literal_0 () String)
(declare-fun literal_1 () String)
(declare-fun sigmaStar_9 () String)
(declare-fun x_6 () String)
(declare-fun sigmaStar_12 () String)
(declare-fun sigmaStar_15 () String)
(declare-fun sigmaStar_16 () String)
(declare-fun sigmaStar_21 () String)
(declare-fun literal_23 () String)
(declare-fun x_22 () String)
(declare-fun literal_20 () String)
(declare-fun literal_19 () String)
(declare-fun x_24 () String)
(declare-fun sigmaStar_28 () String)
(declare-fun literal_27 () String)
(declare-fun x_30 () String)
(declare-fun literal_29 () String)
(declare-fun x_31 () String)
(declare-fun literal_33 () String)
(declare-fun x_34 () String)
(declare-fun x_32 () String)
(declare-fun x_35 () String)
(declare-fun literal_36 () String)
(declare-fun x_37 () String)
(declare-fun literal_38 () String)
(declare-fun x_39 () String)
(declare-fun x_10 () String)
(assert (= literal_0 "\u{53}\u{45}\u{43}\u{55}\u{52}\u{49}\u{54}\u{59}\u{20}\u{57}\u{41}\u{52}\u{4e}\u{49}\u{4e}\u{47}\u{3a}\u{20}\u{6c}\u{6f}\u{67}\u{67}\u{65}\u{64}\u{20}\u{69}\u{6e}\u{74}\u{72}\u{75}\u{73}\u{69}\u{6f}\u{6e}\u{20}\u{61}\u{74}\u{74}\u{65}\u{6d}\u{70}\u{74}\u{20}\u{61}\u{67}\u{61}\u{69}\u{6e}\u{73}\u{74}\u{20}\u{6c}\u{69}\u{62}\u{2f}\u{61}\u{64}\u{6f}\u{64}\u{62}\u{2f}\u{74}\u{65}\u{73}\u{74}\u{73}\u{2f}\u{74}\u{6d}\u{73}\u{73}\u{71}\u{6c}\u{2e}\u{70}\u{68}\u{70}"))
(assert (= literal_1 "\u{70}\u{72}\u{69}\u{6e}\u{74}\u{5f}\u{68}\u{65}\u{61}\u{64}\u{65}\u{72}\u{28}\u{29}\u{20}\u{77}\u{61}\u{73}\u{20}\u{63}\u{61}\u{6c}\u{6c}\u{65}\u{64}\u{20}\u{6d}\u{6f}\u{72}\u{65}\u{20}\u{74}\u{68}\u{61}\u{6e}\u{20}\u{6f}\u{6e}\u{63}\u{65}\u{20}\u{2d}\u{20}\u{74}\u{68}\u{69}\u{73}\u{20}\u{73}\u{68}\u{6f}\u{75}\u{6c}\u{64}\u{20}\u{6e}\u{6f}\u{74}\u{20}\u{68}\u{61}\u{70}\u{70}\u{65}\u{6e}\u{2e}\u{20}\u{20}\u{50}\u{6c}\u{65}\u{61}\u{73}\u{65}\u{20}\u{63}\u{68}\u{65}\u{63}\u{6b}\u{20}\u{74}\u{68}\u{65}\u{20}\u{63}\u{6f}\u{64}\u{65}\u{20}\u{66}\u{6f}\u{72}\u{20}\u{74}\u{68}\u{69}\u{73}\u{20}\u{70}\u{61}\u{67}\u{65}\u{20}\u{63}\u{6c}\u{6f}\u{73}\u{65}\u{6c}\u{79}\u{2e}\u{20}\u{4e}\u{6f}\u{74}\u{65}\u{3a}\u{20}\u{65}\u{72}\u{72}\u{6f}\u{72}\u{28}\u{29}\u{20}\u{61}\u{6e}\u{64}\u{20}\u{72}\u{65}\u{64}\u{69}\u{72}\u{65}\u{63}\u{74}\u{28}\u{29}\u{20}\u{61}\u{72}\u{65}\u{20}\u{6e}\u{6f}\u{77}\u{20}\u{73}\u{61}\u{66}\u{65}\u{20}\u{74}\u{6f}\u{20}\u{63}\u{61}\u{6c}\u{6c}\u{20}\u{61}\u{66}\u{74}\u{65}\u{72}\u{20}\u{70}\u{72}\u{69}\u{6e}\u{74}\u{5f}\u{68}\u{65}\u{61}\u{64}\u{65}\u{72}\u{28}\u{29}\u{2e}"))
(assert (or (= x_2 literal_0) (= x_2 literal_1)))
(assert (= x_6 (str.replace x_2 "\u{2f}\u{28}\u{26}\u{23}\u{5b}\u{30}\u{2d}\u{39}\u{5d}\u{2b}\u{29}\u{28}\u{3b}\u{3f}\u{29}\u{2f}" "\u{5c}\u{31}\u{3b}")))
(assert (= x_10 (str.replace x_6 "\u{2f}\u{28}\u{26}\u{23}\u{78}\u{5b}\u{30}\u{2d}\u{39}\u{61}\u{2d}\u{66}\u{41}\u{2d}\u{46}\u{5d}\u{2b}\u{29}\u{28}\u{3b}\u{3f}\u{29}\u{2f}" "\u{5c}\u{31}\u{3b}")))
(assert (= literal_23 "\u{3c}\u{64}\u{69}\u{76}\u{20}\u{63}\u{6c}\u{61}\u{73}\u{73}\u{3d}\u{22}"))
(assert (= literal_20 "\u{6e}\u{6f}\u{74}\u{69}\u{66}\u{79}\u{70}\u{72}\u{6f}\u{62}\u{6c}\u{65}\u{6d}"))
(assert (= literal_19 "\u{6e}\u{6f}\u{74}\u{69}\u{66}\u{79}\u{73}\u{75}\u{63}\u{63}\u{65}\u{73}\u{73}"))
(assert (or (= x_22 literal_20) (= x_22 literal_19)))
(assert (= x_24 (str.++ literal_23 x_22)))
(assert (= literal_27 "\u{22}\u{20}\u{61}\u{6c}\u{69}\u{67}\u{6e}\u{3d}\u{22}"))
(assert (= x_30 (str.++ x_24 literal_27)))
(assert (= literal_29 "\u{63}\u{65}\u{6e}\u{74}\u{65}\u{72}"))
(assert (= x_31 (str.++ x_30 literal_29)))
(assert (= literal_33 "\u{22}\u{3e}"))
(assert (= x_34 (str.++ x_31 literal_33)))
(assert (or (= x_32 sigmaStar_28) (= x_32 literal_1)))
(assert (= x_35 (str.++ x_34 x_32)))
(assert (= literal_36 "\u{3c}\u{2f}\u{64}\u{69}\u{76}\u{3e}"))
(assert (= x_37 (str.++ x_35 literal_36)))
(assert (= literal_38 "\u{3c}\u{62}\u{72}\u{20}\u{2f}\u{3e}\u{5c}\u{6e}"))
(assert (= x_39 (str.++ x_37 literal_38)))
(assert (str.in_re x_39 (re.++ (re.* re.allchar) (re.++ (str.to_re "\u{5c}\u{3c}\u{53}\u{43}\u{52}\u{49}\u{50}\u{54}") (re.* re.allchar)))))
(check-sat)
(exit)
