from queue import Queue

# https://www.hackerrank.com/challenges/tree-level-order-traversal/problem
class Node:
    def __init__(self, info):
        self.info = info
        self.left = None
        self.right = None
        self.level = None

    def __str__(self):
        return str(self.info)


class BinarySearchTree:
    def __init__(self):
        self.root = None

    def create(self, val):
        if self.root is None:
            self.root = Node(val)
        else:
            current = self.root

            while True:
                if val < current.info:
                    if current.left:
                        current = current.left
                    else:
                        current.left = Node(val)
                        break
                elif val > current.info:
                    if current.right:
                        current = current.right
                    else:
                        current.right = Node(val)
                        break
                else:
                    break


def levelOrder(root):
    # Write your code here
    q = Queue()
    q.put(root)

    while not q.empty():
        node = q.get()
        print(node, end=" ")

        if node.left is not None:
            q.put(node.left)
        if node.right is not None:
            q.put(node.right)


tree = BinarySearchTree()
t = int(input())

arr = list(map(int, input().split()))

for i in range(t):
    tree.create(arr[i])

levelOrder(tree.root)