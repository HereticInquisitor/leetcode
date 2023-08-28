class Solution {
    public int strStr(String haystack, String needle) {
        int lh=haystack.length();
        int ln=needle.length();
        int j=0;
        for(int i=0;i<lh;i++) {
            if(haystack.charAt(i)== needle.charAt(j)) {
                j++;
            }
            else {
                i=i-j;
                j=0;
            }
            if(j== ln) {
                return i-ln+1;
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