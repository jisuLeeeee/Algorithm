package Lv_1.day52;

public class Code_Two_People {
    public String solution(String s, String skip, int index) {
        String answer = "";

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            for(int j=0; j<index; j++){
                c++;
                if(c > 'z'){
                    c -= 26;
                }
                if(skip.contains(String.valueOf(c))){
                    j--;
                }
            }
            answer += c;
        }
        return answer;
    }

    public static void main(String[] args) {
        Code_Two_People codeTwoPeople = new Code_Two_People();
        String s = "aukks", skip = "wbqd";
        int index = 5;
        System.out.println(codeTwoPeople.solution(s, skip, index));
    }
}
