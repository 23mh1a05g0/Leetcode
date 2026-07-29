class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        for(int i=0;i<s.length();i++){
           int kl = ('z' - s.charAt(i)+1);
           sum += kl * (i+1);
        }
        return sum;
    }
}