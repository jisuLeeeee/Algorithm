package Lv_2.day58;

import java.util.ArrayList;
import java.util.Arrays;

public class Functional_Development {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] day = new int[progresses.length];

        ArrayList<Integer> list = new ArrayList<>();

        // 작업 일 수 구하기
        for (int i = 0; i < progresses.length; i++) {
            int sum = progresses[i];
            while (sum < 100) {
                sum += speeds[i];
                day[i] += 1;
            }
        }

        int cnt = 1;
        int num = day[0];
        for (int i = 1; i < day.length; i++) {
            if (num < day[i]) {
                list.add(cnt);
                num = day[i];
                cnt = 1;
            } else {
                cnt++;
            }
        }
        list.add(cnt);// 위의 for문에서 마지막 카운트 수가 추가 되지 않으므로 따로 추가해줌

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        Functional_Development functionalDevelopment = new Functional_Development();
        int[] p = {93, 30, 55}, s = {1, 30, 5};
        System.out.println(Arrays.toString(functionalDevelopment.solution(p, s)));
    }
}
