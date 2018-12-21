#!/usr/bin/env bash
# https://www.hackerrank.com/challenges/bash-tutorials-read-in-an-array/problem

#while read country; do
#    arr+=(${country})
#done

arr=($(cat))
echo ${arr[@]}