class Solution {
    public boolean checkDivisibility(int n) {
        int org = n;
        int sum = 0;
        int pro = 1;
        while(n != 0){
            int r = n % 10;
            sum = sum + r;
            pro = pro * r;
            n = n/10;
        }
        int res = sum + pro;
        return org % res == 0;
    }
}