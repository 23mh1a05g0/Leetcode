class Solution {
    public boolean isThree(int n) {
        int count = 0;
        // for(int i=1;i<=n;i++){
        //     if(n % i == 0){
        //         count++;
        //     }
        // }
        // if(count == 3){
        //     return true;
        // }else{
        //     return false;
        // }

        for(int i = 2;i<= (int)Math.sqrt(n);i++){
            while(n % i == 0){
                count++;
                n = n / i;
            }
        }
        return count == 2 && n == 1;
    }
}