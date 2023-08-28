class Solution {
    public int divide(int dividend, int divisor) {
        int c=0;
        boolean flag =false;
        if((dividend>0 && divisor >0) || (dividend <0 && divisor <0)){
        if(dividend <0){
            dividend = -dividend;
            divisor = -divisor;
        }
        while(dividend >= divisor) {
            dividend-=divisor;
            c++;
        }
        flag= true;
    }

        if(flag)
        return c;

        if(dividend <0) {
        dividend = - dividend;
        while(dividend >= divisor) {
            dividend-=divisor;
            c++;
        }
        c=-c;
    }

    if(divisor <0) {
        divisor = - divisor;
        while(dividend >= divisor) {
            dividend-=divisor;
            c++;
        }
        c=-c;
    }

        return c;
    }
}

public class dividew {
    public static void main(String args[]) {
        Solution ay = new Solution();
        System.out.println(ay.divide(-2147483648,-1));
    }
}