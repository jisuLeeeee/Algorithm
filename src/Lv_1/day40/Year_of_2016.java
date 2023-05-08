package Lv_1.day40;

public class Year_of_2016 {
    public String solution(int a, int b) {

        String[] day = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int[] date = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int c = 0;
        for(int i=0; i<a-1; i++){
            c += date[i];
        }

        c += b - 1;

        return day[c % 7];
    }

    public static void main(String[] args) {
        Year_of_2016 yearOf2016 = new Year_of_2016();
        int a = 5, b = 24;
        System.out.println(yearOf2016.solution(a, b));
    }
}
