class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum = nums[0] + nums[1] + nums[2];

       
        for(int i=0;i<nums.length;i++){
            int j = i+1;
            int k = nums.length-1;
            while(j < k){
            int sum = nums[i] + nums[j] + nums[k];
            if(Math.abs(sum-target) < Math.abs(closestSum-target)){
                closestSum = sum;
            }
          
            if(sum == target ){
                return target;

            }
            else if(sum > target){
                k--;
            }
            else if(sum < target){
                j++;
            }


            }
        }
      return closestSum; 
    }
}
