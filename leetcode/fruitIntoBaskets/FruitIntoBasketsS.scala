package fruitIntoBaskets

// https://leetcode.com/problems/fruit-into-baskets/
object FruitIntoBasketsS {
  def totalFruit(tree: Array[Int]): Int = {
    val m = scala.collection.mutable.Map[Int, Int]()
    var max = 0
    var lastIdx = 0

    tree.indices.foreach { i =>
      m(tree(i)) = i

      if (m.size > 2) {
        val min = m.values.min
        m.remove(tree(min))
        lastIdx = min+1
      }
      max = Math.max(max, i - lastIdx + 1)
    }
    max
  }

  // Without map. time - O(n), space - O(1)
  def totalFruit2(tree: Array[Int]): Int = {
    var fruits = (-1, -1, -1, -1) //fruit1, fruit1Idx, fruit2, fruit2Idx
    var max = 0
    var startIdx = 0

    tree.indices.foreach { i =>
      i match {
        case _ if fruits._1 == -1 || fruits._1 == tree(i) => fruits = fruits.copy(_1 = tree(i), _2 = i)
        case _ if fruits._3 == -1 || fruits._3 == tree(i) => fruits = fruits.copy(_3 = tree(i), _4 = i)
        case _ =>
          startIdx = Math.min(fruits._2, fruits._4) + 1
          if (fruits._2 > fruits._4) fruits = fruits.copy(_3 = tree(i), _4 = i)
          else fruits = fruits.copy(_1 = tree(i), _2 = i)
      }
      max = Math.max(max, i - startIdx + 1)
    }
    max
  }
}
