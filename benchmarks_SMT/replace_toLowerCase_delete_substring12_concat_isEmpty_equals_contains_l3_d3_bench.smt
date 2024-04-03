(declare-fun r10 () String)
(declare-fun r11 () String)
(declare-fun r7 () String)
(declare-fun r8 () String)
(declare-fun r9 () String)
(define-fun-rec str.toLower ((x String)) String
  (ite (= x "")
      ""
      (let ((Head (str.at x 0)))
        (str.++ 
          (ite (and (<= 65 (str.to_code Head)) 
                     (<= (str.to_code Head) 90))
               (str.from_code (+ (str.to_code Head) 32))
               Head)
          (str.toLower (str.substr x 1 (- (str.len x) 1)))))))
(define-fun str.del ((x String) (a Int) (b Int)) String
  (str.++ (str.substr x 0 a) (str.substr x b (str.len x))))

(assert (not (= "" (str.toLower (str.++ "c" (str.toLower r10 ))))))
(assert (not (str.contains "bB" (str.replace_all r7  "A"  "B" ))))
(assert (= "" (str.del r10  0 3)))
(assert (= "" (str.substr (str.replace_all (str.toLower r9 ) "a"  "C" ) 3 3)))
(assert (not (str.contains "aa" (str.replace_all (str.toLower r11 ) "a"  "A" ))))
(assert (not (= "aa" (str.substr (str.++ r10 r9 ) 4 4))))
(assert (not (= "" (str.substr r10  1 2))))
(assert (not (= "" (str.++ (str.toLower (str.toLower r7 ))(str.del (str.replace_all r7  "B"  "C" ) 1 3)))))
(assert (= "" (str.substr (str.del (str.substr r11  1 3) 1 1) 0 0)))
(assert (= "" (str.replace_all (str.del (str.substr r8  2 2) 0 0) "B"  "A" )))
(assert (not (str.contains "b" (str.substr r11  1 3))))
(assert (not (= "" (str.replace_all (str.substr (str.del r11  1 1) 1 2) "c"  "C" ))))
(assert (not (str.contains "cb" (str.del r8  3 3))))
(assert (str.contains "" (str.toLower r7 )))
(assert (str.contains "" (str.substr r10  1 2)))
(assert (not (= "" (str.toLower (str.++ r10 r9 )))))
(assert (not (= "c" (str.toLower (str.toLower (str.toLower r7 ))))))
(assert (not (= "" (str.replace_all r11  "b"  "A" ))))
(assert (not (= "BB" (str.++ (str.replace_all r8  "B"  "A" )(str.del r9  3 3)))))
(assert (not (= "b" (str.substr (str.replace_all r7  "B"  "C" ) 1 1))))
(assert (str.contains "" (str.++ (str.replace_all r8  "B"  "A" )(str.del r9  3 3)(str.toLower (str.toLower r11 )))))
(assert (not (= "" (str.toLower (str.++ "c" (str.toLower r7 ))))))
(assert (not (= "bc" (str.++ "c" r9 ))))
(assert (not (= "Cb" (str.toLower (str.del (str.substr r8  2 2) 0 0)))))
(assert (not (str.contains "CC" (str.toLower (str.substr (str.replace_all r7  "B"  "C" ) 1 1)))))
(assert (not (= "" (str.toLower r9 ))))
(assert (not (str.contains "Bb" (str.replace_all (str.toLower (str.toLower r11 )) "b"  "B" ))))
(assert (= "" (str.del (str.del (str.substr r8  2 2) 0 0) 0 0)))
(assert (not (= "" (str.toLower r9 ))))
(assert (= "" (str.substr (str.replace_all (str.toLower r10 ) "b"  "B" ) 2 2)))
(assert (not (= "" (str.++ "c" (str.replace_all r7  "a"  "c" )(str.replace_all (str.del r9  2 3) "b"  "B" )))))
(assert (not (= "bb" (str.toLower (str.toLower (str.toLower r7 ))))))
(assert (not (= "" r10 )))
(assert (not (str.contains "B" (str.substr r8  3 3))))
(assert (not (= "ba" (str.replace_all (str.del (str.substr r11  1 3) 1 1) "B"  "a" ))))
(assert (not (= "b" (str.toLower r10 ))))
(assert (str.contains "" (str.++ "c" (str.toLower r7 ))))
(assert (not (str.contains "B" (str.del (str.replace_all (str.toLower r11 ) "a"  "A" ) 0 2))))
(assert (not (= "" (str.replace_all (str.del (str.replace_all r7  "a"  "C" ) 3 3) "C"  "b" ))))
(assert (not (= "" (str.replace_all (str.++ "c" r10 ) "a"  "B" ))))
(assert (not (= "" (str.++ (str.replace_all (str.toLower r9 ) "a"  "C" )(str.del (str.substr r8  2 2) 0 0)))))
(assert (not (str.contains "BB" (str.replace_all (str.substr r10  1 2) "C"  "b" ))))
(assert (not (= "" (str.++ "c" (str.toLower r10 )))))
(assert (str.contains "" (str.replace_all r8  "B"  "A" )))
(assert (= "" (str.del (str.substr (str.del r10  0 3) 0 0) 0 0)))
(assert (not (= "" r9 )))
(assert (not (= "b" (str.replace_all (str.replace_all r11  "A"  "C" ) "A"  "c" ))))
(assert (str.contains "" (str.del (str.substr r11  1 3) 1 1)))
(assert (not (= "" (str.++ r9 r11 ))))
(assert (not (str.contains "cB" (str.substr (str.++ "c" r10 ) 2 3))))
(assert (not (= "A" (str.++ "B" r7 ))))
(assert (not (str.contains "aC" (str.toLower (str.del r9  3 3)))))
(assert (not (= "" (str.substr (str.del (str.replace_all r7  "a"  "C" ) 3 3) 0 1))))
(assert (not (= "c" (str.substr (str.++ r7 r9 ) 1 6))))
(assert (not (= "" (str.del (str.replace_all (str.toLower r9 ) "a"  "C" ) 3 3))))
(assert (not (= "" (str.toLower (str.toLower r7 )))))
(assert (not (= "" (str.++ (str.substr (str.++ "c" r10 ) 2 3)(str.substr (str.replace_all r7  "B"  "C" ) 1 1)))))
(assert (not (str.contains "c" r11 )))
(assert (not (= "" (str.toLower (str.++ "b" (str.substr r7  3 3))))))
(assert (str.contains "" (str.replace_all r8  "c"  "a" )))
(assert (not (= "AB" (str.toLower r11 ))))
(assert (not (= "" (str.del (str.toLower (str.del r9  3 3)) 3 3))))
(assert (str.contains "" (str.toLower (str.++ "c" r9 ))))
(assert (not (= "" (str.del (str.toLower r10 ) 3 3))))
(assert (= "" (str.replace_all (str.substr (str.substr r8  3 3) 0 0) "A"  "c" )))
(assert (= "" (str.substr r10  0 0)))
(assert (not (str.contains "B" (str.substr r7  2 2))))
(assert (not (= "" (str.del (str.replace_all r7  "B"  "C" ) 1 3))))
(assert (not (= "" (str.++ (str.replace_all (str.++ "c" r9 ) "a"  "A" )(str.substr (str.replace_all r7  "B"  "C" ) 1 1)))))
(assert (not (= "" (str.toLower r7 ))))
(assert (not (= "CC" (str.del (str.substr r8  2 2) 0 0))))
(assert (not (str.contains "B" (str.del (str.substr r8  0 2) 0 2))))
(assert (not (str.contains "c" (str.replace_all (str.replace_all (str.replace_all r11  "A"  "C" ) "A"  "c" ) "a"  "b" ))))
(assert (not (str.contains "CC" (str.++ "C" (str.substr r7  2 2)))))
(assert (str.contains "" (str.del (str.substr (str.++ "c" r10 ) 2 3) 1 1)))
(assert (str.contains "" (str.del r9  3 3)))
(assert (not (str.contains "Bb" (str.toLower (str.toLower r11 )))))
(assert (not (= "" (str.++ "A" (str.++ r9 r11 )))))
(assert (str.contains "" (str.++ r7 r9 )))
(assert (not (str.contains "c" (str.toLower (str.++ "b" (str.substr r7  3 3))))))
(assert (= "" (str.substr r8  3 3)))
(assert (not (= "" (str.++ "B" r10 ))))
(assert (not (= "" (str.++ (str.substr r11  1 3)(str.++ "c" r7 )))))
(assert (str.contains "A" (str.del r8  0 1)))
(assert (not (str.contains "a" (str.replace_all (str.replace_all r7  "b"  "A" ) "c"  "b" ))))
(assert (not (= "" (str.++ "c" (str.replace_all r7  "a"  "c" )))))
(assert (not (= "" (str.toLower (str.toLower r11 )))))
(assert (not (= "" (str.replace_all (str.toLower r9 ) "a"  "C" ))))
(assert (not (= "Aa" r8 )))
(assert (not (= "" (str.++ r11 r9 ))))
(assert (not (= "b" (str.substr (str.del (str.substr r11  1 3) 0 2) 0 0))))
(assert (not (str.contains "B" (str.del (str.replace_all (str.substr r10  1 2) "C"  "b" ) 1 1))))
(assert (not (= "Ac" (str.replace_all r7  "b"  "A" ))))
(assert (not (= "" (str.++ (str.replace_all r7  "A"  "B" )(str.toLower r9 )))))
(assert (str.contains "c" (str.del (str.replace_all r7  "B"  "C" ) 3 3)))
(assert (= "" (str.substr r7  3 3)))
(assert (not (= "" (str.del (str.++ r9 r11 ) 4 4))))
(assert (not (= "" (str.replace_all r8  "c"  "a" ))))
(assert (not (str.contains "bC" (str.replace_all (str.del r8  3 3) "C"  "A" ))))
(assert (not (= "" (str.++ "c" r7 ))))
(assert (str.contains "" (str.++ "A" (str.++ (str.substr r11  1 3)(str.++ "c" r7 )))))
(assert (not (= "" (str.replace_all r7  "a"  "C" ))))
(assert (not (str.contains "BA" (str.del r9  2 3))))
(assert (not (= "b" (str.toLower (str.toLower (str.del r9  3 3))))))
(assert (not (= "A" (str.substr r8  0 2))))
(assert (not (= "" (str.toLower (str.replace_all (str.replace_all r11  "A"  "C" ) "A"  "c" )))))
(assert (not (str.contains "a" (str.del (str.substr (str.++ r10 r9 ) 4 4) 0 0))))
(assert (not (str.contains "bB" (str.toLower r9 ))))
(assert (not (str.contains "C" (str.++ "b" r10 ))))
(assert (not (= "BA" (str.del r11  1 3))))
(assert (not (= "a" (str.del (str.toLower (str.++ r10 r9 )) 2 6))))
(assert (= "" (str.substr (str.substr r8  3 3) 0 0)))
(assert (str.contains "" (str.substr (str.++ "c" (str.replace_all r7  "a"  "c" )) 2 2)))
(assert (str.contains "" (str.substr (str.replace_all (str.del r8  3 3) "C"  "A" ) 3 3)))
(assert (not (= "" (str.++ "c" r10 ))))
(assert (not (= "" (str.toLower (str.++ "B" r7 )))))
(assert (not (= "c" (str.toLower (str.replace_all r11  "b"  "A" )))))
(assert (not (= "" r7 )))
(assert (str.contains "" (str.replace_all (str.replace_all (str.del r9  2 3) "b"  "B" ) "c"  "A" )))
(assert (not (= "BC" (str.substr r8  2 2))))
(assert (not (= "" (str.++ (str.replace_all (str.del r8  3 3) "C"  "A" )(str.del (str.substr r8  2 2) 0 0)))))
(assert (not (= "B" (str.del r8  1 2))))
(assert (not (= "bc" (str.++ "b" (str.substr r7  3 3)))))
(assert (str.contains "c" (str.replace_all r7  "a"  "c" )))
(assert (= "" (str.replace_all (str.substr (str.del r10  0 3) 0 0) "b"  "B" )))
(assert (not (= "b" (str.replace_all (str.toLower r10 ) "b"  "B" ))))
(assert (not (= "" (str.toLower r8 ))))
(assert (not (= "" (str.substr (str.++ "A" (str.++ r9 r11 )) 2 7))))
(assert (= "" (str.substr (str.del r10  0 3) 0 0)))
(assert (not (= "" (str.del (str.replace_all r7  "a"  "C" ) 3 3))))
(assert (= "" (str.substr (str.del r10  0 3) 0 0)))
(assert (not (= "" (str.toLower r10 ))))
(assert (not (= "" (str.replace_all r7  "B"  "C" ))))
(assert (not (= "" (str.del r11  1 1))))
(assert (not (str.contains "Bb" (str.toLower (str.toLower r7 )))))
(assert (not (= "" (str.replace_all r11  "A"  "C" ))))
(assert (not (= "Cc" (str.del (str.substr r8  2 2) 0 0))))
(assert (not (= "aa" (str.toLower (str.toLower r7 )))))
(assert (not (= "A" (str.del r10  1 3))))
(assert (not (= "" (str.substr (str.del r11  1 1) 1 2))))
(assert (str.contains "" (str.del (str.del (str.replace_all r7  "B"  "C" ) 1 3) 0 1)))
(assert (not (= "" (str.replace_all (str.del r9  2 3) "b"  "B" ))))
(assert (not (str.contains "CA" (str.del (str.substr r11  1 3) 0 2))))
(assert (not (= "" (str.++ "B" (str.++ r10 r9 )))))
(assert (not (= "aC" (str.++ "A" (str.substr (str.del r10  0 3) 0 0)))))
(assert (= "A" (str.substr (str.replace_all r8  "B"  "A" ) 1 2)))
(assert (= "" (str.substr (str.replace_all r8  "B"  "A" ) 1 1)))
(assert (not (str.contains "cb" (str.replace_all (str.++ "c" r9 ) "a"  "A" ))))
(assert (not (str.contains "A" (str.substr (str.del (str.replace_all r7  "B"  "C" ) 1 3) 0 0))))
(assert (not (= "BC" (str.++ (str.replace_all (str.++ "c" r10 ) "a"  "B" )(str.substr (str.++ "c" r10 ) 2 3)))))
(assert (not (str.contains "aB" (str.substr (str.substr (str.del r10  0 3) 0 0) 0 0))))
(assert (not (= "C" (str.replace_all (str.replace_all (str.replace_all r7  "b"  "A" ) "c"  "b" ) "b"  "A" ))))
(assert (not (= "CC" (str.++ r10 r9 ))))
(assert (not (= "Ba" (str.del r9  1 1))))
(assert (not (= "" (str.toLower r11 ))))
(check-sat)