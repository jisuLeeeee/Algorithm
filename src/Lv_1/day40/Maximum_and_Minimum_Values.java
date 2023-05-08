package Lv_1.day40;

public class Maximum_and_Minimum_Values {
    public String solution(String s) {
        String answer = "";
        String[] num = s.split(" ");

        //최솟값 최댓값 구하기
        for(int i=0; i<num.length-1; i++){
            for(int j=i+1; j<num.length; j++){
                if(Integer.parseInt(num[i]) > Integer.parseInt(num[j])){
                    String tmp = num[i];
                    num[i] = num[j];
                    num[j] = tmp;
                }
            }
        }
        answer += num[0] + " " + num[num.length - 1];

        return answer;
    }

    public static void main(String[] args) {
        Maximum_and_Minimum_Values maximumAndMinimumValues = new Maximum_and_Minimum_Values();
        String a = "-1 -2 -3 -4";
        System.out.println(maximumAndMinimumValues.solution(a));
    }
}
