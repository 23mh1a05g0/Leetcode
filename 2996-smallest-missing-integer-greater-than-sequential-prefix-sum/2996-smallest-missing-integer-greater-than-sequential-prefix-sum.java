class Solution {
    public int missingInteger(int[] nums) {
        if(nums.length == 1) return nums[0] + 1;
        int currsum = nums[0];
        int i = 1;
        while(i < nums.length){
            if(nums[i] == nums[i-1]+1){
                currsum += nums[i];
            }else{
                break;
            }
            i++;
        } 
        Arrays.sort(nums);
        for(int j = 0;j<nums.length;j++){
            if(nums[j] == currsum){
                currsum++;
            }
        }
        
        return currsum;
    }
}