class Solution {
    public int minimumPushes(String word) {
        int[] freq = new int[26];
        for(char ch : word.toCharArray()){
            freq[ch - 'a']++;
        }

        Arrays.sort(freq);

        int push = 0;
        int position  = 1;
        int count = 0;
        for(int i=25;i>=0;i--){
            if(freq[i] == 0){
                continue;
            }

            push += freq[i] * position;
            count++;
            if(count == 8){
                position++;
                count = 0;
            }
        }
        return push;
    }
}