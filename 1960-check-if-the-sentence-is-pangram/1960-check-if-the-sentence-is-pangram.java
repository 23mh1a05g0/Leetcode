class Solution {
    public boolean checkIfPangram(String sentence) {
        sentence = sentence.toLowerCase();
        boolean[] seen = new boolean[26];
        for(int i=0;i<sentence.length();i++){
            char ch = sentence.charAt(i);
            if(Character.isLetter(ch)){
                int index = ch - 'a';
                seen[index] = true;
            }
        }
        for(boolean present : seen){
            if(!present){
                return false;
            }
        }
        return true;
    }
}