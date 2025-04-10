class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);
        int count = 1;
        int max_count = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i] == nums[i-1]){
                continue;
            }
            if(nums[i] == nums[i-1]+1){
                    count++;
            }

            else if(nums[i] != nums[i-1]){
                max_count = Math.max(count,max_count);
                count = 1;
            }
        }
        return Math.max(count,max_count);
    }
}
