import calendar

# https://www.hackerrank.com/challenges/calendar-module/problem
if __name__ == '__main__':
    date = list(map(int, input().split()))
    day = calendar.weekday(date[2], date[0], date[1])
    print(calendar.day_name[day].upper())
