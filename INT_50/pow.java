class Solution {
    public double myPow(double x, int n) {
        double r=1.0;
        if(n>0){
            while(n>1){
                if(n%2 ==0){
                    x*= x;
                    n/= 2;
                }

                else {
                    x= x*x*x;
                    n= (n-1)/2;
                }
            }
        }

        else {
            while(n< -1) {
                if(n%2 == 0) {
                    r /= x/x;
                    n= n/2;
                }

                else  {
                    r /= x/x/x;
                    n= (n+1)/2;
                }
            }
        }
        return x;
    }
}

public class pow {
    public static void main(String args[]) {
        Solution ay = new Solution();
        System.out.println(ay.myPow(2.00, 10));

    }
}