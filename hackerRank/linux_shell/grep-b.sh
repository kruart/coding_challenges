#!/usr/bin/env bash

# https://www.hackerrank.com/challenges/text-processing-in-linux-the-grep-command-5/problem

# -E - regular  expression
grep -E "([0-9]) ?\1" ./test.txt