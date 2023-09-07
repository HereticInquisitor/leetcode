import java.util.*;
class Solution {
    public int [] twoSum(int [] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++) {
            int diff = target - nums[i];
            if(map.containsKey(diff)) {
                return new int[]{map.get(diff),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
}

class TwoSum {
    public static void main(String args[]) {
        Solution a= new Solution();
        int [] arr= {2,7,11,15};
        System.out.println(Arrays.toString(a.twoSum(arr,9)));
    }
}