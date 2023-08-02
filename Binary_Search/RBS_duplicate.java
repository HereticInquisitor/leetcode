public class RBS_duplicate{
    public static void main(String args[]){

        int a[]={2,2,7,2,2,2};
        // System.out.println(findPivot(a));
        System.out.println(search(a,2));

    }

    static int search(int [] nums, int target){
        int pivot= findPivotDuplicate(nums);
        //  if we do not find a pivot then the array is not rotated then just do normal binary search
        if(pivot ==-1){
            return binarySearch(nums, target, 0, nums.length-1);
        }

        // if pivot is found then we have two separate arrays
        // Case 1:
        if(nums[pivot] == target)
            return pivot;
        // Case 2: target is greater than start
        if(target >= nums[0]){
            return binarySearch(nums, target, 0, pivot-1);
        }

        else{
            return binarySearch(nums, target, pivot+1, nums.length-1);
        }
    }
    

    static int binarySearch(int []arr, int target, int start, int end){
        while(start<=end){
            int mid =start+(end-start)/2;
            
            if(target==arr[mid])
                return mid;

            if(target < arr[mid]){
                end=mid-1;
            }

            else
                start = mid+1;
             
        }
        return -1;
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