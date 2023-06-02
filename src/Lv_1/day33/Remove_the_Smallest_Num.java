package Lv_1.day33;

import java.util.Arrays;
import java.util.ArrayList;

public class Remove_the_Smallest_Num {
    public int[] solution(int[] arr) {

        if(arr.length == 1)
            return new int[]{-1};

        ArrayList<Integer> list = new ArrayList<>();

        for(int i : arr){
            list.add(i);
        }

        Arrays.sort(arr);

        list.remove(Integer.valueOf(arr[0]));

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        Remove_the_Smallest_Num removeTheSmallestNum = new Remove_the_Smallest_Num();
        int[] arr = {4,3,2,1};
        System.out.println(Arrays.toString(removeTheSmallestNum.solution(arr)));
    }
}
