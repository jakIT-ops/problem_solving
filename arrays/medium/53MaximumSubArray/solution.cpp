// solution.cpp
#include <bits/stdc++.h>
using namespace std;
int maxSubArray(vector<int> &nums) {
  int cur = nums[0], best = nums[0];
  for (int i = 1; i < nums.size(); ++i) {
    cur = (cur < 0) ? nums[i] : cur + nums[i];
    best = max(best, cur);
  }
  return best;
}
int main() {
  vector<int> v = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
  cout << maxSubArray(v) << "\n";
}
