class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int matrixLength = matrix.length;

        int low = 0;
        int high = matrixLength - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (target < matrix[mid][0]) {
                high = mid - 1;
            }
            else if (target > matrix[mid][matrix[mid].length - 1]) {
                low = mid + 1;
            }
            else {
                return secondLevel(matrix[mid], target);
            }
        }

        return false;
    }

    public boolean secondLevel(int[] nums, int target) {

        int len = nums.length;
        int low = 0;
        int high = len - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (nums[mid] == target) {
                return true;
            }
            else if (target < nums[mid]) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        return false;
    }
}