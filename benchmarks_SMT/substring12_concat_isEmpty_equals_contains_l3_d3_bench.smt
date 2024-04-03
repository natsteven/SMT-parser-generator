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
(assert (not (= "CC" (str.++ "B" (str.substr r4  0 1)))))
(assert (= "" (str.substr (str.substr (str.substr r4  0 1) 0 1) 1 1)))
(assert (not (= "" (str.++ "C" (str.++ "B" r8 (str.++ r8 r7 ))))))
(assert (not (= "" (str.++ "B" r8 (str.++ r8 r7 )))))
(assert (not (= "CB" (str.++ "B" (str.++ r4 r7 (str.++ r4 r5 ))))))
(assert (not (str.contains "CC" (str.++ (str.substr r7  2 2)(str.substr r7  2 3)))))
(assert (= "" (str.substr (str.++ "A" r6 ) 0 0)))
(assert (not (str.contains "BA" (str.++ "B" (str.++ r4 r7 (str.++ r4 r5 ))))))
(assert (str.contains "A" (str.++ r8 r7 )))
(assert (not (str.contains "AA" (str.substr (str.++ "A" r4 ) 3 4))))
(assert (not (= "" (str.++ r8 r5 ))))
(assert (not (= "" (str.substr (str.substr r8  1 3) 0 1))))
(assert (not (= "" (str.++ r4 r7 (str.++ r4 r5 )))))
(assert (= "" (str.substr (str.substr r7  2 3) 1 1)))
(assert (not (= "B" (str.++ (str.substr r4  2 3)(str.++ r8 r5 )))))
(assert (not (= "" (str.++ (str.substr r8  1 3)(str.substr r6  1 3)))))
(assert (str.contains "" (str.substr (str.++ "B" (str.substr r4  0 1)) 0 1)))
(assert (not (= "" r4 )))
(assert (= "" (str.substr r7  2 2)))
(assert (str.contains "" r8 ))
(assert (not (= "" r7 )))
(assert (= "" (str.substr r5  0 0)))
(assert (not (= "" (str.substr r4  1 3))))
(assert (str.contains "B" (str.++ "B" (str.substr r4  0 1)(str.substr (str.++ "A" r6 ) 0 0))))
(assert (not (= "" (str.substr r6  1 3))))
(assert (not (= "" (str.substr (str.++ r4 r7 (str.++ r4 r5 )) 10 11))))
(assert (not (= "" (str.++ "A" r4 ))))
(assert (= "" (str.substr (str.++ "A" (str.++ r4 r5 )) 6 6)))
(assert (not (= "" (str.substr r4  0 1))))
(assert (not (str.contains "BC" (str.++ "A" r8 ))))
(assert (= "" (str.substr (str.++ "C" r7 ) 4 4)))
(assert (not (str.contains "BA" (str.++ "C" (str.++ "A" (str.substr r5  0 0))))))
(assert (str.contains "" (str.++ "B" (str.++ r8 r7 ))))
(assert (not (= "" (str.++ "A" r6 ))))
(assert (= "" (str.++ (str.substr (str.substr r7  2 3) 1 1)(str.substr (str.++ r8 r7 ) 6 6))))
(assert (str.contains "B" (str.substr (str.++ "A" (str.++ r4 r5 )) 2 5)))
(assert (not (= "" (str.substr (str.substr r4  0 1) 0 1))))
(assert (not (= "" (str.++ (str.substr (str.++ r4 r7 ) 6 6)(str.++ "A" (str.++ r4 r5 ))))))
(assert (not (str.contains "CC" (str.++ (str.substr (str.substr r4  0 1) 0 1)(str.substr (str.substr r7  2 3) 1 1)))))
(assert (not (= "" (str.substr r7  2 3))))
(assert (str.contains "A" (str.++ "B" r7 )))
(assert (= "" (str.substr (str.++ "B" r8 (str.++ r8 r7 )) 6 6)))
(assert (str.contains "A" (str.++ "A" (str.++ r4 r5 ))))
(assert (not (= "B" (str.++ r4 r5 ))))
(assert (not (= "" (str.++ "B" r8 (str.++ r8 r7 )(str.++ "B" (str.++ r8 r7 ))))))
(assert (not (= "C" (str.substr (str.++ r4 r7 (str.++ r4 r5 )) 9 11))))
(assert (not (= "B" (str.substr (str.substr (str.++ "A" r8 ) 3 4) 0 0))))
(assert (= "" (str.substr (str.++ "A" (str.++ r4 r5 )) 7 7)))
(assert (str.contains "B" (str.++ r4 r7 )))
(assert (not (= "BB" r6 )))
(assert (not (= "" r5 )))
(assert (not (str.contains "B" (str.substr (str.++ "A" r8 ) 3 4))))
(assert (not (= "" (str.++ "A" (str.++ (str.substr r7  2 2)(str.++ "B" r8 ))))))
(assert (not (= "BB" (str.++ (str.substr r7  2 2)(str.++ "B" r8 )))))
(assert (not (= "" (str.substr r4  2 3))))
(assert (not (= "" (str.++ "A" (str.substr r5  0 0)))))
(assert (not (= "" (str.++ "B" r8 ))))
(assert (= "" (str.substr (str.++ r8 r7 ) 6 6)))
(assert (= "" (str.substr (str.++ (str.substr r7  2 2)(str.++ "B" r8 )) 3 3)))
(assert (not (= "" (str.substr r7  2 3))))
(assert (not (= "" (str.substr (str.substr r4  1 3) 0 1))))
(assert (str.contains "A" (str.++ "C" r7 )))
(assert (str.contains "" (str.substr r8  1 3)))
(assert (not (str.contains "BA" (str.substr (str.++ r4 r7 ) 6 6))))
(assert (not (= "B" (str.substr r4  0 1))))
(check-sat)
