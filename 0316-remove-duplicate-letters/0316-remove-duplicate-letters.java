class Solution {
    public String removeDuplicateLetters(String s) {
       HashMap<Character,Integer> map = new HashMap<>();
       StringBuilder output = new StringBuilder();
       for(int i=0;i<s.length();i++){
        char ch = s.charAt(i);
        map.put(ch,i);
       }
        Deque<Character> stack = new ArrayDeque<>();
        HashSet<Character> inStack = new HashSet<>();
       for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (inStack.contains(ch)) continue;

            while (!stack.isEmpty() && stack.peekLast() > ch && map.get(stack.peekLast()) > i) {
                char removed = stack.removeLast();
                inStack.remove(removed);
            }
            stack.addLast(ch);
            inStack.add(ch);
        }

       for(char ch : stack){
        output.append(ch);
       }
       
        return output.toString();
    }
}