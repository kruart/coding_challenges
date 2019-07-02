#!/usr/bin/env bash

# https://www.hackerrank.com/challenges/text-processing-in-linux-the-sed-command-1/problem
# For each line in a given input file, transform the first occurrence of the word 'the' with 'this'.
sed 's/\bthe\b/this/'  # \b - word border