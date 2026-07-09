class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> maps = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int resultado = target - nums[i];

            if(maps.containsKey(resultado)){
                return new int []{ maps.get(resultado), i };
            }
            maps.put(nums[i], i);
        }
        return new int[]{};
    }
}
