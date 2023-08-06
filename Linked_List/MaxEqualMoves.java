// // import java.util.*;

// // public class MaxEqualMoves {

// //     public static int maxEqualMoves(int arr[]) {
// //         int n = arr.length;

// //         // If the array has less than 4 elements, we cannot perform any moves.
// //         if (n < 4) {
// //             return 0;
// //         }

// //         // Check if all elements are the same.
// //         boolean allSame = true;
// //         for (int i = 1; i < n; i++) {
// //             if (arr[i] != arr[0]) {
// //                 allSame = false;
// //                 break;
// //             }
// //         }
// //         if (allSame) {
// //             return (n % 2 == 0) ? n / 2 : (n - 1) / 2;
// //         }

// //         // Calculate the maximum possible moves for the first two elements or last two elements
// //         int maxMovesFirstLast = Math.min(1, n - 1);

// //         int maxMovesLast = Math.min(2,n-1);

// //         // Calculate the maximum possible moves for the first and last element
// //         int maxMovesFirstAndLast = Math.min(1, (n - 2) / 2);

// //         return maxMovesFirstLast + maxMovesFirstAndLast+ maxMovesLast;
// //     }

// //     public static void main(String[] args) {
// //         // int[] A = {4,1,4,3,3,2,5,2};
// //         int[] A = {3,1,5,3,3,4,2};
// //         int result = maxEqualMoves(A);
// //         System.out.println(result);  // Output: 1
// //     }
// // }


// import java.util.HashMap;
// import java.util.Map;

// public class MaxEqualMoves {

//     public static int maxEqualMoves(int[] arr) {
//         int n = arr.length;

//         // If the array has less than 2 elements, we cannot perform any moves.
//         if (n < 2) {
//             return 0;
//         }

//         // Count the occurrences of each sum of deleting two elements from the array
//         Map<Integer, Integer> sumsCount = new HashMap<>();
//         for (int i = 0; i < n - 1; i++) {
//             for (int j = i + 1; j < n; j++) {
//                 int currentSum = arr[i] + arr[j];
//                 sumsCount.put(currentSum, sumsCount.getOrDefault(currentSum, 0) + 1);
//             }
//         }

//         // If all sums are the same, we can perform all possible moves
//         if (sumsCount.size() == 1) {
//             return n / 2;
//         }

//         // Find the most frequent sum and its frequency
//         int maxFreqSum = 0;
//         int maxFreq = 0;
//         for (Map.Entry<Integer, Integer> entry : sumsCount.entrySet()) {
//             if (entry.getValue() > maxFreq) {
//                 maxFreq = entry.getValue();
//                 maxFreqSum = entry.getKey();
//             }
//         }

//         // Calculate the maximum number of moves for that sum
//         int maxMoves = maxFreq * 2;

//         // Check if the number of elements in the array is even, and the sum of the two elements at the center is also the maxFreqSum
//         if (n % 2 == 0 && arr[n / 2 - 1] + arr[n / 2] == maxFreqSum) {
//             maxMoves = Math.max(maxMoves, maxFreq * 2 - 1);
//         }

//         return maxMoves;
//     }

//     public static void main(String[] args) {
//         int[] A = {4, 1, 4, 3, 3, 2, 5, 2};
//         int result = maxEqualMoves(A);
//         System.out.println(result);  // Output: 4
//     }
// }

public class MaxEqualMoves {
    public static int solution (int a []) {
        int se=a[0]+a[a.length-1];
        int ss=a[0]+a[1];
        int ee= a[a.length-1]+a[a.length-2];
        int l= a.length;
        int count_se=0;
        int count_ss=0;
        int count_ee=0;
        // For Se
        for(int i=0;i<l;) {

            if(a[i]+a[l-1-i]==se) {
                count_se++;
                i++;
            }
            else if(a[i]+a[i+1]==se) {
                count_se++;
                i+=2;
            }

            else if(a[l-1-i] + a[l-2-i]==se) {
                count_se++;
                i+=2;

            }
        }

        // For SS
        for(int i=0;i<l;) {

            if(a[i]+a[i+1]==count_ss) {
                count_ss++;
                i+=2;
            }

            else if(a[l-1-i] + a[l-2-i]==count_ss){
                count_ss++;
                i+=2;
            }

            else if(a[i]+a[l-1-i]==count_ss) {
                count_ss++;
                i++;
            }
        }

        // For EE
        for(int i=0;i<l;){
            if(a[l-1-i] + a[l-2-i]==count_ee){
                count_ee++;
                i+=2;
            }

            else if(a[i]+a[i+1]==count_ee) {
                count_ee++;
                i+=2;
            }

            else if(a[i]+a[l-1-i]==count_ee){
                count_ee++;
                i++;
            }
    }

    int m=Math.max(count_se,count_ss);
    int n=Math.max(count_ee,m);
    return n;
}

public static void main(String[] args) {
        int[] A = {4, 1, 4, 3, 3, 2, 5, 2};
        int result = solution(A);
        System.out.println(result);  // Output: 4
    }
}

// import java.util.HashMap;
// import java.util.Map;

// public class MaxEqualMoves {

//     public static int maxEqualMoves(int[] arr) {
//         int n = arr.length;

//         // If the array has less than 2 elements, we cannot perform any moves.
//         if (n < 2) {
//             return 0;
//         }

//         // Count the occurrences of each sum of deleting elements from the array
//         Map<Integer, Integer> sumsCount = new HashMap<>();

//         // Consider deleting the first two elements
//         sumsCount.put(arr[0] + arr[1], 1);

//         // Consider deleting the last two elements
//         sumsCount.put(arr[n - 2] + arr[n - 1], 1);

//         // Consider deleting the first and last elements
//         sumsCount.put(arr[0] + arr[n - 1], 1);

//         // Calculate the maximum number of moves for that sum
//         int maxMoves = 1;

//         for (int i = 2; i < n - 2; i++) {
//             int sumFirstTwo = arr[i] + arr[i + 1];
//             int sumLastTwo = arr[i - 1] + arr[i];
//             int sumFirstLast = arr[i - 1] + arr[i + 1];

//             int maxSum = Math.max(sumFirstTwo, Math.max(sumLastTwo, sumFirstLast));
//             sumsCount.put(maxSum, sumsCount.getOrDefault(maxSum, 0) + 1);
//             maxMoves = Math.max(maxMoves, sumsCount.get(maxSum));
//         }

//         return maxMoves;
//     }

//     public static void main(String[] args) {
//         // int[] A = {4, 1, 4, 3, 3, 2, 5, 2};
//         // int[] A = {3,1,5,3,3,4,2};
//         int A[] ={1,9,8,9,5,1,2};
//         int result = maxEqualMoves(A);
//         System.out.println(result);  // Output: 4
//     }
// }
