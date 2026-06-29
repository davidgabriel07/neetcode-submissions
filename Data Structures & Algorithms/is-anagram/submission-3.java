class Solution {
    public boolean isAnagram(String s, String t) {
        Hashtable<String, Integer> hashTable = new Hashtable<String, Integer>(26);
        int length = s.length();
        int iterator = 0;
        int size = 0;
        for (iterator = 0; iterator < length; iterator++)
        {
            if (hashTable.containsKey(String.valueOf(s.charAt(iterator))))
            {
                size = (int) hashTable.get(String.valueOf(s.charAt(iterator)));
                hashTable.put(String.valueOf(s.charAt(iterator)), size + 1);
            }
            else
            {
                hashTable.put(String.valueOf(s.charAt(iterator)), 1);
            }
        }
        length = t.length();
        for (iterator = 0; iterator < length; iterator++)
        {
            if (hashTable.containsKey(String.valueOf(t.charAt(iterator))))
            {
                size = (int) hashTable.get(String.valueOf(t.charAt(iterator)));
                hashTable.put(String.valueOf(t.charAt(iterator)), size - 1);
            }
            else
            {
                return false;
            }
        }
        for (Map.Entry<String, Integer> e : hashTable.entrySet())
        {
            if (e.getValue() != 0)
            {
                return false;
            }
        }
        return true;
    }
}
