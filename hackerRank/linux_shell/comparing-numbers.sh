#!/usr/bin/env bash
# Given two integers, X and Y, identify whether X < Y or X > Y or X = Y.
# https://www.hackerrank.com/challenges/bash-tutorials---comparing-numbers/problem
read x
read y

if (( $x > $y )); then
    echo "X is greater than Y"
elif (( $x == $y)); then
    echo "X is equal to Y"
else
    echo "X is less than Y"
fi


# second way
#[[ $x -gt $y ]] && echo 'X is greater than Y'
#[[ $x -eq $y ]] && echo 'X is equal to Y'
#[[ $x -lt $y ]] && echo 'X is less than Y'
