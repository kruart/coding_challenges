#!/usr/bin/env bash
# Display a range of characters starting at the 2nd position of a string and ending at 7th the  position (both positions included).
# https://www.hackerrank.com/challenges/text-processing-cut-3/problem
while read str
do
    # cut -c startIndex-stopIndex
    echo ${str} | cut -c2-7
done