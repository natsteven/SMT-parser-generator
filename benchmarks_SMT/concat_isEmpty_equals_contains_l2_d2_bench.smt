(declare-fun r4 () String)
(declare-fun r5 () String)
(declare-fun r6 () String)
(declare-fun r7 () String)
(declare-fun r8 () String)

(assert r4 )
(assert r5 )
(assert r6 )
(assert r7 )
(assert r8 )
(assert (not (= "" (str.++ r4 r6 (str.++ r4 r6 )))))
(assert (not (= "B" r8 )))
(assert (not (= "B" (str.++ "C" (str.++ "B" r5 )))))
(assert (not (= "A" (str.++ r5 r7 ))))
(assert (not (= "" (str.++ "C" r7 ))))
(assert (not (= "" (str.++ "C" r6 ))))
(assert (not (= "" (str.++ "B" (str.++ r8 r5 )))))
(assert (str.contains "" (str.++ "B" r5 )))
(assert (not (= "" (str.++ r6 r7 ))))
(assert (str.contains "CB" (str.++ r4 r6 )))
(assert (not (= "" r4 )))
(assert (str.contains "B" (str.++ "A" (str.++ "B" r5 ))))
(assert (not (= "B" r6 )))
(assert (not (= "C" (str.++ r4 r6 (str.++ "C" r4 )))))
(assert (not (= "" (str.++ "C" (str.++ "C" r6 )))))
(assert (not (= "" (str.++ r4 r6 (str.++ "C" r6 )))))
(assert (str.contains "" (str.++ "C" r7 (str.++ "C" r6 ))))
(assert (str.contains "" (str.++ "B" r4 )))
(assert (not (str.contains "A" r5 )))
(assert (not (= "" (str.++ "C" r4 ))))
(assert (not (= "" (str.++ "B" (str.++ r8 r5 )))))
(assert (str.contains "C" (str.++ "A" (str.++ "C" r7 ))))
(assert (not (= "" r7 )))
(assert (not (= "A" (str.++ r4 r6 ))))
(assert (not (= "" (str.++ r8 r5 ))))
(check-sat)