package myCalendarTwo

// https://leetcode.com/problems/my-calendar-ii/
object MyCalendarTwoS {
  case class Event(start: Int, end: Int)

  var events = scala.collection.mutable.ArrayBuffer[Event]()
  var intervals = scala.collection.mutable.ArrayBuffer[Event]()

  def book(start: Int, end: Int): Boolean = {
    intervals.foreach {i =>
      if (start < i.end && end > i.start)
        return false
    }

    events.foreach {e =>
      if (start < e.end && end > e.start) {
        val startInterval = Math.max(start, e.start);
        val endInterval = Math.min(end, e.end);
        intervals += Event(startInterval, endInterval)
      }
    }
    events += Event(start, end)
    true
  }
}
