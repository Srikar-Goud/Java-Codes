class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        for(int i = 0;i<  n-1; i++)
        {
            int minIn = i;
        for(int j = i; j < n; j++)
        {
            if(nums[j] < nums[minIn])
            minIn = j;
        }
        int temp = nums[minIn];
        nums[minIn] = nums[i];
        nums[i] = temp;
    }
    }
    return nums;
}
