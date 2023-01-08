(ns extern-warn
  (:require [reagent.core :as r]
            [reagent.dom :as d]))
(defn c []
  (r/with-let []
    [:div "hello"]))

(defn main []
  (d/render [c] (.getElementById js/document "root")))
