package day30;

public class Lv_1_Find_Average {
    public double solution(int[] arr) {
        double sum = 0;

        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }

        return sum/arr.length;
    }

    public static void main(String[] args) {
        Lv_1_Find_Average findAverage = new Lv_1_Find_Average();
        int[] a = {1,2,3,4};
        System.out.println(findAverage.solution(a));
    }
}
