class Solution {
    public int minimumFlips(int n) {
        String binary = Integer.toBinaryString(n);
        int left = 0;
        int right = binary.length()-1;
        int flip = 0;
        while(left < right){
            if(binary.charAt(left) != binary.charAt(right)){
                flip += 2;
            }
            left++;
            right--;
        }
        return flip;
    }
}