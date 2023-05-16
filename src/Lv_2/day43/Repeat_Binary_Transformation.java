package Lv_2.day43;

public class Repeat_Binary_Transformation {
    public int[] solution(String s) {
        int[] answer = new int[2];
        String bin = "";

        while(!bin.equals("1")){
            int len = s.replaceAll("[0]", "").length();
            answer[0] += 1;
            int zeroCnt = s.length() - len;
            answer[1] += zeroCnt;

            bin = Integer.toBinaryString(len);
            s = bin;
        }
        return answer;
    }

    public static void main(String[] args) {
        Repeat_Binary_Transformation repeatBinaryTransformation = new Repeat_Binary_Transformation();
        String a = "110010101001";
        for(int i : repeatBinaryTransformation.solution(a))
            System.out.println(i);
    }
}
