package Lv_1.day32;

public class Covering_Phone_Number {
    public String solution(String phone_number) {
        String answer = "";

        for(int i=0; i<phone_number.length() - 4; i++){
            answer += "*";
        }
        answer += phone_number.substring(phone_number.length()-4);

        return answer;
    }

    public static void main(String[] args) {
        Covering_Phone_Number coveringPhoneNumber = new Covering_Phone_Number();
        String a = "010283746383333";
        System.out.println(coveringPhoneNumber.solution(a));
    }
}
