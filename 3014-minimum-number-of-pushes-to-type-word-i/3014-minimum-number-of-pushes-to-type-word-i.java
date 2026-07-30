class Solution {
    public int minimumPushes(String word) {
        int size = word.length();
        int cost = 0;
        cost += Math.min(size,8) * 1;
        if(size > 8){
            cost += Math.min(size-8,8) * 2;
        }
        if(size > 16){
            cost += Math.min(size-16, 8) * 3;
        }
        if(size > 24){
            cost += Math.min(size-24,8) * 4;
        }

        return cost;
    }
}