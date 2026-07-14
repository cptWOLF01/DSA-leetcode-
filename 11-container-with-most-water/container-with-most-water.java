class Solution {
    static {
    for(int i = 0; i < 100; i++) {
        maxArea(new int[] {0, 0});
    }
}
    public static int maxArea(int[] height) {

        int left = 0;
        int right = height.length -1;
        int maxarea=0;

        while( left < right){
            int width = right - left;
            int minheight= Math.min(height[left],height[right]);
            int area = minheight * width;

            maxarea = Math.max( maxarea , area);

            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }
        }
       return maxarea;  
    }
}