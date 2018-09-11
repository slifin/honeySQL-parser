(ns sql-translation.core)
(require ['clj-antlr.core :as 'antlr])
(use 'clojure.pprint)

(defn -main
  []
  (def mysql (antlr/parser "src/sql_translation/MySqlLexer.g4"))
  (pprint (mysql "SELECT * FROM users")))

