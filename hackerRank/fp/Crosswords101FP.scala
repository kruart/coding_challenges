package fp

import scala.collection.mutable.ListBuffer
import scala.io.StdIn

// https://www.hackerrank.com/challenges/crosswords-101/problem
object Crosswords101FP extends App {
  sealed trait Direction
  case object Horizontal extends Direction
  case object Vertical   extends Direction
  class Field(var startCoords: (Int, Int), var direction: Direction, var length: Int = 0)

  val crossword = (0 until 10).map(_ => StdIn.readLine().split("")).toArray
  val answers = StdIn.readLine().split(";")
  private val placeholders: ListBuffer[Field] = slots()

  private val array: Array[Array[String]] = fill(placeholders)
  array.foreach(i => println(i.mkString("")))

  def fill(placeholders: ListBuffer[Field]): Array[Array[String]] = {
    def guess(plhs: ListBuffer[Field], cw: Array[Array[String]], words: Array[String]): (Boolean, Array[Array[String]]) = plhs match {
      case l if l.isEmpty => (true, cw)
      case l =>
        words.filter(l.head.length == _.length).foreach { w =>
          val copyCW = crossword
          val res = checkIfNoConflicts(l.head, w, copyCW)
          if (res) {
            val tuple = guess(l.tail, copyCW, words.filterNot(_ == w))
            if (tuple._1) return tuple
          }
        }
        (false, cw)
    }
    guess(placeholders, crossword, answers)._2
  }

  private def checkIfNoConflicts(head: Field, w: String, copyCW: Array[Array[String]]) = {
    w.indices.forall { idx =>
      var cell: String = null
      if (head.direction == Horizontal) {
        cell = copyCW(head.startCoords._1)(head.startCoords._2 + idx)
      } else {
        cell = copyCW(head.startCoords._1 + idx)(head.startCoords._2)
      }
      if (cell == String.valueOf(w(idx)) || cell == "-") {
        if (head.direction == Horizontal) {
          copyCW(head.startCoords._1)(head.startCoords._2 + idx) = String.valueOf(w(idx))
        } else {
          copyCW(head.startCoords._1 + idx)(head.startCoords._2) = String.valueOf(w(idx))
        }
        true
      } else false
    }
  }

  def slots(): ListBuffer[Field] = {
    var fields = ListBuffer[Field]()

    def checkCell(f: Field, direction: Direction, row: Int, col: Int): Field = {
      if (crossword(row)(col) == "-") {
        f match {
          case field if field.startCoords == null => return new Field((row, col), direction, 1)
          case field if field.direction == Horizontal && (col - field.length) == field.startCoords._2 =>
            field.length += 1
            return field
          case field if field.direction == Vertical && (row - field.length) == field.startCoords._1 =>
            field.length += 1
            return field
          case _ =>
            if (f.length > 1) fields += f
            return new Field((row, col), direction, 1)
        }
      }
      f
    }

    for (i <- crossword.indices) {
      var vField = new Field(null, Vertical)
      var hField = new Field(null, Horizontal)
      for (j <- crossword.indices) {
        hField = checkCell(hField, Horizontal, i, j)
        vField = checkCell(vField, Vertical, j, i)
      }
      if (hField.length > 1) fields += hField
      if (vField.length > 1) fields += vField
    }
    fields
  }
}