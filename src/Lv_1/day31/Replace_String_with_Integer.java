package Lv_1.day31;

public class Replace_String_with_Integer {
    public int solution(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        Replace_String_with_Integer replaceStringWithInteger = new Replace_String_with_Integer();
        String a = "-1234";
        System.out.println(replaceStringWithInteger.solution(a));
    }
}
