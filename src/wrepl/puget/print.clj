(ns wrepl.puget.print
  (:require [integrant.core :as ig]
            [puget.printer :as pp]))

(defmethod ig/init-key :wrepl.puget/print
  [_ options]
  (fn wrepl-puget-print
    [x]
    (pp/cprint x options)
    (when *flush-on-newline*
      (flush))))
