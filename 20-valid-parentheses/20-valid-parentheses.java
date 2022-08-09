class Solution {
    public boolean isValid(String s) {
        char[] char_arr = s.toCharArray();
        Stack<Character> q = new Stack<>();
        for(char a : char_arr){
            if(a == '(' || a == '{' || a == '['){
                q.push(a);
            }
            else if(!q.isEmpty()){
            if(a == ')'){
                if(q.pop() != '(') return false;
            }
            else if(a == '}'){
                if(q.pop() != '{') return false;
            }
            else if(a == ']'){
                if(q.pop() != '[') return false;
            }
            }
            else return false;
        }
        if(q.isEmpty()) return true;
        return false;
    }
}