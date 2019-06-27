package data_structures.ReverseADoublyLinkedList

// https://www.hackerrank.com/challenges/reverse-a-doubly-linked-list/problem
object ReverseADoublyLinkedListS extends App {
  class DoublyLinkedListNode(var data: Int, var next: DoublyLinkedListNode = null, var prev: DoublyLinkedListNode = null) {}

  class DoublyLinkedList(var head: DoublyLinkedListNode = null, var tail: DoublyLinkedListNode = null) {
    def insertNode(nodeData: Int) = {
      val node = new DoublyLinkedListNode(nodeData)

      if (this.head == null) {
        this.head = node
      } else {
        this.tail.next = node
        node.prev = this.tail
      }

      this.tail = node
    }
  }

  def printDoublyLinkedList(head: DoublyLinkedListNode, sep: String) = {
    var node = head

    while (node != null) {
      print(node.data)
      node = node.next

      if (node != null) {
        print(sep)
      }
    }
  }

  // Complete the reverse function below.
  def reverse(ll: DoublyLinkedListNode): DoublyLinkedListNode = {
    var currNode = ll
    val node = new DoublyLinkedListNode(currNode.data, null, null)
    val reversedList = new DoublyLinkedList(node, node)

    while (currNode.next != null) {
      currNode = currNode.next
      val currHead = reversedList.head
      val node = new DoublyLinkedListNode(currNode.data, currHead, null)
      currHead.prev = node
      reversedList.head = node
    }
    reversedList.head
  }

  val readInt = () => scala.io.StdIn.readInt()
  val tests = readInt()

  for (_ <- 1 to tests) {
    val ll = new DoublyLinkedList()
    val n = readInt()

    for (_ <- 0 until n) {
      val item = readInt()
      ll.insertNode(item)
    }
    printDoublyLinkedList(reverse(ll.head), " ")
  }
}
