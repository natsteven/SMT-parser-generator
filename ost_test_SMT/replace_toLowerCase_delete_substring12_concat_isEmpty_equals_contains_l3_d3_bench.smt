(set-logic QF_S)
(set-option :parse-transducers true)
(set-option :produce-models true)
(define-fun-rec toLower ((x String) (y String)) Bool
   (or (and (= x "") (= y ""))
       (and (not (= x "")) (not (= y ""))
           (= (char.code (str.head y))
               (ite (and (<= 65 (char.code (str.head x)))
                       (<= (char.code (str.head x)) 90))
                   (+ (char.code (str.head x)) 32)
                   (char.code (str.head x))))
           (toLower (str.tail x) (str.tail y))))
)
(define-fun str.del ((x String) (a Int) (b Int)) String
  (str.++ (str.substr x 0 a) (str.substr x b (str.len x))))
(declare-fun r10 () String)
(declare-fun r11 () String)
(declare-fun r7 () String)
(declare-fun r8 () String)
(declare-fun r9 () String)
(declare-fun L16  () String)
(declare-fun L49  () String)
(declare-fun L34  () String)
(declare-fun L13  () String)
(declare-fun L47  () String)
(declare-fun L15  () String)
(declare-fun L37  () String)
(declare-fun L7  () String)
(declare-fun L30  () String)
(declare-fun L52  () String)
(declare-fun L8  () String)
(declare-fun L53  () String)
(declare-fun L5  () String)
(declare-fun L11  () String)
(declare-fun L55  () String)
(declare-fun L3  () String)
(declare-fun L4  () String)
(declare-fun L1  () String)
(declare-fun L2  () String)
(declare-fun L0  () String)
(assert (toLower (str.++ "c" L1 ) L0 ))
(assert (toLower r9  L2 ))
(assert (toLower r10  L1 ))
(assert (toLower L5  L4 ))
(assert (toLower r11  L3 ))
(assert (toLower r8  L55 ))
(assert (toLower L3  L11 ))
(assert (toLower r7  L5 ))
(assert (toLower (str.replace_all r11  "b"  "A" ) L53 ))
(assert (toLower L4  L8 ))
(assert (toLower (str.++ "B" r7 ) L52 ))
(assert (toLower (str.del r9  3 3) L30 ))
(assert (toLower (str.++ r10 r9 ) L7 ))
(assert (toLower (str.++ "c" r9 ) L37 ))
(assert (toLower (str.del (str.substr r8  2 0) 0 0) L15 ))
(assert (toLower L30  L47 ))
(assert (toLower (str.++ "c" L5 ) L13 ))
(assert (toLower (str.++ "b" (str.substr r7  3 0)) L34 ))
(assert (toLower (str.replace_all (str.replace_all r11  "A"  "C" ) "A"  "c" ) L49 ))
(assert (toLower (str.substr (str.replace_all r7  "B"  "C" ) 1 0) L16 ))

