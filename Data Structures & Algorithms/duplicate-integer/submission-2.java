class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet dup = new HashSet<>();
        for (int num : nums)
        {
            if (dup.contains(num))
            {
                return true;
            }
            dup.add(num);
        }
        return false;
    }
}