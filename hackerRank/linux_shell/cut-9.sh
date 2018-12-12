#!/usr/bin/env bash
# Given a tab delimited file with several columns (tsv format) print the fields from second fields to last field.
# https://www.hackerrank.com/challenges/text-processing-cut-9/problem
while read str
do
    echo "$str" | cut -f2-
done