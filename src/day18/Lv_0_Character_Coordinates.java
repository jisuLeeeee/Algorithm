package day18;

public class Lv_0_Character_Coordinates {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0,0};

        for(int i=0; i<keyinput.length; i++){
            if(keyinput[i].equals("left")){
                if(answer[0] <= -(board[0] / 2)){
                    continue;
                }
                answer[0]--;
            }
            else if(keyinput[i].equals("right")){
                if(answer[0] >= (board[0] / 2)){
                    continue;
                }
                answer[0]++;
            }
            else if(keyinput[i].equals("up")){
                if(answer[1] >= (board[1] / 2)){
                    continue;
                }
                answer[1]++;
            }
            else{
                if(answer[1] <= -(board[1] / 2)){
                    continue;
                }
                answer[1]--;
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        Lv_0_Character_Coordinates characterCoordinates = new Lv_0_Character_Coordinates();
        String[] a = {"down", "down", "down", "down", "down"};
        int[] b = {7, 9};
        for(int i:characterCoordinates.solution(a, b)){
            System.out.println(i);
        }
    }
}
