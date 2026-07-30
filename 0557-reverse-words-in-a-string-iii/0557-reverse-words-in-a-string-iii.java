class Solution {
    public String reverseWords(String s) {
        int n = s.length();
        String arr[] = s.split(" ");
        // int left = 0;
        // int right = arr.length-1;
        // while(left < right){
        //     String temp = arr[left];
        //     arr[left] = arr[right];
        //     arr[right] = temp;
        //     left++;
        //     right--;
        // }

        for(int i=0;i<arr.length;i++){
            arr[i] = reverse(arr[i]);
        }
        return String.join(" ",arr);
    }

    public String reverse(String word){
        char[] arr = word.toCharArray();
        int left = 0;
        int right = arr.length-1;
        while(left < right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        return new String(arr);
    }
}