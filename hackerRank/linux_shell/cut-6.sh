#!/usr/bin/env bash
# Print the characters from thirteenth position to the end.
# https://www.hackerrank.com/challenges/text-processing-cut-6/problem
while read str
do
    echo "$str" | cut -c13-
done