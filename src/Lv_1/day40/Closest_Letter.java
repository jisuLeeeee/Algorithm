package Lv_1.day40;

public class Closest_Letter {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        String a = "";

        for(int i=0; i<s.length(); i++){
            if(a.contains(String.valueOf(s.charAt(i)))){
                answer[i] = i - a.lastIndexOf(s.charAt(i));
            }
            else{
                answer[i] = -1;
            }
            a += s.charAt(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Closest_Letter closestLetter = new Closest_Letter();
        String a = "banana";
        for(int i : closestLetter.solution(a))
            System.out.println(i);
    }
}
