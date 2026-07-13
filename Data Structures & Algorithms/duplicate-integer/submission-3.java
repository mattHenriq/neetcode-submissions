class Solution {
    public boolean hasDuplicate(int[] nums) {

        Set<Integer> resultado = new HashSet<>();

        for(int num : nums){
            if(resultado.contains(num)){
                return true;
            }

            resultado.add(num);
        }

        return false;
        

    }
}