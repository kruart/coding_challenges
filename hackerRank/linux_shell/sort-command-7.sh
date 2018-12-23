#!/usr/bin/env bash
# A text file with multiple lines of pipe-delimited data. You need to sort this file in descending order of the second column (i.e. the average monthly temperature in January).
# https://www.hackerrank.com/challenges/text-processing-sort-7/problem
sort -t'|' -k2 -nr