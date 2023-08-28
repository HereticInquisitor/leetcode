class Solution {
    public int removeDuplicates(int []nums) {
        if(nums.length ==0) {
            return 0;
        }
        int i=0;
        for(int j=1;j<nums.length;j++) {
            if(nums[i] != nums[j]) {
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
        
    }    
}

public class RDSA {
    public static void main(String args[]) {
        Solution ay = new Solution();
        int a[]= {1,1,2,2,2,3,3};
        System.out.println(ay.removeDuplicates(a));
    }
}