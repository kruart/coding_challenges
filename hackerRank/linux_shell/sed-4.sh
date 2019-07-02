#!/usr/bin/env bash

# https://www.hackerrank.com/challenges/sed-command-4/problem
# For each credit card number, print its masked version on a new line.
sed 's/[0-9]* \b/**** /g'