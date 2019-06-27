#!/usr/bin/env bash

# Concatenate every 2 lines of input with a semi-colon.
# https://www.hackerrank.com/challenges/awk-4/problem

awk 'ORS=NR%2?";":"\n"'