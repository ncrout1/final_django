class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        maxprofit=0
        minstockvalue=prices[0]
        for i in range(1,len(prices)):
            minstockvalue=min(minstockvalue,prices[i])
            maxprofit=max(maxprofit, abs(minstockvalue-prices[i]))
        return maxprofit