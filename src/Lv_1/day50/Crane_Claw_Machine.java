package Lv_1.day50;

import java.util.ArrayList;

public class Crane_Claw_Machine {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;

        ArrayList<Integer> basket = new ArrayList<>();

        for (int move : moves) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][move - 1] != 0){
                    if(basket.size() == 0){
                        basket.add(board[j][move - 1]);
                        board[j][move - 1] = 0;
                        break;
                    }

                    else if (board[j][move - 1] != basket.get(basket.size()-1)) {
                        basket.add(board[j][move - 1]);
                        board[j][move - 1] = 0;
                        break;

                    } else {
                        basket.remove(basket.size()-1);
                        board[j][move - 1] = 0;
                        answer+=2;
                        break;
                    }
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Crane_Claw_Machine craneClawMachine = new Crane_Claw_Machine();
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};
        System.out.println(craneClawMachine.solution(board, moves));
    }
}
