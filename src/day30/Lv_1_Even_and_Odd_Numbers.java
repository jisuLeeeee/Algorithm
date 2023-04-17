package day30;

public class Lv_1_Even_and_Odd_Numbers {
    public String solution(int num) {

        return (num % 2 == 0) ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        Lv_1_Even_and_Odd_Numbers evenAndOddNumbers = new Lv_1_Even_and_Odd_Numbers();
        int a = 3;
        System.out.println(evenAndOddNumbers.solution(a));
    }
}
