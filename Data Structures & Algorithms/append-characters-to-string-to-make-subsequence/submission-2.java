class Solution {
    public static int appendCharacters(String s, String t) {
        int iterator;
        int prstChars = 0;
        int sizeS = s.length();
        int sizeT = t.length();
        for (iterator = 0; iterator < sizeS && prstChars < sizeT ; iterator++)
        {
            if (s.charAt(iterator) == t.charAt(prstChars))
            {
                prstChars++;
            }
        }
        return sizeT - prstChars;
    }
}