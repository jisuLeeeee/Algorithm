package Lv_1.day32;

public class Finding_Mr_Kim_inSeoul {
    public String solution(String[] seoul) {
        String answer = "";

        for(int i=0; i<seoul.length; i++){
            if(seoul[i].equals("Kim")){
                answer = "김서방은 " + i + "에 있다";
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Finding_Mr_Kim_inSeoul findingMrKimInSeoul = new Finding_Mr_Kim_inSeoul();
        String[] a = {"Jane", "Kim"};
        System.out.println(findingMrKimInSeoul.solution(a));
    }
}
