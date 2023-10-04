import java.util.*;

class Solution {
    public int removeDuplicates(int[] nums) {
        boolean flag= false;
        for(int i=0;i<nums.length;i++){
            if(!flag){
                if( i!=0 && nums[i]==nums[i-1] ){
                    flag =true;
                }
            }
            else {
                if(1!=0 && nums[i]==nums[i-1]){
                    nums[i]=nums[i+1];
                    i--;
                    flag=false;
                }
            }
        }
        return nums.length;
    }
}

public class remove_duplicate {
    public static void main(String args[]){
        Solution ay = new Solution();
        int nums[] = {1,1,1,2,2,3};
        int a = ay.removeDuplicates(nums);
        System.out.println(a);
    }
}