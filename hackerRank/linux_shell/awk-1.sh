#!/usr/bin/env bash

# Your task is to identify those lines that do not contain all three scores for students.
# https://www.hackerrank.com/challenges/awk-1/problem
awk '{
    if($2 == "" || $3 == "" || $4 == "")
    print "Not all scores are available for",$1
}'