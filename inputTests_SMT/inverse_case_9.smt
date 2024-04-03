(declare-fun r5 () String)
(declare-fun r6 () String)
(declare-fun r7 () String)
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

(assert (str.contains "AAA" (str.++ r5 r6 )))
(assert (str.contains "B" (str.++ r7 r6 )))
(check-sat)
