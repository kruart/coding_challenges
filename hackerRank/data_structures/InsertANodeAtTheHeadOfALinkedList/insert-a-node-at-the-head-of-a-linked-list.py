# https://www.hackerrank.com/challenges/insert-a-node-at-the-head-of-a-linked-list/problem
class SinglyLinkedListNode:
    def __init__(self, node_data):
        self.data = node_data
        self.next = None


class SinglyLinkedList:
    def __init__(self):
        self.head = None
        self.tail = None


def print_singly_linked_list(node, sep):
    while node:
        print(node.data, sep=sep)
        node = node.next


def insertNodeAtHead(llist, data):
    new_ll = SinglyLinkedListNode(data)
    new_ll.next = llist
    return new_ll


if __name__ == '__main__':
    n = int(input())

    ll = SinglyLinkedList()

    for _ in range(n):
        item = int(input())
        ll.head = insertNodeAtHead(ll.head, item)

    print_singly_linked_list(ll.head, '\n')