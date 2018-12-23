#!/usr/bin/env bash
# Rearrange the rows of the table in descending order of the values for the average temperature in January.
# https://www.hackerrank.com/challenges/text-processing-sort-5/problem
sort -t$'\t' -k2 -nr