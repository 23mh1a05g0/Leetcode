class Solution {
    public int mostFrequentEven(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int num : nums){
            if(num%2==0){
                freq.put(num,freq.getOrDefault(num,0)+1);
            }
        }
        int max = 0;
        int result = -1;
        for(Map.Entry<Integer,Integer> i : freq.entrySet()){
            int ele = i.getKey();
            int cnt = i.getValue();
            if(cnt>max || (max==cnt && ele < result)){
                max = cnt;
                result = ele;
            }
        }
        return result;
    }
}