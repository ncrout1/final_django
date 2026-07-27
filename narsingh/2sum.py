class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        newArray=[(idx,num) for idx,num in enumerate(nums)]
        print(newArray)
        newArray.sort(key=lambda x:x[1])

        arrayIndice=[]
        start=0
        last =len(newArray)-1
        while(start<last):
            if(newArray[start][1]+newArray[last][1]<target):
                start+=1
            elif(newArray[start][1]+newArray[last][1]>target):
                last-=1
            else:
                arrayIndice.append(newArray[start][0])
                arrayIndice.append(newArray[last][0])
                return arrayIndice

        return arrayIndice
        
        