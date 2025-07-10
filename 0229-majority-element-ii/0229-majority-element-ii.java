class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> freq = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();
        for(int num : nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> i : freq.entrySet()){
            int ele = i.getKey();
            int cnt = i.getValue();
            if(cnt>n/3){
                result.add(ele);
            }
        }
        if(result.size()==2 && result.get(0)>result.get(1)){
            int temp = result.get(0);
            result.set(0,result.get(1));
            result.set(1,temp);
        }
        return result;
    }
}