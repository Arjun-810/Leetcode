class Solution {
    public String simplifyPath(String path) {
        List<String> p = Arrays.asList(path.split("/"));
        Stack<String> stack = new Stack<>();
        for (String s:p){
            if (s.trim().equals("."))
                continue;
            if (s.trim().equals("..")){
                if (!stack.empty())
                    stack.pop();
                continue;
            }
            if (!s.trim().equals("")){
                stack.add("/"+s);
            }
        }
        String res = "";
        for (String a:stack)
            res+=a;
        return res==""?"/":res;
    }
}