#!/usr/bin/env bash
# count the number of times each line repeats itself. Only consider consecutive repetitions.
# https://www.hackerrank.com/challenges/text-processing-in-linux-the-uniq-command-2/problem

uniq -c | sed 's/^\s*//'
#uniq -c | colrm 1 6
#uniq -c | cut -c7-