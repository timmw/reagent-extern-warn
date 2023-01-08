1. clone this
2. npm install
3. npx shadow-cljs watch app
4. see following warning in terminal

```
[:app] Build completed. (141 files, 1 compiled, 1 warnings, 0.10s)

------ WARNING #1 - :infer-warning ---------------------------------------------
 File: /home/tim/Projects/sandbox/extern-warn/src/main/extern_warn.cljs:5:3
--------------------------------------------------------------------------------
   2 |   (:require [reagent.core :as r]
   3 |             [reagent.dom :as d]))
   4 | (defn c []
   5 |   (r/with-let []
---------^----------------------------------------------------------------------
 Cannot infer target type in expression (. with-let11498 -generation)
--------------------------------------------------------------------------------
   6 |     [:div "hello"]))
   7 | 
   8 | (defn main []
   9 |   (d/render [c] (.getElementById js/document "root")))
--------------------------------------------------------------------------------
```
