# https://leetcode.com/problems/relative-sort-array/
class RelativeSortArray:
    def relativeSortArray(self, arr1, arr2):
        m = {}

        for elem in arr2:
            m[elem] = 0

        for elem in arr1:
            if elem in m:
                m[elem] = m[elem] + 1

        rest = sorted([elem for elem in arr1 if elem not in m])
        result = []

        for elem in arr2:
            for _ in range(m[elem]):
                result.append(elem)

        return result + rest

