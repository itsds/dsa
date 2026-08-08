class Solution {
    public int search(int[] nums, int target) {

        int index=-1;
        int len = nums.length;
        int low=0;
        int high=len-1;
        int mid=(low+high)/2;

        while(low<=high){
            if(nums[mid]==target)
                return mid;

            else if(target < nums[mid]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
            mid=(low+high)/2;
        }
        return -1;
        
    }
}