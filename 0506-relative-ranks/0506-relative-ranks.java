class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] result = new String[n];
        int[] sorted = score.clone();
        Arrays.sort(sorted);
        for(int i=0;i<n/2;i++){
            int temp = sorted[i];
            sorted[i] = sorted[n-1-i];
            sorted[n-1-i] = temp;
        }

        Map<Integer,String> rank = new HashMap<>();
        for(int i=0;i<n;i++){
            if(i==0){
                rank.put(sorted[i],"Gold Medal");
            }
            else if(i==1){
                rank.put(sorted[i],"Silver Medal");
            }
            else if(i==2){
                rank.put(sorted[i],"Bronze Medal");
            }
            else{
                rank.put(sorted[i],String.valueOf(i+1));
            }

        }
        for(int i=0;i<n;i++){
            result[i] = rank.get(score[i]);
        }
        return result;

    }
}