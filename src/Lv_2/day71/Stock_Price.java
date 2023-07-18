package Lv_2.day71;

import java.util.Stack;

public class Stock_Price {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<prices.length; i++){
            while(!stack.isEmpty() && prices[i] < prices[stack.peek()]){
                answer[stack.peek()] = i - stack.peek();
                stack.pop();
            }
            stack.push(i);
        }

        while(!stack.isEmpty()){
            answer[stack.peek()] = prices.length - stack.peek() - 1;
            stack.pop();
        }
        return answer;
    }

    public static void main(String[] args) {
        Stock_Price stockPrice = new Stock_Price();
        int[] prices = {1, 2, 3, 2, 3};
        for(int i : stockPrice.solution(prices))
            System.out.println(i);
    }
}
