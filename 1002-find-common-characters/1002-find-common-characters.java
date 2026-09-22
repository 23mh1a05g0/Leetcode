class Solution {
    public List<String> commonChars(String[] words) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : words[0].toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(int i=1;i<words.length;i++){
            HashMap<Character,Integer> current = new HashMap<>();
            for(char ch : words[i].toCharArray()){
                current.put(ch,current.getOrDefault(ch,0) + 1);
            }

            for(char ch : map.keySet()){
                if(current.containsKey(ch)){
                    int min = Math.min(map.get(ch), current.get(ch));
                    map.put(ch,min);
                }else{
                    map.put(ch,0);
                }  
            }
        }

        List<String> result = new ArrayList<>();
        for(char ch : map.keySet()){
             int count = map.get(ch);
             while(count > 0){
                result.add(String.valueOf(ch));
                count--;
             }
        }
        return result;


    }
}