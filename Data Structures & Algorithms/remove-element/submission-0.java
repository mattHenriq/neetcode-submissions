class Solution {
    public int removeElement(int[] nums, int val) {
        
        int posicaoInsercao = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[posicaoInsercao] = nums[i];
                posicaoInsercao++;
            }
        }
        return posicaoInsercao;
    }
}