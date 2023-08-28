import java.util.*;

class GFG {
    public static void main(String[] args) {
        int a[] = {1,1,1,2};
        int n = a.length;

        List<Integer> removedSubarray = getRemovedSubarray(a, n);
        
        if (removedSubarray.size() == n) {
            System.out.println("-1");  // Output: -1
        } else {
            for (int num : removedSubarray) {
                System.out.print(num + " ");  // Output: 1 2
            }
        }
    }

    static List<Integer> getRemovedSubarray(int a[], int n) {
        List<Integer> removedSubarray = new ArrayList<>();
        int startIndex = -1;
        
        for (int i = 0; i < n - 1; i++) {
            if (a[i] >= a[i + 1]) {
                startIndex = i;
                while (i + 1 < n && a[i] >= a[i + 1]) {
                    i++;
                }
                int endIndex = i-1;
                for (int j = startIndex; j <= endIndex; j++) {
                    removedSubarray.add(a[j]);
                }
            }
        }

        return removedSubarray;
    }
}
