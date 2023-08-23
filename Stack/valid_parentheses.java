import java.util.*;
class valid_paranthesis {
    public static void main(String args[]) {
        Solution ay = new Solution();
        System.out.println(ay.inValid("({})"));
    }
}

class Solution {
    public boolean inValid(String s) {
        Stack <Character> stack = new Stack<Character>();
        char []S= s.toCharArray();
        for(int i=0;i<s.length()-1;i++) {
            if(S[i] =='(' || S[i]=='{' || S[i]=='[')
            stack.push(S[i]);
            else if(stack.isEmpty())
                    return false;
            else if(S[i]==')' && stack.peek()=='(')
                stack.pop();
            else if(S[i]=='}' && stack.peek()=='{')
                stack.pop();
            else if(S[i]==']' && stack.peek()=='[')
                stack.pop();

            else 
                return false;

        }

        if(stack.isEmpty())
            return true;
        else
            return false;
    }
}