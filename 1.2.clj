; Write a function called (collection-type col)
; that returns :list, :map or :vector based on
; the type of collection col.
(def mapping {"class clojure.lang.PersistentList" :list
              "class clojure.lang.PersistentVector" :vector
              "class clojure.lang.PersistentArrayMap" :map})

(def collection-type (fn [col] (mapping (str (type col)))))

; Tests.
(if (= :list (collection-type '(1 2 3))) (println "OK"))
(if (= :vector (collection-type [1 2 3])) (println "OK"))
(if (= :map (collection-type {1 2 3 4})) (println "OK"))
