package Lv_1.day50;

public class Divided_String {
    public int solution(String s) {
        int answer = 1;
        String x = s.substring(0, 1);
        int xCnt = 1, diffCnt = 0;

        for(int i = 1; i < s.length()-1; i++){
            if(!x.equals(s.substring(i, i+1))){
                diffCnt++;
            }

            else {
                xCnt++;
            }
            if(xCnt == diffCnt){
                answer++;
                if(i != s.length()-1){
                    x = s.substring(i+1, i+2);
                    xCnt = 1;
                    diffCnt=0;
                    i++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Divided_String dividedString = new Divided_String();
        String a = "aaabbaccccabba";
        System.out.println(dividedString.solution(a));
    }
}
