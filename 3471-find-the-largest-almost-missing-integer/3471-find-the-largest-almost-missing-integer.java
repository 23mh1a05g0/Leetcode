class Solution {
    public int largestInteger(int[] nums, int k) {
        int[] freq = new int[51];
        for(int i=0;i<=nums.length-k;i++){
            boolean seen[] = new boolean[51];
            for(int j = i; j<i+k;j++){
                int num = nums[j];
                if(!seen[num]){
                    freq[num]++;
                    seen[num] = true;
                }
            } 
        }
        int ans = -1;
            for(int num = 0;num<=50;num++){
                if(freq[num] == 1){
                    ans = num;
                }
            }  
        return ans;
    }
}