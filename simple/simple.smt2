
(declare-fun a () String)
(declare-fun b () String)
(declare-fun c () String)

(assert (= (str.++ "A" a) "AA"))
(assert (not (= (str.++ a b) "A")))
(assert (not (= c "")))
(assert (not (= (str.++ a b c) "AAA")))
(check-sat)