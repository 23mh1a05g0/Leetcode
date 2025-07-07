class Solution {
    public int[] rearrangeArray(int[] nums) {
    //     List<Integer> pos = new ArrayList<>();
    //     List<Integer> neg = new ArrayList<>();
    //     for(int num : nums){
    //         if(num >= 0){
    //             pos.add(num);
    //         }
    //         else{
    //              neg.add(num);
    //         }
    //     }
    //    int P=0,N=0,i=0;
    //    int[] arr = new int[nums.length];
    //     while(P < pos.size() && N < neg.size()){
    //         arr[i++] = pos.get(P++);
    //         arr[i++] = neg.get(N++);
    //     }
    //     return arr;
    
    int n = nums.length;
    int[] arr = new int[n];
    int pos = 0 , neg = 1;
    for(int i=0;i<n;i++){
        if(nums[i]>=0){
            arr[pos] = nums[i];
            pos = pos + 2;
        }
        else{
            arr[neg] = nums[i];
            neg = neg + 2;
        }
    }
    return arr;
    }
}