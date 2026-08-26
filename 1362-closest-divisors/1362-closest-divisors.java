class Solution {
    public int[] closestDivisors(int num) {
        int[] ans = new int[2];
        int minDiff = Integer.MAX_VALUE;
        for(int n = num+1;n<=num+2;n++){
            for(int i=1;i*i<=n;i++){
                 if(n % i == 0){
                    int a = i;
                    int b = n / i;

                    if(b-a < minDiff){
                        minDiff = b-a;
                        ans[0] = a;
                        ans[1] = b;
                    }
                 }
            }
        }
        return ans;
    }
}