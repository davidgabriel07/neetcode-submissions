class Solution {
    public boolean isSubsequence(String s, String t) {
        int length = s.length();
        int strLength = t.length();
        int iterator = 0;
        int startIndex = 0;
        while (iterator < length)
        {
            char character = s.charAt(iterator);
            startIndex = findCharInString(startIndex, t, strLength, character);
            if (startIndex == -1)
            {
                return false;
            }
            iterator++;
        }
        return true;
        
    }

    public int findCharInString(int index, String t, int strLength, char character)
    {
        int iterator;
        for (iterator = index; iterator < strLength; iterator++)
        {
            if (t.charAt(iterator) == character)
            {
                return iterator + 1;
            }
        }
        return -1;
    }
}