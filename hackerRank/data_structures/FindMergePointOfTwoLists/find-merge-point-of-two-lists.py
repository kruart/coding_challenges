#!/bin/python3


class SinglyLinkedListNode:
    def __init__(self, node_data):
        self.data = node_data
        self.next = None


class SinglyLinkedList:
    def __init__(self):
        self.head = None
        self.tail = None

    def insert_node(self, node_data):
        node = SinglyLinkedListNode(node_data)

        if not self.head:
            self.head = node
        else:
            self.tail.next = node

        self.tail = node


def print_singly_linked_list(node, sep, fptr):
    while node:
        fptr.write(str(node.data))

        node = node.next

        if node:
            fptr.write(sep)


# Complete the findMergeNode function below.
def findMergeNode(head1, head2):
    nums = set()

    while head1 is not None:
        nums.add(head1)
        head1 = head1.next

    while head2 is not None:
        if head2 in nums:
            return head2.data
        head2 = head2.next

    return 0


if __name__ == '__main__':
    tests = int(input())

    for t in range(tests):
        index = int(input())
        n1 = int(input())
        ll1 = SinglyLinkedList()

        for _ in range(n1):
            item = int(input())
            ll1.insert_node(item)

        n2 = int(input())
        ll2 = SinglyLinkedList()

        for _ in range(n2):
            item = int(input())
            ll2.insert_node(item)

        ptr1 = ll1.head
        ptr2 = ll2.head

        for i in range(n1):
            if i < index:
                ptr1 = ptr1.next

        for i in range(n2):
            if i != n2-1:
                ptr2 = ptr2.next

        ptr2.next = ptr1

        result = findMergeNode(ll1.head, ll2.head)
        print(result)
