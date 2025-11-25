# solution.py
def max_subarray(nums):
    cur = max_so_far = nums[0]
    for x in nums[1:]:
        cur = x if cur < 0 else cur + x
        max_so_far = max(max_so_far, cur)
    return max_so_far


if __name__ == "__main__":
    print(max_subarray([-2, 1, -3, 4, -1, 2, 1, -5, 4]))
