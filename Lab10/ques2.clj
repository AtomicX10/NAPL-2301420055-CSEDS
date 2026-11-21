
;; ==========================================
;; Clojure Sequence Processing
;; ==========================================

(println "===== COLLECTION 1 =====")

(def numbers [1 2 3 4 5 6 7 8 9 10])

(println "Original Collection:" numbers)

;; 1. MAP - Square each element
(println "Squares:" (map #(* % %) numbers))

;; 2. FILTER - Select even numbers
(println "Even Numbers:" (filter even? numbers))

;; 3. REDUCE - Calculate sum
(println "Sum:" (reduce + numbers))

;; 4. TAKE - Take first 5 elements
(println "Take first 5:" (take 5 numbers))

;; 5. DROP - Remove first 5 elements
(println "Drop first 5:" (drop 5 numbers))

;; THREADING MACRO (->>)
;; Filter even numbers and then square them
(println "Threading Result:"
         (->> numbers
              (filter even?)
              (map #(* % %))))


;; ==========================================
;; COLLECTION 2
;; ==========================================

(println "\n===== COLLECTION 2 =====")

(def numbers2 [11 12 13 14 15 16 17 18 19 20])

(println "Original Collection:" numbers2)

;; 1. MAP - Add 10 to each element
(println "After adding 10:" (map #(+ % 10) numbers2))

;; 2. FILTER - Select numbers greater than 15
(println "Numbers greater than 15:"
         (filter #(> % 15) numbers2))

;; 3. REDUCE - Find maximum number
(println "Maximum Number:" (reduce max numbers2))

;; 4. TAKE - Take first 4 elements
(println "Take first 4:" (take 4 numbers2))

;; 5. DROP - Remove first 4 elements
(println "Drop first 4:" (drop 4 numbers2))

;; THREADING MACRO (->>)
;; Select numbers greater than 15 and multiply by 2
(println "Threading Result:"
         (->> numbers2
              (filter #(> % 15))
              (map #(* % 2))))
