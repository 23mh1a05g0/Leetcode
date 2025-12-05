class Solution {
    public int countPartitions(int[] nums) {
        if(nums ==null || nums.length <2) return 0;
       int total_sum = 0;
       int left_sum = 0;
       int right_sum = 0;
       int ans = 0;
       for(int v : nums){
         total_sum = total_sum + v;
       }
       for(int j=0;j<nums.length-1;j++){
          left_sum = left_sum + nums[j];
          right_sum = total_sum - left_sum;
          int diff = Math.abs(left_sum - right_sum);
          if(diff % 2 == 0){
            ans++;
          }
       }
       return ans;
    }
}