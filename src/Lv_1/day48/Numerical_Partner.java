package Lv_1.day48;



public class Numerical_Partner {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        int[] cntX = new int[10];
        int[] cntY = new int[10];

        for(String x : X.split("")){
            cntX[Integer.parseInt(x)]++;
        }
        for(String y : Y.split("")){
            cntY[Integer.parseInt(y)]++;
        }

        for(int i = 9; i >= 0; i--){
            while(cntX[i] > 0 && cntY[i] > 0){
                answer.append(i);

                cntX[i]--;
                cntY[i]--;
            }
        }

        if("".equals(answer.toString())) return "-1";
        else if("0".equals(answer.toString().substring(0,1))) return "0";

        return answer.toString();
    }

    public static void main(String[] args) {
        Numerical_Partner numericalPartner = new Numerical_Partner();
        String X = "5525", Y = "1255";
        System.out.println(numericalPartner.solution(X, Y));
    }
}
