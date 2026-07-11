class Solution {
    public int[] replaceElements(int[] arr) {
         int maiorDireita = arr[arr.length - 1];

         arr[arr.length - 1] = -1;

         for(int i = arr.length -2; i >= 0; i--){
            int valorAtual = arr[i];

            arr[i] = maiorDireita;

            maiorDireita = Math.max(maiorDireita, valorAtual);
         }

         return arr;

    }
}