import java.util.*;
public class p2 {
    public static void main(String args[]) {
        Scanner ay= new Scanner(System.in);
        int n= ay.nextInt();
        int a[] =new int[n];
        for(int i=0;i<n;i++) {
            a[i] = ay.nextInt();
        }
        int m= ay.nextInt();
        int b[] =new int[m];
        for(int i=0;i<m;i++) {
            b[i]= ay.nextInt();
        }
        int p= ay.nextInt();
        int s=0;
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(b[i] == a[j]) {
                    s=s+(b[i]*p);
                }

                else {
                    s=s-(b[i]*p);
                }
            }
        }

        System.out.println(s/2);
    }
}