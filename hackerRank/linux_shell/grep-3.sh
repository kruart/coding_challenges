#!/usr/bin/env bash

# Only display those lines that do NOT contain the word 'that'. The relative ordering of the lines should be the same as it was in the input file.
# https://www.hackerrank.com/challenges/text-processing-in-linux-the-grep-command-3/problem

# -i - ignore case
# -w - full word
grep -iwv "that"