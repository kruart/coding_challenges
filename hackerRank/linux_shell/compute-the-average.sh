#!/usr/bin/env bash

# Display the average of the N integers, rounded off to three decimal places.
# https://www.hackerrank.com/challenges/bash-tutorials---compute-the-average/problem

read n
sum=0
for i in $(seq 1 ${n});
do
    read k
    sum=$(( $sum + $k ))
done

printf "%.3f\n" `echo "$sum / $n" | bc -l`
