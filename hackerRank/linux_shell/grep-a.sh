#!/usr/bin/env bash

#  use grep to display all those lines which contain any of the following words in them: the that then those
# https://www.hackerrank.com/challenges/text-processing-in-linux-the-grep-command-4/problem

# -i - ignore case
# -w - full word
# -E - regular  expression
grep -iwE "the|that|then|those"