(ns toy.doo-runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [toy.core-test]))

(doo-tests 'toy.core-test)

