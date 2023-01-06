package day10;

public class Lv_0_Rock_Paper_Scissors {
    public String solution(String rsp) {
        String answer = "";

        for(int i=0; i<rsp.length(); i++){
            if(rsp.charAt(i) == '2')
                answer += '0';
            else if(rsp.charAt(i) == '0')
                answer += '5';
            else
                answer += '2';
        }

        return answer;
    }
    public static void main(String[] args) {
        Lv_0_Rock_Paper_Scissors rockPaperScissors = new Lv_0_Rock_Paper_Scissors();
        String a = "052";
        System.out.println(rockPaperScissors.solution(a));
    }
}
