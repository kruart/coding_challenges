#!/usr/bin/env bash
# read a list of countries into an array and then display the entire array, with a space between each of the countries' names.
# https://www.hackerrank.com/challenges/bash-tutorials-read-in-an-array/problem

#while read country; do
#    arr+=(${country})
#done

arr=($(cat))
echo ${arr[@]}