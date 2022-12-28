package day6;

public class Lv_0_Letter {
    public int solution(String message) {
        int answer = 0;

        if(message.length() >= 1 && message.length() <= 50){
            answer = message.length() * 2;
        }

        return answer;
    }

    public static void main(String[] args) {
        Lv_0_Letter letter = new Lv_0_Letter();
        String str = "happy birthday!!";
        System.out.println(letter.solution(str));
    }
}
