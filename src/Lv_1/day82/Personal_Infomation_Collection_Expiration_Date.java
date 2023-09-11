package Lv_1.day82;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Personal_Infomation_Collection_Expiration_Date {
    public int[] solution(String today, String[] terms, String[] privacies) {
        HashMap<String, Integer> term_map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(String term : terms){// 약관 종류 별로 기한 정리
            term_map.put(term.split(" ")[0], Integer.parseInt(term.split(" ")[1]));
        }

        //오늘 날짜 년도, 월, 일 변수에 저장
        int year = Integer.parseInt(today.split("\\.")[0]);
        int month = Integer.parseInt(today.split("\\.")[1]);
        int day = Integer.parseInt(today.split("\\.")[2]);

        for(int i=0; i<privacies.length; i++){
            String privacy_date = privacies[i].split(" ")[0];
            int type = term_map.get(privacies[i].split(" ")[1]) * 28;

            // for문 밖에서 선언한 변수들을 이용해서 총 일수로 계산
            int num = (year - Integer.parseInt(privacy_date.split("\\.")[0])) * 12 * 28
                    + (month - Integer.parseInt(privacy_date.split("\\.")[1])) * 28
                    + (day - Integer.parseInt(privacy_date.split("\\.")[2]));

            if(num >= type) // 수집된 일자의 일수가 정해진 기한의 일수보다 크기 때문에 번호 저장
                list.add(i+1);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        Personal_Infomation_Collection_Expiration_Date personalInfomationCollectionExpirationDate = new Personal_Infomation_Collection_Expiration_Date();
        String today = "2022.05.19";
        String[] terms = {"A 6", "B 12", "C 3"},
        privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
        for(int i : personalInfomationCollectionExpirationDate.solution(today, terms, privacies))
            System.out.print(i + ",");
    }
}
