package day15;

import java.util.Arrays;

public class Lv_0_Ordering_Medical_Treatment {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] copy_arr = emergency.clone();

        Arrays.sort(copy_arr);

        for(int i=0; i<emergency.length; i++){
            for(int j=0; j<copy_arr.length; j++){
                if(emergency[i] == copy_arr[j])
                    answer[i] = copy_arr.length - j;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Lv_0_Ordering_Medical_Treatment orderingMedicalTreatment = new Lv_0_Ordering_Medical_Treatment();
        int[] a = {3, 76, 24};
        for(int i:orderingMedicalTreatment.solution(a))
            System.out.println(i);

    }
}
