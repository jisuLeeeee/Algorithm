package Lv_1.day78;

public class Personality_Type_Test {
    public String solution(String[] survey, int[] choices) {
        String answer = "RCJA";
        int[] score = {0, 0, 0, 0, 0, 0, 0, 0};

        for(int i=0; i<choices.length; i++){
            int num = Math.abs(choices[i] - 4);

            String type = survey[i].substring(0, 1);
            if(choices[i] > 4) type = survey[i].substring(1, 2);

            switch(type){
                case "R":
                    score[0] += num;
                    break;
                case "T":
                    score[1] += num;
                    break;
                case "C":
                    score[2] += num;
                    break;
                case "F":
                    score[3] += num;
                    break;
                case "J":
                    score[4] += num;
                    break;
                case "M":
                    score[5] += num;
                    break;
                case "A":
                    score[6] += num;
                    break;
                case "N":
                    score[7] += num;
                    break;
            }
        }

        if(score[0] < score[1])
            answer = answer.replace("R", "T");
        if(score[2] < score[3])
            answer = answer.replace("C", "F");
        if(score[4] < score[5])
            answer = answer.replace("J", "M");
        if(score[6] < score[7])
            answer = answer.replace("A", "N");

        return answer;
    }

    public static void main(String[] args) {
        Personality_Type_Test personalityTypeTest = new Personality_Type_Test();
        String[] s = {"AN", "CF", "MJ", "RT", "NA"};
        int[] c = {5, 3, 2, 7, 5};
        System.out.println(personalityTypeTest.solution(s, c));
    }
}
