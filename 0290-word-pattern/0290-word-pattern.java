class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map_1 = new HashMap<>();
        HashMap<String,Character> map_2 = new HashMap<>();

        String[] vali = s.trim().split(" ");
        if(pattern.length() != vali.length) return false;
        for(int i=0;i<pattern.length();i++){
            char c1 = pattern.charAt(i);
            String c2 = vali[i];
            if(map_1.containsKey(c1)){
                if(!map_1.get(c1).equals(c2)) return false;
            }
            else{
                map_1.put(c1,c2);
            }
            if(map_2.containsKey(c2)){
                if(!map_2.get(c2).equals(c1)) return false;
            }
            else{
                map_2.put(c2,c1);
            }
        }
        return true;
    }
}