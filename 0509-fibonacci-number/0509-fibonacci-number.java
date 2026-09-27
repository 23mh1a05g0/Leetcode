class Solution {
    public int fib(int n) {
       if(n <= 1){
        return n;
       }
       int first = 0;
       int sec = 1;
       for(int i = 2; i<= n;i++){
           int curr = first + sec;
           first = sec;
           sec = curr;
       }
       return sec;
    }
}