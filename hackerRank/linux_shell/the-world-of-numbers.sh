#!/usr/bin/env bash
# Given two integers, X and Y, find their sum, difference, product, and quotient.
# https://www.hackerrank.com/challenges/bash-tutorials---the-world-of-numbers/problem
read x
read y
expr ${x} + ${y}
expr ${x} - ${y}
expr ${x} \* ${y}
expr ${x} / ${y}

#echo $((x + y))
#echo $((x - y))
#echo $((x * y))
#echo $((x / y))