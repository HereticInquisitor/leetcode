import java.util.*;
public class missing_number {
    public static void main(String args[]) {
        int [] arr= {3,0,1};
        int f=missing(arr);
        System.out.println(f);
    }

    static int missing(int [] arr) {
        int i=0;
        while(i<arr.length) {
            int correct =arr[i]-1;
            if(arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            }
            else {
                i++;
            }
        }
        // Search for the first missing number
        for(int index=0; index< arr.length; index++) {
            if(arr[index] != index) {
                return index;
            }

        }
        return arr.length;
    }

    static void swap(int [] arr , int first, int second) {
        int temp =arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}