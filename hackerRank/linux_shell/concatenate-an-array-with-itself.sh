#!/usr/bin/env bash
# read a list of countries into an array, and concatenate the array with itself (twice)
# https://www.hackerrank.com/challenges/bash-tutorials-concatenate-an-array-with-itself/problem
arr=($(cat))
arr+=( ${arr[@]} ${arr[@]} )
echo ${arr[@]}