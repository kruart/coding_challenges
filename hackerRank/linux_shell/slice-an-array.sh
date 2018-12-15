#!/usr/bin/env bash
#https://www.hackerrank.com/challenges/bash-tutorials-slice-an-array/problem
while read country; do
    arr+=(${country})
done

echo ${arr[@]:3:5}