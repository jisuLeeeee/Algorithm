package Lv_1.day38;

public class Minor_Substring {
    public int solution(String t, String p) {
        int answer = 0;
        int pLen = p.length();

        for(int i=0; i<=t.length()-pLen; i++){
            if(Long.parseLong(t.substring(i, pLen+i)) <= Long.parseLong(p)){
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Minor_Substring minorSubstring = new Minor_Substring();
        String a = "3141592", b = "271";
        System.out.println(minorSubstring.solution(a, b));
    }
}
