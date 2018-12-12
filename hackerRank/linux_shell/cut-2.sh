#!/usr/bin/env bash
# Display the 2nd and 7th character from each line of text.
# https://www.hackerrank.com/challenges/text-processing-cut-2/problem
while read str
do
    echo ${str} | cut -c2,7
done