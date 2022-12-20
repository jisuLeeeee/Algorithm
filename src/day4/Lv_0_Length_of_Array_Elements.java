package day4;

public class Lv_0_Length_of_Array_Elements {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];

        for(int i=0; i < strlist.length; i++){
            answer[i] = strlist[i].length();
        }
        return answer;
    }

    public static void main(String[] args) {
        Lv_0_Length_of_Array_Elements lengthOfArrayElements = new Lv_0_Length_of_Array_Elements();
        String[] str_list = {"We", "are", "the", "world!"};
        for(int i : lengthOfArrayElements.solution(str_list))
            System.out.println(i);
    }
}
