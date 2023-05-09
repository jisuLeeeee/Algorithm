package Lv_2.day41;

import java.util.Arrays;

public class Create_Minimum {
    public int solution(int []A, int []B)
    {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        for(int i=0; i<A.length; i++){
            answer += A[i] * B[B.length-1-i];
        }

        return answer;
    }

    public static void main(String[] args) {
        Create_Minimum createMinimum = new Create_Minimum();
        int[] a = {1, 4, 2}, b = {5, 4, 4};
        System.out.println(createMinimum.solution(a, b));
    }
}
