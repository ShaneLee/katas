func twoSum(nums []int, target int) []int {
  res := []int{0,0};
  
  m := map[int]int{};
  
  for i := 0; i< len(nums); i++ {
    r := target - nums[i];
    if r, ok := m[r]; ok {
      res[0] = i;
      res[1] = r;
      return res;
    }
    m[nums[i]] = i;

  }
  return res;
   
}
