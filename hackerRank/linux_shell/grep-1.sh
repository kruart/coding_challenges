#!/usr/bin/env bash

# Output only those lines that contain the word 'the'. The search should be case sensitive.
# The relative ordering of the lines in the output should be the same as it was in the input.
# https://www.hackerrank.com/challenges/text-processing-in-linux-the-grep-command-1/problem

# -w - full word
grep -w "the"