class Solution {
    public int search(int[] nums, int target) {
         
        if(nums.length==1){
            if(nums[0]==target)
            return 0;
            else
            return -1;
        }
    
        int len=nums.length;

        int low=0;
        int high=len-1;
        int mid=(low+high)/2;

        while(low <= high){
            if(nums[mid]==target)
                return mid;

           if (nums[low] <= nums[mid]) {
                if (nums[low] <= target && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            mid=(low+high)/2;
        }

        return -1;
        
    }
}