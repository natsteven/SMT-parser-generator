(set-info :smt-lib-version 2.6)
(set-logic QF_S)
(set-info :source |
Generated by: Joel Day, Thorsten Ehlers, Mitja Kulczynski, Federico Mora, Florin Manea, Dirk Nowotka, Danny Poulsen, Zhengyang Lu
Application: Test WOORPJE
Target solver: WOORPJE
Publications: Day, J. D., Ehlers, T., Kulczynski, M., Manea, F., Nowotka, D., & Poulsen, D. B. (2019). On solving word equations using SAT. In RP 2019
Description: Consisting of a system of 100 small random word equations with at most 6 letters, 10 variables and length 60.
|)
(set-info :license "https://creativecommons.org/licenses/by/4.0/")
(set-info :category "random")
(set-info :status unknown)

(declare-fun B () String)
(declare-fun G () String)
(declare-fun F () String)
(declare-fun A () String)
(declare-fun E () String)
(declare-fun C () String)
(assert (= (str.++  G "")  (str.++  A "") ))
(assert (= (str.++  G "")  (str.++  C "") ))
(assert (= (str.++  G "")  (str.++  C "") ))
(assert (= (str.++  C "")  (str.++  A "") ))
(assert (= (str.++  F "")  (str.++  E "") ))
(assert (= (str.++  F "")  (str.++  A "") ))
(assert (= (str.++  F "")  (str.++  A "") ))
(assert (= (str.++  B "")  (str.++  C "") ))
(assert (= (str.++  F "")  (str.++  E "") ))
(assert (= (str.++  F "")  (str.++  A "") ))
(assert (= (str.++  G "")  (str.++  F "") ))
(assert (= (str.++  G "")  (str.++  A "") ))
(assert (= (str.++  G "")  (str.++  C "") ))
(assert (= (str.++  F "")  (str.++  C "") ))
(assert (= (str.++  G "")  (str.++  A "") ))
(assert (= (str.++  G "")  (str.++  A "") ))
(assert (= (str.++  G "")  (str.++  A "") ))
(assert (= (str.++  G "")  (str.++  A "") ))
(assert (= (str.++  G "")  (str.++  A "") ))
(assert (= (str.++  G "")  (str.++  E "") ))
(assert (= (str.++  F "")  (str.++  C "") ))
(assert (= (str.++  B "")  (str.++  C "") ))
(assert (= (str.++  G "")  (str.++  B "") ))
(assert (= (str.++  G "")  (str.++  A "") ))
(assert (= (str.++  B "")  (str.++  A "") ))
(assert (= (str.++  E "")  (str.++  A "") ))
(assert (= (str.++  G "")  (str.++  E "") ))
(assert (= (str.++  G "")  (str.++  E "") ))
(assert (= (str.++  G "")  (str.++  C "") ))
(check-sat)

(exit)
