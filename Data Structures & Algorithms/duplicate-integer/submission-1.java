class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int number : nums)
        {
            set.add(number);
        }
        return nums.length != set.size();
    }
}