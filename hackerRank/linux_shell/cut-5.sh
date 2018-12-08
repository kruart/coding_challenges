#!/usr/bin/env bash
# https://www.hackerrank.com/challenges/text-processing-cut-5/problem
while read str
do
    # default -d delimeter is tab, so we don't have to write it
    # -f1-3 == -f-3
    echo "$str" | cut -f-3  # way with quotes is used for substitution(regex, cut, replace, etc) operations
#    echo ${str} | cut -f-3  # it doesn't work correctly, use quotes
done