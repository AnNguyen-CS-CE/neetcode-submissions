class Solution {
    public int removeElement(int[] nums, int val) {
        int duplicates = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[duplicates] = nums[i];
                duplicates++;
            }
        }
        return duplicates;

    }
}