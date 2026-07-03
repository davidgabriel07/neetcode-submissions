class Solution {
    public List<String> stringMatching(String[] words) {
        int iterator1, iterator2, length = words.length;
        List<String> result = new ArrayList<String>();
        for (iterator1 = 0; iterator1 < length; iterator1++)
        {
            for (iterator2 = 0; iterator2 < length; iterator2++)
            {
                if (iterator1 != iterator2)
                {
                    if (words[iterator2].contains(words[iterator1]))
                    {
                        result.add(words[iterator1]);
                        break;
                    }
                }
            }
        }
        return result;
    }
}