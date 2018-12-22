#!/usr/bin/env bash
# Read in one character from the user (this may be 'Y', 'y', 'N', 'n'). If the character is 'Y' or 'y' display "YES". If the character is 'N' or 'n' display "NO".
# https://www.hackerrank.com/challenges/bash-tutorials---getting-started-with-conditionals/problem
read arg
#if [ $arg == 'Y' ] || [ $arg == 'y' ]
if [[ $arg == 'Y' || $arg == 'y' ]]
then
    echo "YES"
else
    echo "NO"
fi