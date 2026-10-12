class Solution {
    public int missingNumber(int[] nums) {
    //     HashMap<Integer,Integer> map = new HashMap<>();
    //     for(int num : nums){
    //         map.put(num,map.getOrDefault(num,0) + 1);
    //     }

    //     for(int i=1;i<=nums.length;i++){
    //         if(!map.containsKey(i)){
    //             return i;
    //         }
    //     }
    //   return 0;

    int n = nums.length;
    int total = n * (n+1) / 2;
    int sum = 0;
    for(int num : nums){
        sum += num;
    }
    return total-sum;
    }
}