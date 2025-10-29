def find_min_in_rotated_sorted_arr(arr):
    start = 0
    end = len(arr)-1
    while start < end:
        mid = start + (end - start)//2
        if arr[mid] > arr[mid+1]:
           return mid + 1
        elif arr[mid] < arr[mid-1]:
            return mid
        elif arr[start] < arr[mid]:
            start = mid + 1
        else:
            end = mid -1


arr = [4, 5, 6, 7, 1, 2, 3]
nums = [4,5,6,7,10,0,2]
print(find_min_in_rotated_sorted_arr(arr))

"""
https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/
1. Find the Minimum Element in a Rotated Sorted Array
🔹 Problem Statement:
Given a rotated sorted array, find the minimum element in O(log N) time.

🔹 Approach:

Use Binary Search.
The minimum element is the only element whose previous element is greater than it.
If the middle element is greater than the last element, the minimum is in the right half.
Otherwise, it's in the left half.
"""