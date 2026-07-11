class Solution {
    public int maxSubArray(int[] nums) {

        int maxsum= Integer.MIN_VALUE;
        int currentsum=0;
        for(int start=0; start < nums.length ; start++){
            currentsum= currentsum + nums[start];
            if(currentsum > maxsum){
                maxsum=currentsum;
            }
                if( currentsum <= 0){
                    currentsum=0;
                }
                
        }
        return maxsum;
        
    }
}