#!/usr/bin/env bash
# You need to sort this file in ascending order of the second column (i.e. the average monthly temperature in January).
# https://www.hackerrank.com/challenges/text-processing-sort-6/problem
sort -t$'\t' -k2 -n     # -k2,2n also works