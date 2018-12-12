#!/usr/bin/env bash
# Display the first four characters from each line of text.
# https://www.hackerrank.com/challenges/text-processing-cut-4/problem
while read str
do
    # cut -c startIndex-stopIndex
    echo ${str} | cut -c1-4
done