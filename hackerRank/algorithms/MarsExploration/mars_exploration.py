# https://www.hackerrank.com/challenges/mars-exploration/problem
def mars_exploration(s: str):
    pattern = 'SOS'
    return len([el for i, el in enumerate(s) if el != pattern[i % 3]])


if __name__ == '__main__':
    print(mars_exploration("SOSSPSSQSSOR"))  # 3
    print(mars_exploration("SOSSOT"))        # 1
    print(mars_exploration("SOSSOSSOS"))     # 0