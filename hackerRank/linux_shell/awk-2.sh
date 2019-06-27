#!/usr/bin/env bash

# Your task is to identify whether each of the students has passed or failed.
# A student is considered to have passed if (s)he has a score 50 or more in each of the three subjects.
# https://www.hackerrank.com/challenges/awk-2/problem

awk '{
    if($2 < 50 || $3 < 50  || $4 < 50)
        print $1,": Fail"
    else
        print $1,": Pass"
}'