class Solution {
    public int searchInsert(int[] nums, int target) {
        int low=0, high=nums.length-1, mid=0;
        while(low<=high){
            mid=low+(high-low)/2; //this avoids integer overflow .. // notice the parentheses
            if(nums[mid]==target){
                return mid;  
            }
            else if(target<nums[mid]){
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return low; // because 
    }
}