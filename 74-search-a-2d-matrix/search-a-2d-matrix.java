class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int matrixLength = matrix.length;

        int low=0;
        int high=matrixLength-1;
        int mid=(low+high)/2;

        while(low <= high){
            if(matrix[mid][0]==target)
                return true;

            else if(matrix[mid][0] > target){
                high=mid-1;
            }
            else {
                boolean secondLevelSearch = secondLevel(matrix[mid], target);
                if(secondLevelSearch)
                    return true;

                else {
                    low=mid+1;
                }
            }
            mid=(low+high)/2;
            
        }

        return false;
        
    }

    public boolean secondLevel(int[] nums, int target) {

        int index=-1;
        int len = nums.length;
        int low=0;
        int high=len-1;
        int mid=(low+high)/2;

        while(low<=high){
            if(nums[mid]==target)
                return true;

            else if(target < nums[mid]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
            mid=(low+high)/2;
        }
        return false;
        
    }
}