class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        //create one hasmap and stack 
        HashMap<Integer,Integer> map1=new HashMap<>();
        Stack<Integer> stc = new Stack<>();

        // process the nums2
        for(int num:nums2){
            while(!stc.isEmpty() && stc.peek() < num){
                map1.put(stc.pop(),num);
            }
            stc.push(num);
        }

        //Build ans for nums1

        int[] ans=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            ans[i]=map1.getOrDefault(nums1[i],-1);
        }
        return ans;
    }
}