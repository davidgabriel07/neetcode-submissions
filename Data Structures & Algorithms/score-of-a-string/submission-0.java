class Solution {
    public int scoreOfString(String s) {
        int slow = 0, fast = 1;
        int length = s.length();
        int sum = 0;
        while (fast < length)
        {
            sum += Math.abs((int)s.charAt(slow) - (int)s.charAt(fast));
            fast += 1;
            slow += 1;
        }
        return sum;
    }
}