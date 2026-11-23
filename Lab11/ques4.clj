
;; ==========================================
;; Clojure Exception Handling
;; ==========================================

(println "===== 1. ARITHMETIC EXCEPTION =====")

;; Handling division by zero
(try
  (println "Result:" (/ 10 0))

  (catch ArithmeticException e
    (println "Arithmetic Exception:" (.getMessage e))
    (println "Recovery: Cannot divide by zero. Using 0 instead."))

  (finally
    (println "Finally block: Arithmetic operation completed.")))


;; ==========================================
;; 2. NULL POINTER EXCEPTION
;; ==========================================

(println "\n===== 2. NULL POINTER EXCEPTION =====")

(try
  ;; Calling a method on null
  (.toUpperCase nil)

  (catch NullPointerException e
    (println "Null Pointer Exception:" (.getMessage e))
    (println "Recovery: Null value detected. Using default text."))

  (finally
    (println "Finally block: Null check completed.")))


;; ==========================================
;; 3. CUSTOM EXCEPTION USING EX-INFO
;; ==========================================

(println "\n===== 3. CUSTOM EXCEPTION =====")

;; Function that deliberately throws a custom exception
(defn check-age [age]
  (if (< age 18)
    (throw (ex-info "Age must be at least 18"
                    {:age age
                     :type :invalid-age}))
    (println "Age is valid. Access granted.")))

(try
  (check-age 15)

  (catch clojure.lang.ExceptionInfo e
    (println "Custom Exception:" (ex-message e))

    ;; Getting additional exception information
    (println "Exception Data:" (ex-data e))

    ;; Graceful recovery
    (println "Recovery: Minimum age is 18. Please try again."))

  (finally
    (println "Finally block: Age verification completed.")))


;; ==========================================
;; 4. SUCCESSFUL EXECUTION
;; ==========================================

(println "\n===== SUCCESSFUL EXECUTION =====")

(try
  (check-age 21)

  (catch clojure.lang.ExceptionInfo e
    (println "Exception:" (ex-message e)))

  (finally
    (println "Finally block: Verification finished.")))


(println "\n===== PROGRAM COMPLETED =====")
