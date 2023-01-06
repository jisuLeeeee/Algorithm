package day10;

public class Lv_0_Decryption {
    public String solution(String cipher, int code) {
        String answer = "";
        for(int i=code; i<=cipher.length(); i+=code){
            answer += cipher.charAt(i-1);
        }

        return answer;
    }
    public static void main(String[] args) {
        Lv_0_Decryption decryption = new Lv_0_Decryption();
        String a = "dfjardstddetckdaccccdegk";
        int b = 4;
        System.out.println(decryption.solution(a, b));
    }
}
