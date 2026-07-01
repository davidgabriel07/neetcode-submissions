class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        String[] words = s.split(" ");
        int size = words.length;
        return words[size - 1].length();
    }
}