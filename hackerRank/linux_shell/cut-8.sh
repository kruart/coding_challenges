#!/usr/bin/env bash
# Given a sentence, identify and display its first three words. Assume that the space (' ') is the only delimiter between words.
# https://www.hackerrank.com/challenges/text-processing-cut-8/problem
while read str
do
    echo "$str" | cut -d ' ' -f-3
done