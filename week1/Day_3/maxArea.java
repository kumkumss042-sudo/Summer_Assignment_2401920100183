package Summer_Assignment_2401920100183.week1.Day_3;
class Solution {
    public int maxArea(int[] height) {
     int max=Integer.MIN_VALUE;
     int i=0,j=height.length-1;
     while(j!=i){
         int width=(j-i);
         int area=width*(Math.min(height[i],height[j]));
         max=Math.max(area,max);
         if(height[i]<height[j]) i++;
         else j--;
    }
    return max;
    }
}
