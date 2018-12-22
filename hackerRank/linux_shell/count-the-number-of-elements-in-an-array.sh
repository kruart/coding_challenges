#!/usr/bin/env bash
# read a list of countries into an array and then display the count of elements in that array
# https://www.hackerrank.com/challenges/bash-tutorials-count-the-number-of-elements-in-an-array/problem
arr=($(cat))
echo ${#arr[@]}