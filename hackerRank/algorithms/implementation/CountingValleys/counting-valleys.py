def countingValleys(n, s):
    sea_level = 0
    valley_count = 0

    for i in range(n):
        if s[i] == 'U':
            sea_level += 1
            if sea_level == 0:  # if we traversed a valley and step up to sea level
                valley_count += 1
        else:
            sea_level -= 1
    return valley_count


if __name__ == '__main__':
    print(countingValleys(8, "UDDDUDUU"))       # 1
    print(countingValleys(12, "DDUUDDUDUUUD"))  # 2
    print(countingValleys(2, "DD"))             # 0 - because didn't leave a valley
