class Solution {
    public int countCharacters(String[] words, String chars) {
        HashMap<Character,Integer> ch_map = new HashMap<>();
        for(char ch : chars.toCharArray()){
            ch_map.put(ch, ch_map.getOrDefault(ch, 0) + 1);
        }

        int total = 0;

        for(int i = 0; i < words.length; i++){
            String word = words[i];
            HashMap<Character,Integer> map = new HashMap<>();
            for(char ch : word.toCharArray()){
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }

            boolean canForm = true;
            for(char ch : map.keySet()){
                if (!ch_map.containsKey(ch) || map.get(ch) > ch_map.get(ch)) {
                    canForm = false;
                    break;
                }
            }

            if(canForm){
                total += word.length(); 
            }
        }

        return total;
    }
}
