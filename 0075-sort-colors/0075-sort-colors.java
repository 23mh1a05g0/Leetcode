class Solution {
    public void sortColors(int[] nums) {
        // int zero = 0, ones = 0, twos = 0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i] == 0) zero++;
        //     else if(nums[i] == 1) ones++;
        //     else if(nums[i] ==2) twos++;
        // }
        // int index = 0;
        // while(zero-- > 0) nums[index++] = 0;
        // while(ones-- > 0) nums[index++] = 1;
        // while(twos-- > 0) nums[index++] = 2;
        Arrays.sort(nums);
    }
}