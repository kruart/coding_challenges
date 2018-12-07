#!/usr/bin/env bash
# https://www.hackerrank.com/challenges/bash-tutorials---looping-and-skipping/problem

# way 1
for num in {1..99}
do
    rem=$((num % 2))
#    if [ $rem -ne 0 ]; then
    if [ $rem -eq 1 ]; then
        echo ${num}
    fi
done

# way 2
printf '%s\n' {1..99..2}

# way 3
seq 1 99 | sed -n 'p;n'

# way 4
seq 1 2 99