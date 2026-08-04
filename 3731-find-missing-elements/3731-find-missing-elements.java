class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int max = nums[nums.length-1];
        int min = nums[0];
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = min ;i<=max;i++){
            if(!set.contains(i)){
                ans.add(i);
            }
        }
        return ans;

        
    }
}