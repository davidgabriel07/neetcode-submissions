class Solution {
    public static int appendCharacters(String s, String t) {
        int iterator;
        int prstChars = 0;
        for (iterator = 0; iterator < s.length() && prstChars < t.length(); iterator++)
        {
            if (s.charAt(iterator) == t.charAt(prstChars))
            {
                prstChars++;
            }
        }
        return t.length() - prstChars;
    }
}