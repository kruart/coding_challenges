#!/usr/bin/env bash
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