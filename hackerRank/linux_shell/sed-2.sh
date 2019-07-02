#!/usr/bin/env bash

# https://www.hackerrank.com/challenges/text-processing-in-linux-the-sed-command-2/problem
# For each line in a given input file, transform all the occurrences of the word 'thy' with 'your'.
# The search should be case insensitive, i.e. 'thy', 'Thy', 'tHy' etc. should be transformed to 'your'.
sed 's/\bthy\b/your/gi'    # \b - word border