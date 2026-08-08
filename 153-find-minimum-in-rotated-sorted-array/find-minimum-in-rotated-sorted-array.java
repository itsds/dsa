class Solution {
    public int findMin(int[] nums) { 
        
        if(nums.length==1)
            return nums[0];
        int len=nums.length;

        if(nums[0] < nums[len-1])
            return nums[0];

        int low=0;
        int high=len-1;
        int mid=(low+high)/2;

        while(low <= high){
            if(nums[mid] > nums[mid+1])
                return nums[mid+1];

            else if(nums[mid-1] > nums[mid])
                return nums[mid];

            else if(nums[low] > nums[mid]){
                high=mid-1;
            }
            else if(nums[low] < nums[mid]){
                low=mid+1;
            }

            mid=(low+high)/2;
        }

        return -1;
    }
}