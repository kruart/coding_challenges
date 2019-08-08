class TwoSum:
    def twoSum(self, nums: 'List[int]', target: int) -> 'List[int]':
        d = {}
        for i in range(0, len(nums)):
            diff = target - nums[i]
            if diff in d:
                return [i, d[diff]]
            d[nums[i]] = i
