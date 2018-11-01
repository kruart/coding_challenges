from collections import OrderedDict

# https://www.hackerrank.com/challenges/py-collections-ordereddict/problem
if __name__ == '__main__':
    d = OrderedDict()

    for i in range(int(input())):
        item, _, price = input().rpartition(" ")
        d[item] = d.get(item, 0) + int(price)
    [print(k, v) for k, v in d.items()]
