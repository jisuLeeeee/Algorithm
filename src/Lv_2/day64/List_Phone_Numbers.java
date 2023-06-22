package Lv_2.day64;

import java.util.HashSet;
import java.util.Set;

public class List_Phone_Numbers {
    public boolean solution(String[] phone_book) {
        boolean answer = true;

        Set<String> set = new HashSet<>();

        for(String number : phone_book){
            set.add(number);
        }

        for(String number : phone_book){
            for(int i=0; i<number.length(); i++){
                if(set.contains(number.substring(0, i)))
                    return false;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        List_Phone_Numbers listPhoneNumbers = new List_Phone_Numbers();
        String[] p = {"119", "97674223", "1195524421"};
        System.out.println(listPhoneNumbers.solution(p));
    }
}
