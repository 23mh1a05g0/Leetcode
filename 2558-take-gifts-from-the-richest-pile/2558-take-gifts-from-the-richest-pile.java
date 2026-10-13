class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int gift : gifts){
            pq.offer(gift);
        }
        for(int i=0;i<k;i++){
            int maxGift = pq.poll();
            pq.offer((int) Math.sqrt(maxGift));
        }
        long sum = 0;
        while(!pq.isEmpty()){
            sum += pq.poll();
        }
        return sum;
    }
}