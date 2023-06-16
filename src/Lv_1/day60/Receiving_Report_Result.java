package Lv_1.day60;

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;

public class Receiving_Report_Result {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, HashSet<String>> reportMap = new HashMap<>();
        Map<String, Integer> reportCntMap = new HashMap<>();

        for (int i = 0; i < id_list.length; i++) {
            String name = id_list[i];
            reportMap.put(name, new HashSet<>());
            reportCntMap.put(name, i);
        }

        for(String r : report){
            String[] strArr = r.split(" ");
            reportMap.get(strArr[1]).add(strArr[0]); // 신고 당한 사람 : 신고한 사람들
        }

        for(int i =0; i<id_list.length; i++){
            if(reportMap.get(id_list[i]).size() >= k){
                for(String n : reportMap.get(id_list[i])){
                    answer[reportCntMap.get(n)]++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Receiving_Report_Result receivingReportResult = new Receiving_Report_Result();
        String[] id = {"muzi", "frodo", "apeach", "neo"}, report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int a = 2;
        System.out.println(Arrays.toString(receivingReportResult.solution(id, report, a)));
    }
}