(assert (not (= "" L0 )))
(assert (not (str.contains (str.replace_all r7  "A"  "B" )"bB" )))
(assert (= "" (str.del r10  0 3)))
(assert (= (str.substr (str.replace_all L2  "a"  "C" ) 3 0)"" ))
(assert (not (str.contains (str.replace_all L3  "a"  "A" )"aa" )))
(assert (not (= (str.substr (str.++ r10 r9 ) 4 0)"aa" )))
(assert (not (= "" (str.substr r10  1 1))))
(assert (not (= "" (str.++ L4 (str.del (str.replace_all r7  "B"  "C" ) 1 3)))))
(assert (= "" (str.substr (str.del (str.substr r11  1 2) 1 1) 0 0)))
(assert (= "" (str.replace_all (str.del (str.substr r8  2 0) 0 0) "B"  "A" )))
(assert (not (str.contains (str.substr r11  1 2)"b" )))
(assert (not (= "" (str.replace_all (str.substr (str.del r11  1 1) 1 1) "c"  "C" ))))
(assert (not (str.contains (str.del r8  3 3)"cb" )))
(assert (str.contains L5 "" ))
(assert (str.contains (str.substr r10  1 1)"" ))
(assert (not (= "" L7 )))
(assert (not (= L8 "c" )))
(assert (not (= "" (str.replace_all r11  "b"  "A" ))))
(assert (not (= (str.++ (str.replace_all r8  "B"  "A" )(str.del r9  3 3))"BB" )))
(assert (not (= (str.substr (str.replace_all r7  "B"  "C" ) 1 0)"b" )))
(assert (str.contains (str.++ (str.replace_all r8  "B"  "A" )(str.del r9  3 3)L11 )"" ))
(assert (not (= L13 "" )))
(assert (not (= (str.++ "c" r9 )"bc" )))
(assert (not (= L15 "Cb" )))
(assert (not (str.contains L16 "CC" )))
(assert (not (= L2 "" )))
(assert (not (str.contains (str.replace_all L11  "b"  "B" )"Bb" )))
(assert (= "" (str.del (str.del (str.substr r8  2 0) 0 0) 0 0)))
(assert (not (= "" L2 )))
(assert (= "" (str.substr (str.replace_all L1  "b"  "B" ) 2 0)))
(assert (not (= "" (str.++ "c" (str.replace_all r7  "a"  "c" )(str.replace_all (str.del r9  2 3) "b"  "B" )))))
(assert (not (= L8 "bb" )))
(assert (not (= r10 "" )))
(assert (not (str.contains (str.substr r8  3 0)"B" )))
(assert (not (= (str.replace_all (str.del (str.substr r11  1 2) 1 1) "B"  "a" )"ba" )))
(assert (not (= L1 "b" )))
(assert (str.contains (str.++ "c" L5 )"" ))
(assert (not (str.contains (str.del (str.replace_all L3  "a"  "A" ) 0 2)"B" )))
(assert (not (= "" (str.replace_all (str.del (str.replace_all r7  "a"  "C" ) 3 3) "C"  "b" ))))
(assert (not (= "" (str.replace_all (str.++ "c" r10 ) "a"  "B" ))))
(assert (not (= "" (str.++ (str.replace_all L2  "a"  "C" )(str.del (str.substr r8  2 0) 0 0)))))
(assert (not (str.contains (str.replace_all (str.substr r10  1 1) "C"  "b" )"BB" )))
(assert (not (= (str.++ "c" L1 )"" )))
(assert (str.contains (str.replace_all r8  "B"  "A" )"" ))
(assert (= (str.del (str.substr (str.del r10  0 3) 0 0) 0 0)"" ))
(assert (not (= "" r9 )))
(assert (not (= (str.replace_all (str.replace_all r11  "A"  "C" ) "A"  "c" )"b" )))
(assert (str.contains (str.del (str.substr r11  1 2) 1 1)"" ))
(assert (not (= (str.++ r9 r11 )"" )))
(assert (not (str.contains (str.substr (str.++ "c" r10 ) 2 1)"cB" )))
(assert (not (= (str.++ "B" r7 )"A" )))
(assert (not (str.contains L30 "aC" )))
(assert (not (= "" (str.substr (str.del (str.replace_all r7  "a"  "C" ) 3 3) 0 1))))
(assert (not (= (str.substr (str.++ r7 r9 ) 1 5)"c" )))
(assert (not (= (str.del (str.replace_all L2  "a"  "C" ) 3 3)"" )))
(assert (not (= L4 "" )))
(assert (not (= (str.++ (str.substr (str.++ "c" r10 ) 2 1)(str.substr (str.replace_all r7  "B"  "C" ) 1 0))"" )))
(assert (not (str.contains r11 "c" )))
(assert (not (= "" L34 )))
(assert (str.contains (str.replace_all r8  "c"  "a" )"" ))
(assert (not (= L3 "AB" )))
(assert (not (= "" (str.del L30  3 3))))
(assert (str.contains L37 "" ))
(assert (not (= "" (str.del L1  3 3))))
(assert (= "" (str.replace_all (str.substr (str.substr r8  3 0) 0 0) "A"  "c" )))
(assert (= "" (str.substr r10  0 0)))
(assert (not (str.contains (str.substr r7  2 0)"B" )))
(assert (not (= (str.del (str.replace_all r7  "B"  "C" ) 1 3)"" )))
(assert (not (= "" (str.++ (str.replace_all (str.++ "c" r9 ) "a"  "A" )(str.substr (str.replace_all r7  "B"  "C" ) 1 0)))))
(assert (not (= L5 "" )))
(assert (not (= (str.del (str.substr r8  2 0) 0 0)"CC" )))
(assert (not (str.contains (str.del (str.substr r8  0 2) 0 2)"B" )))
(assert (not (str.contains (str.replace_all (str.replace_all (str.replace_all r11  "A"  "C" ) "A"  "c" ) "a"  "b" )"c" )))
(assert (not (str.contains (str.++ "C" (str.substr r7  2 0))"CC" )))
(assert (str.contains (str.del (str.substr (str.++ "c" r10 ) 2 1) 1 1)"" ))
(assert (str.contains (str.del r9  3 3)"" ))
(assert (not (str.contains L11 "Bb" )))
(assert (not (= "" (str.++ "A" (str.++ r9 r11 )))))
(assert (str.contains (str.++ r7 r9 )"" ))
(assert (not (str.contains L34 "c" )))
(assert (= "" (str.substr r8  3 0)))
(assert (not (= "" (str.++ "B" r10 ))))
(assert (not (= "" (str.++ (str.substr r11  1 2)(str.++ "c" r7 )))))
(assert (str.contains (str.del r8  0 1)"A" ))
(assert (not (str.contains (str.replace_all (str.replace_all r7  "b"  "A" ) "c"  "b" )"a" )))
(assert (not (= "" (str.++ "c" (str.replace_all r7  "a"  "c" )))))
(assert (not (= "" L11 )))
(assert (not (= "" (str.replace_all L2  "a"  "C" ))))
(assert (not (= r8 "Aa" )))
(assert (not (= (str.++ r11 r9 )"" )))
(assert (not (= (str.substr (str.del (str.substr r11  1 2) 0 2) 0 0)"b" )))
(assert (not (str.contains (str.del (str.replace_all (str.substr r10  1 1) "C"  "b" ) 1 1)"B" )))
(assert (not (= (str.replace_all r7  "b"  "A" )"Ac" )))
(assert (not (= (str.++ (str.replace_all r7  "A"  "B" )L2 )"" )))
(assert (str.contains (str.del (str.replace_all r7  "B"  "C" ) 3 3)"c" ))
(assert (= "" (str.substr r7  3 0)))
(assert (not (= "" (str.del (str.++ r9 r11 ) 4 4))))
(assert (not (= "" (str.replace_all r8  "c"  "a" ))))
(assert (not (str.contains (str.replace_all (str.del r8  3 3) "C"  "A" )"bC" )))
(assert (not (= "" (str.++ "c" r7 ))))
(assert (str.contains (str.++ "A" (str.++ (str.substr r11  1 2)(str.++ "c" r7 )))"" ))
(assert (not (= "" (str.replace_all r7  "a"  "C" ))))
(assert (not (str.contains (str.del r9  2 3)"BA" )))
(assert (not (= L47 "b" )))
(assert (not (= (str.substr r8  0 2)"A" )))
(assert (not (= "" L49 )))
(assert (not (str.contains (str.del (str.substr (str.++ r10 r9 ) 4 0) 0 0)"a" )))
(assert (not (str.contains L2 "bB" )))
(assert (not (str.contains (str.++ "b" r10 )"C" )))
(assert (not (= (str.del r11  1 3)"BA" )))
(assert (not (= (str.del L7  2 6)"a" )))
(assert (= "" (str.substr (str.substr r8  3 0) 0 0)))
(assert (str.contains (str.substr (str.++ "c" (str.replace_all r7  "a"  "c" )) 2 0)"" ))
(assert (str.contains (str.substr (str.replace_all (str.del r8  3 3) "C"  "A" ) 3 0)"" ))
(assert (not (= (str.++ "c" r10 )"" )))
(assert (not (= "" L52 )))
(assert (not (= L53 "c" )))
(assert (not (= "" r7 )))
(assert (str.contains (str.replace_all (str.replace_all (str.del r9  2 3) "b"  "B" ) "c"  "A" )"" ))
(assert (not (= (str.substr r8  2 0)"BC" )))
(assert (not (= (str.++ (str.replace_all (str.del r8  3 3) "C"  "A" )(str.del (str.substr r8  2 0) 0 0))"" )))
(assert (not (= (str.del r8  1 2)"B" )))
(assert (not (= (str.++ "b" (str.substr r7  3 0))"bc" )))
(assert (str.contains (str.replace_all r7  "a"  "c" )"c" ))
(assert (= "" (str.replace_all (str.substr (str.del r10  0 3) 0 0) "b"  "B" )))
(assert (not (= (str.replace_all L1  "b"  "B" )"b" )))
(assert (not (= "" L55 )))
(assert (not (= (str.substr (str.++ "A" (str.++ r9 r11 )) 2 5)"" )))
(assert (= "" (str.substr (str.del r10  0 3) 0 0)))
(assert (not (= (str.del (str.replace_all r7  "a"  "C" ) 3 3)"" )))
(assert (= "" (str.substr (str.del r10  0 3) 0 0)))
(assert (not (= "" L1 )))
(assert (not (= "" (str.replace_all r7  "B"  "C" ))))
(assert (not (= "" (str.del r11  1 1))))
(assert (not (str.contains L4 "Bb" )))
(assert (not (= "" (str.replace_all r11  "A"  "C" ))))
(assert (not (= (str.del (str.substr r8  2 0) 0 0)"Cc" )))
(assert (not (= L4 "aa" )))
(assert (not (= (str.del r10  1 3)"A" )))
(assert (not (= "" (str.substr (str.del r11  1 1) 1 1))))
(assert (str.contains (str.del (str.del (str.replace_all r7  "B"  "C" ) 1 3) 0 1)"" ))
(assert (not (= "" (str.replace_all (str.del r9  2 3) "b"  "B" ))))
(assert (not (str.contains (str.del (str.substr r11  1 2) 0 2)"CA" )))
(assert (not (= "" (str.++ "B" (str.++ r10 r9 )))))
(assert (not (= (str.++ "A" (str.substr (str.del r10  0 3) 0 0))"aC" )))
(assert (= (str.substr (str.replace_all r8  "B"  "A" ) 1 1)"A" ))
(assert (= "" (str.substr (str.replace_all r8  "B"  "A" ) 1 0)))
(assert (not (str.contains (str.replace_all (str.++ "c" r9 ) "a"  "A" )"cb" )))
(assert (not (str.contains (str.substr (str.del (str.replace_all r7  "B"  "C" ) 1 3) 0 0)"A" )))
(assert (not (= (str.++ (str.replace_all (str.++ "c" r10 ) "a"  "B" )(str.substr (str.++ "c" r10 ) 2 1))"BC" )))
(assert (not (str.contains (str.substr (str.substr (str.del r10  0 3) 0 0) 0 0)"aB" )))
(assert (not (= (str.replace_all (str.replace_all (str.replace_all r7  "b"  "A" ) "c"  "b" ) "b"  "A" )"C" )))
(assert (not (= (str.++ r10 r9 )"CC" )))
(assert (not (= (str.del r9  1 1)"Ba" )))
(assert (not (= "" L3 )))
(check-sat)
(get-model)
(exit)
