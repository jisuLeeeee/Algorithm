package day10;

public class Lv_0_Number_of_Dice {
    public int solution(int[] box, int n) {
        int answer = 0;

        answer = (box[0] / n) * (box[1] / n) * (box[2] / n);

        return answer;
    }
    public static void main(String[] args) {
        Lv_0_Number_of_Dice numberOfDice = new Lv_0_Number_of_Dice();
        int[] a = {10, 8, 6};
        int b = 3;
        System.out.println(numberOfDice.solution(a, b));
    }
}
