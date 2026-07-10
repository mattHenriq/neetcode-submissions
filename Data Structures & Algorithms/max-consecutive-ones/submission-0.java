class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int contadorAtual = 0;
        int maiorResultado = 0;

        for(int num : nums){
            if(num == 1){
                contadorAtual++;
                maiorResultado = Math.max(maiorResultado, contadorAtual);
            } else {
                contadorAtual= 0;
            }
            
        }

        return maiorResultado;
    }
}