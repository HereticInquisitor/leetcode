import java.util.*;
class valid_paranthesis {
    public static void main(String args[]) {
        Solution ay = new Solution();
        Scanner ar= new Scanner(System.in);
        String str= ar.nextLine();
        System.out.println(ay.inValid(str));
    }
}

class Solution {
    public boolean isValid(String s) {
        Stack <Character> stack = new Stack<Character>();
        char []S= s.toCharArray();
        for(int i=0;i<s.length();i++) {
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
            return stack.isEmpty();
    }
}