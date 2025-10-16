(set-logic ALL)
(declare-fun s1 () String)
(declare-fun s2 () String)
(declare-fun s3 () String)

(assert (= "s1s2s3" (str.++ s1 s2 s3)))

(check-sat)