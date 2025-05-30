class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        if(nums.length < 2){
            return false;
        }
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1); // to handle the first remainder 0 sum
        // nums = [6, 2, 4], k = 6 use this example as a reference
        int sum = 0;

        for(int i=0;i<nums.length;i++){
            sum += nums[i];

            if(k != 0){
                sum %= k;
            }

            if(map.containsKey(sum)){
                if(i - map.get(sum) >= 2){
                    return true;
                }
            }
            else{
            map.put(sum,i);
            }
    }
        return false;
    }
}
