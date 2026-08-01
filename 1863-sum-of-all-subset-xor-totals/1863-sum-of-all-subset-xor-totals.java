class Solution {
    public int subsetXORSum(int[] nums) {
        return solve(nums,0,0);
    }

    private int solve(int[] nums, int index, int xor){
        if(index == nums.length) return xor;

        int without = solve(nums,index+1,xor);
        int with = solve(nums,index+1,xor ^ nums[index]);
        return without + with;
    }
}