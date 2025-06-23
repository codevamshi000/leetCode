class Solution {
    public String simplifyPath(String path) {
       Stack<String> stack = new Stack <> ();
          String [] direction = path.split("/");
          for(String str : direction){
            if(str.equals(".")|| str.isEmpty()){
                continue;
            }else if(str.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }else{
                stack.push(str);
            }
          }
          return "/"+String.join("/",stack);
    }
}