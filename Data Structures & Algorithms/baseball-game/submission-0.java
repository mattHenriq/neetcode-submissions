class Solution {
    public int calPoints(String[] operations) {
        
        ArrayList<Integer> stack = new ArrayList<Integer>();

        for(String ops : operations){
            if (ops.equals("+")){
                stack.add(stack.get(stack.size() - 1) + stack.get(stack.size() - 2));
            }else if (ops.equals("D")){
                stack.add(stack.get(stack.size() - 1) * 2);
            }else if (ops.equals("C")){
                stack.remove(stack.size() - 1);
            } else {
                stack.add(Integer.parseInt(ops));
            }
        }

        int total = 0;
        for (int score : stack) total += score;
        return total;
    }
}