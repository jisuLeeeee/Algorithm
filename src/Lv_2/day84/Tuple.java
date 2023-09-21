package Lv_2.day84;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Comparator;

public class Tuple {
    public int[] solution(String s) {

        ArrayList<Integer> result = new ArrayList<>();

        s = s.substring(2, s.length()-2).replace("},{", "-");
        String[] arr = s.split("-");

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length(); // 오름차순
            }
        });

        for(String str : arr){
            String[] num_arr = str.split(",");
            for(String num : num_arr){
                if(!result.contains(Integer.parseInt(num))){
                    result.add(Integer.parseInt(num));
                }
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        Tuple tuple = new Tuple();
        String str = "{{1,2,3},{2,1},{1,2,4,3},{2}}";
        for(int i : tuple.solution(str))
            System.out.println(i);
    }
}
