# https://www.hackerrank.com/challenges/python-lists/problem
if __name__ == '__main__':
    N = int(input())

    nums = []
    for i in range(N):
        args = input().split(' ')
        action = args[0]

        if action == 'insert':
            nums.insert(int(args[1]), int(args[2]))
        elif action == 'print':
            print(nums)
        elif action == 'remove':
            nums.remove(int(args[1]))
        elif action == 'append':
            nums.append(int(args[1]))
        elif action == 'sort':
            nums.sort()
        elif action == 'pop':
            nums.pop()
        elif action == 'reverse':
            nums.reverse()

