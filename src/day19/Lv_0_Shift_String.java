package day19;

public class Lv_0_Shift_String {
    public int solution(String A, String B) {
        int answer = 0;
        String C = A;

        for(int i=0; i<A.length(); i++){
            if(C.equals(B))
                return answer;
            String c = C.substring(A.length()-1);
            C = c + C.substring(0, A.length()-1);
            answer++;
        }

        return -1;
    }

    public static void main(String[] args) {
        Lv_0_Shift_String shiftString = new Lv_0_Shift_String();
        String a = "hello", b = "ohell";
        System.out.println(shiftString.solution(a, b));
    }
}
