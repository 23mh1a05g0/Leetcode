class Solution {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        String[] words = s.trim().split(" ");
        for(int i=words.length-1;i>=0;i--){
            if(words[i] != "")
               result.append(" ").append(words[i]);
            }

        return result.toString().trim();
    }
    
}