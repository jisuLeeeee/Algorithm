package Lv_1.day33;

import java.util.Arrays;
public class Add_Num_That_Doesnt_Exist {
    public int solution(int[] numbers) {

        int sum = Arrays.stream(numbers).sum();

        return 45 - sum;
    }

    public static void main(String[] args) {
        Add_Num_That_Doesnt_Exist addNumThatDoesntExist = new Add_Num_That_Doesnt_Exist();
        int[] a = {1,2,3,4,6,7,8,0};
        System.out.println(addNumThatDoesntExist.solution(a));
    }
}
