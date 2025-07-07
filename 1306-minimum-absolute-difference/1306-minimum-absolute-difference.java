class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        List<List<Integer>>  result = new ArrayList<>();
        for(int i=0;i<n-1;i++){
            int diff = arr[i+1]-arr[i];
            min= Math.min(min,diff);
        }
        for(int i=0;i<n-1;i++){
            int diff = arr[i+1]-arr[i];
            if(diff==min){
                result.add(Arrays.asList(arr[i],arr[i+1]));
            }
        }
        return result;

        
    }
}