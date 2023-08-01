public class split_array_sum{
    public static void main(String args[]){
        int []a= {7,2,5,10,8};
        System.out.println(splitArray(a,2));
    }

    public static int splitArray(int nums[], int n){
        int start =0;
        int end=0;

        for(int i=0;i<nums.length;i++){
            start=Math.max(start, nums[i]); // in thr end this will contain the max item from the array
            end+=nums[i];
        }


        //binary search
        while(start< end){
            // try for the middle as potential answer
            int mid =start+(end-start)/2;

            // calculate how many pieces you can divide this in woth max sum
            int sum=0;
            int pieces=1;
            for(int num: nums){
                if(sum+ num> mid){
                    // cannot add this in this sub array, make a new one
                    sum=num;
                    pieces++;
                }
                else{
                    sum+=num;
                }
            } 
            if(pieces > n){
                start=mid+1;
            }
            else{ 
                end = mid;
            }
        }

        return end;
    }


}