public class rotation_count{
    public static void main(String args[]){
        int a[]={4,5,6,7,0,1,2};
        // System.out.println(findPivot(a));
        System.out.println(findPivotDuplicate(a)+1);

    }

    static int findPivotDuplicate(int arr[]){
        int start =0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;

            if(mid<end && arr[mid]> arr[mid+1]){
                return mid;
            }

            if(mid> start && arr[mid]< arr[mid-1]){
                return mid-1;
            }

            // if elements at middle, start, and end are equal then just skip the duplicates
            if(arr[mid]==arr[start] && arr[mid]==arr[end]){
                // Skip the dupliclates

                // NOTE: what if  
                // Check if start is pivot
                if(arr[start]>arr[start+1])
                    return start;
                start++;

                // Check if end is pivot
                if(arr[end]< arr[end-1])
                    return end-1;
                end--; 
            }
            // left side is sorted pivot should be in right
            else if(arr[start]< arr[mid] || (arr[start]==arr[mid] && arr[end]<arr[mid])){
                start=mid+1;
            }
            else{
                end= mid-1;
            }


        }
        return -1;
    }
}