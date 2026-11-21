(ns immutable-data-structures)

;; ==========================================
;; 1. LIST
;; ==========================================

(println "----- LIST -----")

(def my-list '(10 20 30))

;; first
(println "First element:" (first my-list))

;; rest
(println "Rest of list:" (rest my-list))

;; conj adds to the front of a list
(def new-list (conj my-list 5))

(println "Original list:" my-list)
(println "New list after conj:" new-list)


;; ==========================================
;; 2. VECTOR
;; ==========================================

(println "\n----- VECTOR -----")

(def my-vector [10 20 30])

;; conj adds to the end of a vector
(def new-vector (conj my-vector 40))

;; get by index
(println "Element at index 1:" (get my-vector 1))

;; count
(println "Count of original vector:" (count my-vector))

(println "Original vector:" my-vector)
(println "New vector after conj:" new-vector)


;; ==========================================
;; 3. MAP
;; ==========================================

(println "\n----- MAP -----")

(def my-map {:name "Anuj" :age 21 :course "CSE"})

;; assoc adds or updates a key-value pair
(def updated-map (assoc my-map :age 22))

;; dissoc removes a key-value pair
(def map-without-course (dissoc my-map :course))

;; get retrieves a value
(println "Name:" (get my-map :name))

(println "Original map:" my-map)
(println "Map after assoc:" updated-map)
(println "Map after dissoc:" map-without-course)


;; ==========================================
;; 4. SET
;; ==========================================

(println "\n----- SET -----")

(def my-set #{10 20 30})

;; conj adds an element
(def new-set (conj my-set 40))

;; disj removes an element
(def smaller-set (disj my-set 20))

;; contains? checks whether an element exists
(println "Contains 20?" (contains? my-set 20))

(println "Original set:" my-set)
(println "New set after conj:" new-set)
(println "New set after disj:" smaller-set)