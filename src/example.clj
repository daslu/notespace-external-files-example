(ns example
  (:require [notespace.api :as notespace]
            [notespace.kinds :as kind]))

(def filename (str (rand-int 9999) ".txt"))

["We'll create a file here:"]
(notespace/file-target-path filename)

(spit (notespace/file-target-path filename)
      "hello")

["Now let us link to it:"]

^kind/hiccup
(notespace/file-link-tag (format "[click to open %s]" filename)
                         filename)
