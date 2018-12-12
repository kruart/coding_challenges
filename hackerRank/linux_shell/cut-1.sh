#!/usr/bin/env bash
# For each line of input, print its 3rd character on a new line
# https://www.hackerrank.com/challenges/text-processing-cut-1/problem
while read str
do
    echo ${str} | cut -c3
done
