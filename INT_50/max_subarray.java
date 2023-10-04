class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int max= Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++) {
            sum += nums[i];
            max= Math.max(sum,max);

            if(sum < 0)
                sum=0;

        }

        return max;
    }



    public int maxProduct(int[] nums) {
        int p=1;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++) {
            p*= nums[i];
            max= Math.max(p, max);

            // if(p<0) 
                // p=1;
        }       
        return max;
    }
}

public class max_subarray {
    public static void main(String args[]) {
        Solution ay = new Solution();
        System.out.println(ay.maxSubArray(new int[]{5,4,-1,7,8}));
        System.out.println(ay.maxProduct(new int[]{-3,-1,-1}));
    }
}