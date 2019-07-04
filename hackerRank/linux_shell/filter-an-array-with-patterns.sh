#!/usr/bin/env bash

# From the given list, remove the names that contain 'a' or 'A' in them
# If there are no names left after removing these characters, you should display a blank line.
# https://www.hackerrank.com/challenges/bash-tutorials-filter-an-array-with-patterns/problem

#result=$(grep -v "a\|A" ./test.txt)
result=$(grep -v "a\|A")
if [[ ${result} ]]; then
    echo $result | tr ' ' '\n'
else
    echo ""
fi