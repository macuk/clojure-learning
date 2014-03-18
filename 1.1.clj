; Implement a function called (big st n)
; that returns true if a string st is longer
; than n characters.
(def big (fn [st n] (> (count st) n)))

; Tests.
(if (= true (big "ala" 1)) (println "OK"))
(if (= false (big "ala" 3)) (println "OK"))
(if (= false (big "ala" 5)) (println "OK"))
