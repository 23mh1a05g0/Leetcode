class Solution {
    public int findLucky(int[] arr) {
        int n = arr.length;
        int LuckyInteger = -1;
        // HashMap<Integer,Integer> map = new HashMap<>();
        // for(int num : arr){
        //     map.put(num ,map.getOrDefault(num,0)+1);
        // }
        // for(Map.Entry<Integer, Integer> entry: map.entrySet()){
        //     if(entry.getKey().equals(entry.getValue())){
        //         LuckyInteger = entry.getKey();
        //     }
        // }
        // return LuckyInteger;
        int[] count = new int[501];
        int luckyinteger = -1; 
        for(int num : arr){
            count[num]++;
        }
        for(int i=1;i<=500;i++){
            if(count[i] == i){
                luckyinteger = i;
            }
        }
        return luckyinteger;
        
        
    }
}