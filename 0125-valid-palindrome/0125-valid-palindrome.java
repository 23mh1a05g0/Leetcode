class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()==0) return true;
        s = s.toLowerCase();
        StringBuilder sd = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                sd.append(ch);
            }
        }
        int left = 0;
        int right = sd.length()-1;
        while(left<right){
            if(sd.charAt(left)!=sd.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}