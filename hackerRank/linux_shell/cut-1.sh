#!/usr/bin/env bash
# https://www.hackerrank.com/challenges/text-processing-cut-1/problem
while read str
do
    echo ${str} | cut -c3
done
