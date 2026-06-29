class Solution {
    public int[] replaceElements(int[] arr) {
        int length = arr.length;
        Stack<Integer> stack = new Stack<Integer>();
        int[] ans = new int[length];

        for (int i = length - 1; i >= 0; i--)
        {
            if (stack.isEmpty())
            {
                ans[i] = -1;
                stack.push(arr[i]);
            }
            else
            {
                int top = stack.peek();
                ans[i] = top;
                if (top < arr[i])
                {
                    stack.push(arr[i]);
                }
            }
        }
        return ans;
    }
}