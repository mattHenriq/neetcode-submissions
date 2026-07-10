class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> grupos = new HashMap<>();

        for(String palavra : strs){
            char[] letras = palavra.toCharArray();
            Arrays.sort(letras);

            String chave = new String(letras);

            if(!grupos.containsKey(chave)){
                grupos.put(chave, new ArrayList<>());
            }

            grupos.get(chave).add(palavra);
        }

        return new ArrayList<>(grupos.values());

    }
}
