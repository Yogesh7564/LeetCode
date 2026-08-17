class Solution {
    public int maxSubArray(int[] nums) {
        int max_sum=nums[0];
        int curr_sum=0;

        for(int num:nums){
            curr_sum=curr_sum+num;
            max_sum=Math.max(max_sum, curr_sum);

            if(curr_sum<0){
                curr_sum=0;
            }
        }
        return max_sum;
    }
}