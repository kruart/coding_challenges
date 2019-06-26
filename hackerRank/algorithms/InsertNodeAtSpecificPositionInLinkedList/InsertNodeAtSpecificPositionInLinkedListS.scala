package algorithms.InsertNodeAtSpecificPositionInLinkedList

// https://www.hackerrank.com/challenges/insert-a-node-at-a-specific-position-in-a-linked-list/problem
object InsertNodeAtSpecificPositionInLinkedListS extends App{
  class SinglyLinkedListNode(var data: Int, var next: SinglyLinkedListNode = null) {}

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

  def insertNodeAtPosition(ll: SinglyLinkedListNode, data: Int, position: Int): SinglyLinkedListNode = {
    var node: SinglyLinkedListNode = ll
    (0 to position).foreach { i =>
      if (i == position - 1) {
        val temp: SinglyLinkedListNode = node.next
        node.next = new SinglyLinkedListNode(data, temp)
        return ll
      }
      node = node.next
    }
    ll
  }

  val stdin = scala.io.StdIn
  val ll = new SinglyLinkedList()
  val n = stdin.readLine.trim.toInt

  for (_ <- 0 until n) {
    val item = stdin.readLine.trim.toInt
    ll.insertNode(item)
  }

  val data = stdin.readLine.trim.toInt
  val position = stdin.readLine.trim.toInt

  val ll1 = insertNodeAtPosition(ll.head, data, position)
  printSinglyLinkedList(ll1, " ")
}
