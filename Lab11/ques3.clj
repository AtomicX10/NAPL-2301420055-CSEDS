
;; ==========================================
;; Clojure Java Interoperability
;; ==========================================

(println "===== 1. JAVA STATIC METHODS =====")

;; Calling Java static methods using dot notation

(println "Absolute Value:" (Math/abs -25))

(println "Square Root:" (Math/sqrt 144))

(println "Current Time in Milliseconds:"
         (System/currentTimeMillis))


;; ==========================================
;; 2. CREATING JAVA OBJECTS
;; ==========================================

(println "\n===== 2. CREATING JAVA OBJECTS =====")

;; Creating an ArrayList object
(def my-list (new java.util.ArrayList))

;; Creating a HashMap object
(def my-map (new java.util.HashMap))

(println "Java ArrayList created:" my-list)
(println "Java HashMap created:" my-map)


;; ==========================================
;; 3. INVOKING INSTANCE METHODS
;; ==========================================

(println "\n===== 3. INSTANCE METHODS =====")

;; Adding elements to ArrayList
(.add my-list "Apple")
(.add my-list "Mango")
(.add my-list "Banana")

;; Adding key-value pairs to HashMap
(.put my-map "Name" "Anuj")
(.put my-map "Course" "CSE")
(.put my-map "Year" 3)

;; Calling instance methods
(println "ArrayList:" my-list)
(println "List Size:" (.size my-list))
(println "First Element:" (.get my-list 0))

(println "HashMap:" my-map)
(println "Map Size:" (.size my-map))
(println "Student Name:" (.get my-map "Name"))


;; ==========================================
;; 4. CONVERTING COLLECTIONS
;; ==========================================

(println "\n===== 4. COLLECTION CONVERSION =====")

;; Clojure collection
(def clojure-list [10 20 30 40 50])

;; Convert Clojure collection to Java ArrayList
(def java-list
  (java.util.ArrayList. clojure-list))

(println "Clojure Vector:" clojure-list)
(println "Java ArrayList:" java-list)

;; Convert Java ArrayList to Clojure Vector
(def converted-vector
  (vec java-list))

(println "Converted Clojure Vector:" converted-vector)

;; Convert Clojure Map to Java HashMap
(def clojure-map {:name "Anuj" :age 21})

(def java-map
  (java.util.HashMap. clojure-map))

(println "Clojure Map:" clojure-map)
(println "Java HashMap:" java-map)

;; Convert Java HashMap to Clojure Map
(def converted-map
  (into {} java-map))

(println "Converted Clojure Map:" converted-map)

(println "\n===== PROGRAM COMPLETED =====")
