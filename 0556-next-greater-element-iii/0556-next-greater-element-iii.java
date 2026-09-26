class Solution {
    public int nextGreaterElement(int n) {
        char[] digits = String.valueOf(n).toCharArray();
        int i = digits.length - 2;
        while(i >= 0 && digits[i] >= digits[i+1]){
            i--;
        }
        if(i < 0){
            return -1;
        }
        int j = digits.length-1;
        while(digits[j] <= digits[i]){
            j--;
        }

        char temp = digits[i];
        digits[i] = digits[j];
        digits[j] = temp;

        reverse(digits,i+1,digits.length-1);
        long result = Long.parseLong(new String(digits));

        if(result > Integer.MAX_VALUE){
            return -1;
        }
        return (int) result;
    }
    private void reverse(char[] res, int left, int right){
        while(left < right){
            char tem = res[left];
            res[left] = res[right];
            res[right] = tem;
            left++;
            right--;
        }
    }
}