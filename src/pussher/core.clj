(ns pussher.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))


(def armT '((at T c4)))
(def armB '((at B c6)))
(def armL '((at L y4)))

(def hoz '((at Tblue c3)))
(def hozver '((at Sblue c5)(at Tblue c4)(at Tblue y4)))
(def ver '((at Tblue y3)))
(def crt '((crt Tblue tr) (crt Sblue tr)))

(def random '((at Tblue y3)(at Tblue c5)
               (at Sblue y8)(at Sblue c2)
               (at Cblue y6)(at Cblue c5)
               (at Tgreen y4)(at Tgreen c8)
               (at Sgreen y5)(at Sgreen c4)
               (at Cgreen y7)(at Cgreen c6)


               ))
;================================
; Tests without Netlogo
;================================
(defn test-opsearch [cmd]
  (ops-search state cmd ops :world world)
  )

(defn test-planner [cmd]
  (planner (union state world) cmd planner-ops)
  )


;================================
; Tests with Netlogo
;================================
(defn n-test-opsearch [cmd]
  (n-logosend1 (ops-search state cmd ops :world world))
  )

(defn n-test-planner [cmd]
  (n-logosend1 (planner (union state world) cmd planner-ops))
  )
