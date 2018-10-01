# https://www.hackerrank.com/challenges/py-if-else/problem
N = int(input())

# way 1
# if N % 2 != 0 or 6 <= N <= 20:
#     print('Weird')
# elif(2 <= N <= 5) or (N > 20):
#     print('Not Weird')

# way 2
if N % 2 != 0 or N in range(6, 21):
    print('Weird')
else:
    print('Not Weird')
