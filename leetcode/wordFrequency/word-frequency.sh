#!/usr/bin/env bash
# https://leetcode.com/problems/word-frequency/submissions/
grep -oE '[a-z]+' words.txt | sort | uniq -c | sort -nr | awk '{print $2, $1}'