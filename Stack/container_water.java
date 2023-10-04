class Solution {
    public int maxArea(int[] height) {
     int l=0;
     int r=height.length-1;
     int max=0;
     while(l<r) {
         int w= r-l;
         int h= Math.min(height[l], height[r]);
         int area= h*w;
         max=Math.max(max,area);
         if(height[l] < height[r]) 
            l++;
        else if(height[l] > height[r]) r--;

        else {
            l++;
            r--;
        }
     }   
     return max;
    }
}

public class container_water {
    public static void main(String arg[]) {
        Solution ay = new Solution();
        System.out.println(ay.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
}