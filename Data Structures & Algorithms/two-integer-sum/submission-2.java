class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int resultado = target - nums[i];

            if(map.containsKey(resultado)){
                return new int [] { map.get(resultado), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }
}
