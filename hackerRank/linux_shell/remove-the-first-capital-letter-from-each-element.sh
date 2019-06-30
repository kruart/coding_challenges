#!/usr/bin/env bash

# way 1
paste -s -d " " <<< `sed 's/././'`
#paste -s -d " " <<< `sed 's/././' ./test.txt`

# way 2
sed 's/././' | paste -s -d " "
#sed 's/././' ./test.txt | paste -s -d " "