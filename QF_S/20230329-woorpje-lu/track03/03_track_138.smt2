(set-info :smt-lib-version 2.6)
(set-logic QF_S)
(set-info :source |
Generated by: Joel Day, Thorsten Ehlers, Mitja Kulczynski, Federico Mora, Florin Manea, Dirk Nowotka, Danny Poulsen, Zhengyang Lu
Application: Test WOORPJE
Target solver: WOORPJE
Publications: Day, J. D., Ehlers, T., Kulczynski, M., Manea, F., Nowotka, D., & Poulsen, D. B. (2019). On solving word equations using SAT. In RP 2019
Description: Transoformed and expanded from Track02
|)
(set-info :license "https://creativecommons.org/licenses/by/4.0/")
(set-info :category "random")
(set-info :status unknown)

(declare-fun N () String)
(declare-fun J () String)
(declare-fun I () String)
(declare-fun K () String)
(declare-fun F () String)
(declare-fun G () String)
(declare-fun L () String)
(declare-fun M () String)
(declare-fun P () String)
(declare-fun Q () String)
(assert (= (str.++  F I "aa" I "a" F I "aa" I "b" K K J K "b" L "b" P)  (str.++  "a" G I I G G L J L J "b" N M N M "b" Q Q "baa") ))
(check-sat)

(exit)
