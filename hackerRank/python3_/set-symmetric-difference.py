# https://www.hackerrank.com/challenges/py-set-symmetric-difference-operation/problem
_, eng, _, fre = input(), set(input().split()), input(), input().split()
print(len(eng.symmetric_difference(fre)))