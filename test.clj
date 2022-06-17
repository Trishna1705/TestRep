(use '[app.pizza :only [get-pizza-slice]])
(ns app.pizza)

(println (get-pizza-slice))
(println pizza-rating-map)
(println *ns*)
(println (get-rating :margrita))

;; (defn migratoryBirds [arr]
;;     (def ele-freq (frequencies arr))
;;     (def ans)
;;     (for [[ele frq] ele-freq]
;;         (if (= frq (apply max (vals ele-freq))) 
;;           (def ans ele)))
;;   ans)

;; (println (migratoryBirds [1 4 4 4 5 3]))
;; (println ans)

;; (sort [1 4 4 4 5 3])

;; (split-at 2 [:a :b :c :d])
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; (defn circularArrayRotation [a k queries]
;;   (let [[frnt bck] (split-at (- (count queries) k) a)]
;;     (def rotated (concat bck frnt))
;;     (map #(nth rotated %) queries))
;;   )

;; (println (circularArrayRotation [1 2 3] 2 [0 1 2]))
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; (defn repeatedString [s n]
;;   (def string-count (Math/floor (/ n (count s))))
;;   (def count-per-str (count (re-seq #"a" s)))
;;   (def n (cast java.lang.Long n))
;;   (->>
;;    (count s)
;;    (* string-count)
;;    (- n)
;;    (subs s 0)
;;    (re-seq #"a")
;;    (count )
;;    (+ (* string-count count-per-str))
;;    java.lang.Long)
;;   ;; (subs s 0 (- n (* string-count (count s))))
;;   )
;; (println (repeatedString "a" 1000000000000))

