; Intro to Strings

; Difficulty:	Elementary
; Topics:	

; Clojure strings are Java strings. This means that you can use any of the Java string methods on Clojure strings.

; (= __ (.toUpperCase "hello world"))

; Solution:

(= "HELLO WORLD" (.toUpperCase "hello world"))