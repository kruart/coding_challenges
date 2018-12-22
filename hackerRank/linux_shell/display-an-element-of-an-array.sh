#!/usr/bin/env bash
# read a list of countries into an array and then display the element indexed at 3.
# https://www.hackerrank.com/challenges/bash-tutorials-display-the-third-element-of-an-array/problem
arr=($(cat))
echo ${arr[3]}