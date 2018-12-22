#!/usr/bin/env bash
# count the number of times each line repeats itself (only consider consecutive repetions). This time, compare consecutive lines in a case insensitive manner.
# https://www.hackerrank.com/challenges/text-processing-in-linux-the-uniq-command-3/problem
uniq -c -i | cut -c7-