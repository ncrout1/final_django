class Solution:

  def numberOfInversions(self, nums: list[int]) -> int:

    def merge_sort(arr, temp_arr, left, right):
      inv_count = 0
      if left < right:
        mid = (left + right) // 2

        inv_count += merge_sort(arr, temp_arr, left, mid)
        inv_count += merge_sort(arr, temp_arr, mid + 1, right)

        inv_count += merge(arr, temp_arr, left, mid, right)
      return inv_count

    def merge(arr, temp_arr, left, mid, right):
      i = left  # Starting index for left subarray
      j = mid + 1  # Starting index for right subarray
      k = left  # Starting index to be sorted
      inv_count = 0

      while i <= mid and j <= right:
        if arr[i] <= arr[j]:
          temp_arr[k] = arr[i]
          i += 1
        else:
          # There is an inversion. All elements remaining in the left
          # subarray (from i to mid) are greater than arr[j].
          temp_arr[k] = arr[j]
          inv_count += mid - i + 1
          j += 1
        k += 1

      # Copy the remaining elements of left subarray, if any
      while i <= mid:
        temp_arr[k] = arr[i]
        i += 1
        k += 1

      # Copy the remaining elements of right subarray, if any
      while j <= right:
        temp_arr[k] = arr[j]
        j += 1
        k += 1

      # Copy the sorted subarray into the original array
      for k in range(left, right + 1):
        arr[k] = temp_arr[k]

      return inv_count

    temp_arr = [0] * len(nums)
    return merge_sort(nums, temp_arr, 0, len(nums) - 1)