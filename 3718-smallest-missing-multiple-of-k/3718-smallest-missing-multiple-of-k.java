class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        // for(int i = 1;i <=nums.length;i++){
        //     if(!set.contains(k*i)){
        //         return k*i;
        //     }
        // }
        int i = 1;
        while(true){
            if(!set.contains(k*i)){
                return k*i;
            }
            i++;
        }
        //return -1;
    }
}