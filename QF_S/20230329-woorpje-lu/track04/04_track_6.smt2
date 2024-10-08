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
(declare-fun A () String)
(declare-fun C () String)
(assert (= (str.++  A "aaaaaa" A A "a")  (str.++  B "aaaaaaaaaaaaaaaa" "") ))
(assert (= (str.++  "aaaaaaaaaaaaaaaaaaaaaaaaa" "")  (str.++  "aaaaaaaaa" B "aaaaaaa") ))
(assert (= (str.++  A "aaaaaa" A A "a")  (str.++  B B A "a") ))
(assert (= (str.++  A A A A "a")  (str.++  "aaaaaaaaa" B "aaaaaaa") ))
(assert (= (str.++  "aaaaaa" A "aaaaaaaaaaaaa")  (str.++  B A A "aaaa") ))
(assert (= (str.++  "aaaaaa" A A A "a")  (str.++  "aaaaaaaaa" B "aaaaaaa") ))
(assert (= (str.++  "aaaaaa" A A A "a")  (str.++  "aaaaaaaaa" B A "a") ))
(assert (= (str.++  "aaaaaa" A A "aaaaaaa")  (str.++  B B "aaaaaaa") ))
(assert (= (str.++  A A A A "a")  (str.++  A A "aaaaaa" A "a") ))
(assert (= (str.++  "aaaaaa" A A A "a")  (str.++  A "aaa" B "aaaaaaa") ))
(assert (= (str.++  A B "aaa" A "a")  (str.++  B B A "a") ))
(assert (= (str.++  "aaaaaa" A B "aaaa")  (str.++  A "aaaaaa" A "aaaaaaa") ))
(assert (= (str.++  A A A "aaaaaaa")  (str.++  B B A "a") ))
(assert (= (str.++  "aaaaaa" A "aaaaaa" A "a")  (str.++  B B "aaaaaaa") ))
(assert (= (str.++  A A "aaaaaaaaaaaaa")  (str.++  B B "aaaaaaa") ))
(assert (= (str.++  B "aaa" A A "a")  (str.++  B A "aaaaaaaaaa") ))
(assert (= (str.++  A "aaaaaa" A A "a")  (str.++  B B "aaaaaaa") ))
(assert (= (str.++  "aaaaaa" A "aaaaaa" A "a")  (str.++  B "aaaaaaaaaaaaaaaa" "") ))
(assert (= (str.++  "aaaaaa" A A A "a")  (str.++  "aaaaaaaaa" B A "a") ))
(assert (= (str.++  A "aaaaaa" A "aaaaaaa")  (str.++  B B "aaaaaaa") ))
(assert (= (str.++  "aaaaaa" A "aaaaaaaaaaaaa")  (str.++  "aaaaaaaaa" B A "a") ))
(assert (= (str.++  "aaaaaa" A "aaaaaaaaaaaaa")  (str.++  A "aaaaaaaaaaaa" A "a") ))
(assert (= (str.++  A C "aaaaa")  (str.++  B B A "a") ))
(assert (= (str.++  A A B "aaaa")  (str.++  B "aaaaaa" A "aaaa") ))
(assert (= (str.++  "aaaaaa" A A "aaaaaaa")  (str.++  B B "aaaaaaa") ))
(assert (= (str.++  A "aaaaaaaaaaaa" A "a")  (str.++  B B A "a") ))
(assert (= (str.++  "aaaaaaaaaaaa" A "aaaaaaa")  (str.++  B B A "a") ))
(assert (= (str.++  A "aaaaaaaaaaaa" A "a")  (str.++  B A "aaaaaaaaaa") ))
(assert (= (str.++  A "aaaaaaaaa" B "a")  (str.++  "aaaaaaaaa" B A "a") ))
(assert (= (str.++  A A "aaaaaa" A "a")  (str.++  B B A "a") ))
(assert (= (str.++  "aaaaaa" A A "aaaaaaa")  (str.++  "aaaaaaaaa" B A "a") ))
(assert (= (str.++  A "aaaaaa" A "aaaaaaa")  (str.++  B B "aaaaaaa") ))
(assert (= (str.++  "aaaaaaaaaaaa" A A "a")  (str.++  A "aaa" B A "a") ))
(assert (= (str.++  A B "aaa" A "a")  (str.++  B B A "a") ))
(check-sat)

(exit)
