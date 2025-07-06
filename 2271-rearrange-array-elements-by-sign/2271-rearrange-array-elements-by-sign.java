class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        for(int num : nums){
            if(num >= 0){
                pos.add(num);
            }
            else{
                 neg.add(num);
            }
        }
       int P=0,N=0,i=0;
       int[] arr = new int[nums.length];
        while(P < pos.size() && N < neg.size()){
            arr[i++] = pos.get(P++);
            arr[i++] = neg.get(N++);
        }
        return arr;
    }
}