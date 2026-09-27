class Solution {
    public int[] buildArray(int[] nums) {
        int N =nums.length;
        for(int i=0;i<N;i++){
           int new_val=nums[nums[i]]%N;
           nums[i] = nums[i]+N*new_val;
        }
        for(int i=0;i<N;i++){
            nums[i]=nums[i]/N;
        }
        return nums;
    }
}