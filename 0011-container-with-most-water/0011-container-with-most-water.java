class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int maxArea=0;

        while(left<right){
            int area=Math.min(height[left],height[right])*(right-left);

            maxArea=Math.max(area,maxArea);//taking max from curr area and prev maxArea

                if(height[left]<height[right])
                  left++; //choose Long Length to get High AREA 
                  else
                  right--;      
         }
         return maxArea;
    }
}