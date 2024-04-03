(declare-fun r2 () String)
(declare-fun r3 () String)
(declare-fun r4 () String)
(declare-fun r5 () String)
(declare-fun r6 () String)
(declare-fun r7 () String)
(declare-fun r8 () String)
(declare-fun r9 () String)
(declare-fun r10 () String)
(declare-fun r12 () String)
(declare-fun r11 () String)
(declare-fun r0 () String)
(declare-fun r1 () String)
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
(define-fun-rec str.toUpper ((x String)) String
  (ite (= x "")
      ""
      (let ((Head (str.at x 0)))
        (str.++ 
          (ite (and (<= 97 (str.to_code Head)) 
                     (<= (str.to_code Head) 122))
               (str.from_code (- (str.to_code Head) 32))
               Head)
          (str.toUpper (str.substr x 1 (- (str.len x) 1)))))))

(assert (not (= r0 (str.++ r4 (str.++ "ACA" (str.++ "C" (str.++ r3 (str.++ "A" (str.++ r2 (str.++ "C" r1 ))))))))))
(assert (= r0 (str.++ r8 (str.++ "AACA" (str.++ r7 (str.++ "A" (str.++ r6 (str.++ "A" r5 ))))))))
(assert (= r0 (str.++ r12 (str.++ "ACA" (str.++ r11 (str.++ "A" (str.++ r10 (str.++ "C" r9 ))))))))
(check-sat)
