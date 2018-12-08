#!/usr/bin/env bash
# https://www.hackerrank.com/challenges/text-processing-cut-2/problem
while read str
do
    echo ${str} | cut -c2,7
done