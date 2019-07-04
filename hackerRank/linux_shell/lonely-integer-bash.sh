#!/usr/bin/env bash

# Your task is to find the number that occurs only once in array.
# https://www.hackerrank.com/challenges/lonely-integer-2/problem

read n
read -a numbers

num=0
for it in ${numbers[*]}; do
    num=$(( $num ^ it ))    # xor trick to find lonely number
done

echo ${num}