class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map_1 = new HashMap<>();
        HashMap<Character,Integer> map_2 = new HashMap<>();
        for(char ch : ransomNote.toCharArray()){
            map_1.put(ch,map_1.getOrDefault(ch,0)+1);
        }
        for(char ch : magazine.toCharArray()){
            map_2.put(ch,map_2.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> entry : map_1.entrySet()){
            char key = entry.getKey();
            int value = entry.getValue();
            if(!map_2.containsKey(key) || map_2.get(key) < value){
                return false;
            }
        }
        return true;
      
    }
}