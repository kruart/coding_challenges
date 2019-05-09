package HanoiTower

object HanoiTowerS extends App {
  def hanoi(height: Int, from: String = "left", to: String = "right", through: String = "middle"): Unit = {
    if (height > 0) {
      hanoi(height - 1, from, through, to)
      println(s"$from => $to")
      hanoi(height - 1, through, to, from)
    }
  }

  hanoi(4)
}
