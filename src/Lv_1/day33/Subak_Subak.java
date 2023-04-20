package Lv_1.day33;

public class Subak_Subak {
    public String solution(int n) {
        String answer = "";

        for(int i=0; i<n; i++){
            if(i % 2 == 0)
                answer += "수";
            else
                answer += "박";
        }
        return answer;
    }

    public static void main(String[] args) {
        Subak_Subak subakSubak = new Subak_Subak();
        int a = 11;
        System.out.println(subakSubak.solution(a));
    }
}
