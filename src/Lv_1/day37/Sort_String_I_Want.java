package Lv_1.day37;

import java.util.Arrays;

public class Sort_String_I_Want {
    public String[] solution(String[] strings, int n) {

        for(int i=0; i<strings.length-1; i++){
            for(int j=0; j<strings.length-1; j++){
                if(strings[j].charAt(n) > strings[j+1].charAt(n)){
                    String tmp = strings[j];
                    strings[j] = strings[j+1];
                    strings[j+1] = tmp;
                }
                else if(strings[j].charAt(n) == strings[j+1].charAt(n)){
                    if(strings[j].compareTo(strings[j+1]) > 0){
                        String tmp = strings[j];
                        strings[j] = strings[j+1];
                        strings[j+1] = tmp;
                    }
                }
            }
        }

        return strings;
    }

    public static void main(String[] args) {
        Sort_String_I_Want sortStringIWant = new Sort_String_I_Want();
        String[] a = {"sun", "bed", "car"};
        int b = 1;
        System.out.println(Arrays.toString(sortStringIWant.solution(a,b)));
    }
}
