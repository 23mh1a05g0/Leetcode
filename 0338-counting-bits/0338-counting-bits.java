class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n+1];
        int count = 0;
        for(int i=1;i<=n;i++){
           arr[i] = count(i);
        }
        return arr;
    }
    private int count(int n){
        int cnt = 0;
        while(n > 0){
           n = (n & (n-1));
           cnt++;
        }
        return cnt;
    }

}