#!/usr/bin/env bash
# https://www.hackerrank.com/challenges/text-processing-cut-3/problem
while read str
do
    # cut -c startIndex-stopIndex
    echo ${str} | cut -c2-7
done