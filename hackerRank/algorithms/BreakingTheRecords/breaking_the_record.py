def breaking_records(scores):
    max_score = scores[0]
    min_score = scores[0]
    count_max_scores = 0
    count_min_scores = 0

    for i in range(1, len(scores)):
        if scores[i] > max_score:
            max_score = scores[i]
            count_max_scores = count_max_scores + 1
        elif scores[i] < min_score:
            min_score = scores[i]
            count_min_scores = count_min_scores + 1
    return [count_max_scores, count_min_scores]


print(breaking_records([10, 5, 20, 20, 4, 5, 2, 25, 1]))        # 2 4
print(breaking_records([3, 4, 21, 36, 10, 28, 35, 5, 24, 42]))  # 4 0
print(breaking_records([12, 24, 10, 24]))   # 1 1
