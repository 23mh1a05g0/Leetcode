class Solution {
    public String makeSmallestPalindrome(String s) {
        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length-1;
        while(left < right){
            if(arr[left] != arr[right] && arr[left] < arr[right]){
                arr[right] = arr[left];
            }
            else if(arr[left] != arr[right] && arr[left] > arr[right]){
                arr[left] = arr[right];
            }
            left++;
            right--;
        }

        return new String(arr);
    }
}