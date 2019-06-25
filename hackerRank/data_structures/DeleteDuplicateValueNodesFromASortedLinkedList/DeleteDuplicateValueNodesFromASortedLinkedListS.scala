package data_structures.DeleteDuplicateValueNodesFromASortedLinkedList

// https://www.hackerrank.com/challenges/delete-duplicate-value-nodes-from-a-sorted-linked-list/problem
object DeleteDuplicateValueNodesFromASortedLinkedListS {
  class SinglyLinkedListNode(var data: Int, var next: SinglyLinkedListNode = null) { }

  class SinglyLinkedList(var head: SinglyLinkedListNode = null, var tail: SinglyLinkedListNode = null) {
    def insertNode(nodeData: Int) = {
      val node = new SinglyLinkedListNode(nodeData)

      if (this.head == null) {
        this.head = node
      } else {
        this.tail.next = node
      }

      this.tail = node
    }
  }

  def printSinglyLinkedList(head: SinglyLinkedListNode, sep: String) = {
    var node = head

    while (node != null) {
      print(node.data)
      node = node.next

      if (node != null) {
        print(sep)
      }
    }
  }

  def removeDuplicates(head: SinglyLinkedListNode): SinglyLinkedListNode = {
    def addItemsWithoutDuplicates(ll: SinglyLinkedList, curr: SinglyLinkedListNode): SinglyLinkedList = curr match {
      case null => ll
      case node =>
        if (node.data != ll.tail.data) ll.insertNode(node.data)
        addItemsWithoutDuplicates(ll, curr.next)
    }

    val ll = new SinglyLinkedList()
    ll.insertNode(head.data)
    addItemsWithoutDuplicates(ll, head.next).head
  }

  def main(args: Array[String]) {
    val readInt = () => scala.io.StdIn.readInt()
    val tests = readInt()

    for (_ <- 1 to tests) {
      val ll = new SinglyLinkedList()
      val n = readInt()

      (0 until n).foreach { _ => ll.insertNode(readInt()) }
      val ll1 = removeDuplicates(ll.head)
      printSinglyLinkedList(ll1, " ")
    }
  }
}
