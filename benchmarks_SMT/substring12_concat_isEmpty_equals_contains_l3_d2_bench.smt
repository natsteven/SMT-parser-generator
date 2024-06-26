(set-logic QF_S)
(set-option :produce-models true)
(declare-fun r4 () String)
(declare-fun r5 () String)
(declare-fun r6 () String)
(declare-fun r7 () String)
(declare-fun r8 () String)

(assert (not (= "" (str.substr r8  1 2))))
(assert (not (= (str.++ (str.substr r4  2 1)(str.++ r8 r5 ))"" )))
(assert (str.contains (str.++ (str.substr r7  2 0)(str.++ "B" r8 ))"" ))
(assert (not (= "" (str.++ (str.substr r8  1 2)(str.substr r6  1 2)))))
(assert (not (= (str.++ "C" r7 )"C" )))
(assert (not (= (str.++ "B" (str.substr r4  0 1))"" )))
(assert (not (= (str.++ r4 r7 (str.++ r4 r5 ))"" )))
(assert (not (= "" (str.substr (str.substr r4  1 2) 0 1))))
(assert (not (str.contains (str.substr (str.++ r8 r7 ) 6 0)"BA" )))
(assert (= (str.substr r7  2 1)"A" ))
(assert (not (= "" r4 )))
(assert (not (= "" (str.substr r4  2 1))))
(assert (not (= "" (str.++ "A" r8 ))))
(assert (= "" (str.substr (str.++ "A" r6 ) 0 0)))
(assert (str.contains (str.++ "B" r8 )"B" ))
(assert (not (= "" (str.++ (str.substr r7  2 0)(str.substr r7  2 1)))))
(assert (str.contains (str.substr (str.++ "A" r8 ) 3 1)"" ))
(assert (not (str.contains (str.substr r5  0 0)"AB" )))
(assert (str.contains (str.substr (str.++ r4 r7 ) 6 0)"" ))
(assert (not (str.contains (str.substr (str.++ "C" r7 ) 4 0)"A" )))
(assert (not (= (str.substr (str.++ "A" r4 ) 3 1)"" )))
(assert (not (= "" (str.++ r4 r5 ))))
(assert (not (str.contains r6 "AB" )))
(assert (not (= r5 "B" )))
(assert (not (= "" (str.substr (str.substr r4  0 1) 0 1))))
(assert (not (= r8 "AC" )))
(assert (not (= "" r7 )))
(assert (not (= (str.++ r8 r7 )"" )))
(assert (not (= "" (str.substr r6  1 2))))
(assert (not (= (str.substr r4  1 2)"CB" )))
(assert (str.contains (str.++ "A" r6 )"CC" ))
(assert (not (= (str.++ r4 r7 )"" )))
(assert (not (str.contains (str.substr (str.substr r7  2 1) 1 0)"AC" )))
(assert (not (= (str.++ "B" r8 (str.++ r8 r7 ))"B" )))
(assert (not (= "" (str.++ "A" (str.++ r4 r5 )))))
(assert (= (str.substr r7  2 1)"A" ))
(assert (not (= (str.substr r4  0 1)"" )))
(assert (not (= (str.++ "B" (str.++ r8 r7 ))"BB" )))
(assert (not (= (str.substr (str.substr r8  1 2) 0 1)"CB" )))
(assert (str.contains (str.++ "B" r7 )"B" ))
(assert (not (= "" (str.++ "A" r4 ))))
(assert (not (= "" (str.++ "A" (str.substr r5  0 0)))))
(assert (not (= "" (str.++ r8 r5 ))))
(assert (not (str.contains (str.substr r7  2 0)"B" )))
(assert (not (str.contains (str.substr r4  0 1)"BA" )))
(check-sat)
(get-model)
(exit)
