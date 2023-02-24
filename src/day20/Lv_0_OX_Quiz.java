package day20;

public class Lv_0_OX_Quiz {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        String[][] calc_arr = new String[quiz.length][];

        for(int i=0; i<quiz.length; i++){
            calc_arr[i] = quiz[i].split(" ");
        }

        for(int i=0; i<calc_arr.length; i++){
            for(int j=1; j<calc_arr[i].length; j++){
                int ans = Integer.parseInt(calc_arr[i][0]);
                int quiz_ans = Integer.parseInt(calc_arr[i][calc_arr[i].length - 1]);
                if(calc_arr[i][j].equals("-")){
                    if(ans - Integer.parseInt(calc_arr[i][j+1]) == quiz_ans)
                        answer[i] = "O";
                    else
                        answer[i] = "X";
                }
                else if(calc_arr[i][j].equals("+")){
                    if(ans + Integer.parseInt(calc_arr[i][j+1]) == quiz_ans)
                        answer[i] = "O";
                    else
                        answer[i] = "X";
                }

            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Lv_0_OX_Quiz oxQuiz = new Lv_0_OX_Quiz();
        String[] a = {"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"};
        for(String i:oxQuiz.solution(a))
            System.out.println(i);
    }
}
