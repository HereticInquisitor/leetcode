import java.util.*;

public class printS {
    void prin(int ind, ArrayList<Integer> list, int s, int sum, int arr[], int n){
        if(ind==n){
            if (s==sum) 
             System.out.println(list.toString());

        }

        list.add(arr[ind]);
        s+=arr[ind];
        prin(ind+1, list, s, sum, arr, n);

        s-=arr[ind];
        list.remove(list.size()-1);
        }
    public static void main(String args[]){
        printS ay = new printS();
        ArrayList<Integer> list= new ArrayList<>();
        int sum=2;
        int arr[]={1,2,1};
        int n=3;
        ay.prin(0,list, 0, sum, arr, n);

    }
}
