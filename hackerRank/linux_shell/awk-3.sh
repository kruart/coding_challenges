#!/usr/bin/env bash

# https://www.hackerrank.com/challenges/awk-3/problem

awk '{
    avg=($2+$3+$4) / 3
    if(avg >= 80) grade = "A"
    else if(avg >= 60) grade = "B"
    else if(avg >= 50) grade = "C"
    else grade = "FAIL"
    print $1,$2,$3,$4,":",grade
}'

#awk '{
#    print $1,$2,$3,$4,":",(($2+$3+$4) / 3 >= 80) ? "A" :  (($2+$3+$4) / 3 >= 60) ? "B" : (($2+$3+$4) / 3 >= 50) ? "C" : "FAIL"
#}'