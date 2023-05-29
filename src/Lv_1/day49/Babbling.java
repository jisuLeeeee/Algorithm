package Lv_1.day49;

public class Babbling {
    public int solution(String[] babbling) {
        int answer = 0;

        for(String i : babbling){
            String baby_str = i.replaceAll("ayaaya|yeye|woowoo|mama", " ");
            baby_str = baby_str.replaceAll("aya|ye|woo|ma", "");
            if(baby_str.equals(""))
                answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Babbling babbling = new Babbling();
        String[] bab = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
        System.out.println(babbling.solution(bab));
    }
}
