#!/usr/bin/env bash

# https://www.hackerrank.com/challenges/bash-tutorials---getting-started-with-conditionals/problem
read arg
#if [ $arg == 'Y' ] || [ $arg == 'y' ]
if [[ $arg == 'Y' || $arg == 'y' ]]
then
    echo "YES"
else
    echo "NO"
fi