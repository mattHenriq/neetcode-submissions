class Solution {
    public boolean hasDuplicate(int[] nums) {

        Set<Integer> contador = new HashSet<>();

        for(int num : nums){
            if(contador.contains(num)){
                return true;
            }

            contador.add(num);
        }

        return false;
    }
}