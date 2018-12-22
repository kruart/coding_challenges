#!/usr/bin/env bash
# read a list of countries into an array and slice the array and display only the elements lying between positions 3 and 7, both inclusive. Indexing starts from from 0.
# https://www.hackerrank.com/challenges/bash-tutorials-slice-an-array/problem
while read country; do
    arr+=(${country})
done

echo ${arr[@]:3:5}