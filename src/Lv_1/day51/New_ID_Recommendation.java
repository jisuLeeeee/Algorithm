package Lv_1.day51;

public class New_ID_Recommendation {
    public String solution(String new_id) {
        String answer = "";

        answer = new_id.toLowerCase();
        answer = answer.replaceAll("[^0-9a-z-_.]", "").replaceAll("\\.{2,}", ".")
                .replaceAll("^[.]|[.]$", "");

        if(answer.equals(""))
            answer = "a";
        while(answer.length() < 3){
            answer += answer.substring(answer.length()-1);
        }
        if(answer.length() > 15){
            answer = answer.substring(0, 15);
        }
        answer = answer.replaceAll("[.]$", "");

        return answer;
    }

    public static void main(String[] args) {
        New_ID_Recommendation newIdRecommendation = new New_ID_Recommendation();
        String a = "...!@BaT#*..y.abcdefghijklm";
        System.out.println(newIdRecommendation.solution(a));
    }
}
