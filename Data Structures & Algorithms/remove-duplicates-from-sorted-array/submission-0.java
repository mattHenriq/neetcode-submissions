class Solution {
    public int removeDuplicates(int[] nums) {
        int posicaoInsercao = 1;

        for(int leitor = 1; leitor < nums.length; leitor++){
            if(nums[leitor] != nums[leitor - 1]){
                nums[posicaoInsercao] = nums[leitor];
                posicaoInsercao++;
            }
        }

        return posicaoInsercao;

    }
}