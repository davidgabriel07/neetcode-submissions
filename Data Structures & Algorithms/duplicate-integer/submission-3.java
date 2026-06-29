class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet dup = new HashSet<>();
        for (int num : nums)
        {
            dup.add(num);
        }
        return nums.length != dup.size();
    }
}