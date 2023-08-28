class Solution {
    public int strStr(String haystack, String needle) {
        char c[] =haystack.toCharArray();
        char ch[]= needle.toCharArray();
        int j=0;
        int v=0;
        for(int i=0;i<haystack.length();i++) {
            if(c[i] ==ch[j]) {
                v++;
                j++;
            }
            else {
                j=0;
            }
            if(v== needle.length()) {
                return i-needle.length()+1;
            }
        }
        return -1;  
    }
}

public class F_Occurence {
    public static void main(String args[]) {
        Solution ay =new Solution();
        System.out.println(ay.strStr("mississippi", "issip"));
    }
}