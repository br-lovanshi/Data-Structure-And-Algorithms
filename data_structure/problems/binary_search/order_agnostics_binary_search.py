def binary_search(nums, target):
    start = 0
    end = len(nums) - 1
    while start <= end:
        mid = start + (end - start) // 2
        if target > nums[mid]:
            start = mid + 1
        elif target < nums[mid]:
            end = mid - 1
        else:
            return mid
    return -1


def order_agnostics_binary_search(nums, target):
    start = 0
    end = len(nums) - 1

    is_asc_sorted = nums[start] <= nums[end]

    if is_asc_sorted:
        while start <= end:
            mid = start + (end - start) // 2
            if target > nums[mid]:
                start = mid + 1
            elif target < nums[mid]:
                end = mid - 1
            else:
                return mid
    else:
        while start <= end:
            mid = start + (end - start) // 2
            if target > nums[mid]:
                end = mid - 1
            elif target < nums[mid]:
                start = mid + 1
            else:
                return mid

    return -1


arr = [1, 2, 3, 4, 5, 6, 7, 8, 9]  # asc order sorted arr
arr_desc = [9, 7, 5, 3, 2, 1]
print(binary_search(arr, 2))
print(order_agnostics_binary_search(arr_desc, 2))
