class Solution {
  public void nextPermutation(int[] nums) {
    for (int i = nums.length - 2; i >= 0; i--) {
      if (nums[i] < nums[i + 1]) {
        int j = nums.length - 1;
        for (; j > i; j--) {
          if (nums[j] > nums[i]) {
            break;
          }
        }
        swap(nums, i, j);
        reverseSwap(nums, i + 1, nums.length - 1);
        return;
      }
    }
    reverseSwap(nums, 0, nums.length - 1);
  }

  private void reverseSwap(int[] nums, int start, int end) {
    while (start < end) {
      swap(nums, start++, end--);
    }
  }

  private void swap(int[] nums, int i, int j) {
    int tmp = nums[i];
    nums[i] = nums[j];
    nums[j] = tmp;
  }
}
