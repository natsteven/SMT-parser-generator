(declare-fun r10 () String)
(declare-fun r3 () String)
(declare-fun r4 () String)
(declare-fun r5 () String)
(declare-fun r6 () String)
(declare-fun r7 () String)
(declare-fun r8 () String)
(declare-fun r9 () String)
(declare-fun r0 () String)
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

(assert (not (= r0 (str.++ r6 (str.++ "CA" (str.++ r5 (str.++ "AA" (str.++ r4 (str.++ "A" r3 )))))))))
(assert (= r0 (str.++ r10 (str.++ "ACA" (str.++ r9 (str.++ "A" (str.++ r8 (str.++ "C" r7 ))))))))
(check-sat)
