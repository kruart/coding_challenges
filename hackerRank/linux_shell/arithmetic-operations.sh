#!/usr/bin/env bash

# https://www.hackerrank.com/challenges/bash-tutorials---arithmetic-operations/problem
read input
printf "%.3f\n" `echo "$input" | bc -l`
#echo "scale=3; $input" | bc
