(ns DOS_POM.dos.core
  (:require [cljs.nodejs :as nodejs]))

(nodejs/enable-util-print!)

(defn my-add [ops]
  (apply + (mapv js/parseInt ops)))

(defn -main [& args]
  (let [total (my-add args)]
    total))

(set! *main-cli-fn* -main)
