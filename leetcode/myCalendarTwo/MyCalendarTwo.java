package myCalendarTwo;


import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/my-calendar-ii/
class MyCalendarTwo {
    private List<Event> events = new ArrayList<>();
    private List<Event> intervals = new ArrayList<>();

    public boolean book(int start, int end) {
        for (Event e : intervals) {
            if (start < e.end && end > e.start) return false;
        }

        for (Event e : events) {
            // if event inside another event interval then the interval is already double-booked
            if (start < e.end && end > e.start) {
                intervals.add(new Event(Math.max(start, e.start), Math.min(end, e.end)));
            }
        }
        events.add(new Event(start, end));
        return true;
    }

    class Event {
        int start;
        int end;
        Event(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
}
