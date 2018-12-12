#!/usr/bin/env bash
# Given a sentence, identify and display its fourth word. Assume that the space(' ') is the only delimiter between words.
# https://www.hackerrank.com/challenges/text-processing-cut-7/problem
while read str
do
    echo "$str" | cut -d ' ' -f4
done