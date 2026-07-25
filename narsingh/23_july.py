class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        count=0
        current_val=0
        for i in range(len(nums)):
            if nums[i]==1:
              count+=1
            else:
              
              count=0
            current_val=max(count,current_val)
        return current_val
                