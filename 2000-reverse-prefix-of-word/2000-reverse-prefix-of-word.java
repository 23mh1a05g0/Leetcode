class Solution {
    public String reversePrefix(String word, char ch) {
        char[] arr = word.toCharArray();
        int left = 0;
        int right = -1;
        for(int i=0;i<word.length();i++){
              if(word.charAt(i) == ch){
                right = i;
                break;
              }
        }
        //right = Math.min(right,arr.length-1);
        while(left < right){
            char temp= arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        return new String(arr);
    }
}