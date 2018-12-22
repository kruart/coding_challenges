#!/usr/bin/env bash
# Given three integers (X, Y, and Z) representing the three sides of a triangle, identify whether the triangle is Scalene, Isosceles, or Equilateral.
# https://www.hackerrank.com/challenges/bash-tutorials---more-on-conditionals/problem
read x
read y
read z

if [[ $x == $y  && $x == $z ]]; then
    echo "EQUILATERAL"
elif [[ $x != $y  && $x != $z && $y != $z ]]; then
    echo "SCALENE"
else
    echo "ISOSCELES"
fi

