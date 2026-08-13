class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int currDist = 0;
        for(int i=0;i<k;i++){
            currDist += Math.abs(arr[i] - x);
        }

        int bestDist = currDist;
        int bestStart = 0;
        for(int left = 1;left <= arr.length-k;left++){
            currDist -= Math.abs(arr[left-1] - x);
            currDist += Math.abs(arr[left + k - 1] - x);

            if(currDist < bestDist){
                bestDist = currDist;
                bestStart = left;
            }
        }
        List<Integer> res = new ArrayList<>();
        for(int i = bestStart; i < bestStart + k;i++){
            res.add(arr[i]);
        }
        return res;
    }
}