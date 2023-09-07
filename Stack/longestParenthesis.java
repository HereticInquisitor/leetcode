import java.util.*;
class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> st= new Stack<>();
        // int v=0;
        int c=0;
        st.push(-1);
        if(s.length()==0)
            return 0;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)=='(') {
                st.push(i);

            }
            else {
                st.pop();
                if(st.empty()) {
                    st.push(i);
                }

                else {
                    c=Math.max(c, i-st.peek());
                }
                // v+=2;
                // if(st.empty()) {
                //     v-=2;
                // }
            }
            // return n;
            

        }
        return c;
    }
}



class longestParenthesis {
    public static void main(String args[]) {
        Solution ay =new Solution();

        System.out.println(ay.longestValidParentheses("()())"));
    }
}