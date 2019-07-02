#!/usr/bin/env bash

# https://www.hackerrank.com/challenges/sed-command-5/problem
# reverse the ordering of segments in each credit card number
sed 's/\([0-9]*\) \([0-9]*\) \([0-9]*\) \([0-9]*\)/\4 \3 \2 \1/g' ./test.txt