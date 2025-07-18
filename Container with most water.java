class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length-1;
        int max = Integer.MIN_VALUE;
        while(start < end){
            int length = Math.min(height[start],height[end]);
            int width = end-start;
            int area =  length*width;
            max = Math.max(area,max);
            if(height[start] < height[end]){
                start++;
            }
            else{
                end--;
            }
            
            
        }
        return max;

    }
}
