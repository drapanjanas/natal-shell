(ns
 natal-shell.interaction-manager
 "This namespace is automatically generated from the React Native docs.")
(clojure.core/defmacro
 run-after-interactions
 [& args]
 (clojure.core/seq
  (clojure.core/concat
   (clojure.core/list '.runAfterInteractions)
   (clojure.core/list 'js/React.InteractionManager)
   args)))
(clojure.core/defmacro
 create-interaction-handle
 [& args]
 (clojure.core/seq
  (clojure.core/concat
   (clojure.core/list '.createInteractionHandle)
   (clojure.core/list 'js/React.InteractionManager)
   args)))
(clojure.core/defmacro
 clear-interaction-handle
 [& args]
 (clojure.core/seq
  (clojure.core/concat
   (clojure.core/list '.clearInteractionHandle)
   (clojure.core/list 'js/React.InteractionManager)
   args)))
(clojure.core/defmacro
 events
 [& args]
 (clojure.core/seq
  (clojure.core/concat
   (clojure.core/list '.-Events)
   (clojure.core/list 'js/React.InteractionManager)
   args)))
(clojure.core/defmacro
 add-listener
 [& args]
 (clojure.core/seq
  (clojure.core/concat
   (clojure.core/list '.-addListener)
   (clojure.core/list 'js/React.InteractionManager)
   args)))
