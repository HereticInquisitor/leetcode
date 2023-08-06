import java.util.*;

public class MaxCon {

    public static int maxConsecutiveIntegers(int[] arr) {
        int n = arr.length;
        if (n <= 2l) {
            return n;
        }

        Arrays.sort(arr);

        int maxFreq = 1;
        int currentFreq = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                currentFreq++;
            } else {
                maxFreq = Math.max(maxFreq, currentFreq);
                currentFreq = 1;
            }
        }

        maxFreq = Math.max(maxFreq, currentFreq);

        return maxFreq;
    }

    public static void main(String[] args) {
        int[] arr = {4,7,1,5,3};
        // int arr [] = {12,12,12,15,10};
        // int arr [] ={18,26,18,24,24,20,22};
        int result = maxConsecutiveIntegers(arr);
        boolean t= false;
        Map<Integer, Integer> mp= new HashMap<>();

        for (int i = 0; i < arr.length; i++)
        {
            if (mp.containsKey(arr[i]))
            {
                mp.put(arr[i], mp.get(arr[i]) + 1);
            }
            else
            {
                mp.put(arr[i], 1);
            }
        }
        // Traverse through map and print frequencies
        for (Map.Entry<Integer, Integer> entry : mp.entrySet())
        {
            if(entry.getValue()>1)
            t=true;
            break;
        }
        if(t)
        System.out.println(arr.length-result);
          // Output: 2

        else 
        System.out.println(result);
    }
}


// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
// import java.util.*;
// class Solution {
//     public int solution(int[] A) {
//         // Implement your solution here
//         int N=A.length;
//         if (N<= 1) {
//             return N;
//         }

//         Arrays.sort(A);

//         int mf= 1;
//         int cf = 1;

//         for (int i = 1; i < N; i++) {
//             if (A[i] == A[i - 1]) {
//                 cf++;
//             } else {
//                 mf = Math.max(mf, cf);
//                 cf = 1;
//             }
//         }

//         mf = Math.max(mf, cf);
//         return Math.max(N-mf, mf);
//     }
// }
