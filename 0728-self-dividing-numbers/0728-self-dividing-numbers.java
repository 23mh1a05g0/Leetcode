class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = left; i<= right; i++){
            int n = i;
            boolean valid = true;
            while(n != 0){
                int digit = n % 10;
                if(digit == 0 || i % digit != 0){
                    valid = false;
                    break;
                }
                n = n / 10;
            }
            if(valid){
                res.add(i);
            }
        }
        return res;
    }
}