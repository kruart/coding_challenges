package data_structures.ReverseALinkedList

// https://www.hackerrank.com/challenges/reverse-a-linked-list/problem
object ReverseALinkedListS {
  class SinglyLinkedListNode(var data: Int, var next: SinglyLinkedListNode = null) {
  }

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

  def reverse(llist: SinglyLinkedListNode): SinglyLinkedListNode = {
    var node = llist
    var reverse: SinglyLinkedListNode = null

    while (node != null) {
      reverse = new SinglyLinkedListNode(node.data, reverse)
      node = node.next
    }
    reverse
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn
    val tests = stdin.readLine.trim.toInt

    (1 to tests).foreach { _ =>
      val ll = new SinglyLinkedList()
      val n = stdin.readLine.trim.toInt

      for (_ <- 0 until n) {
        val item = stdin.readLine.trim.toInt
        ll.insertNode(item)
      }

      val reverseLL = reverse(ll.head)
      printSinglyLinkedList(reverseLL, " ")
    }
  }
}

