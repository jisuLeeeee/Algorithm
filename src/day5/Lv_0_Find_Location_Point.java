package day5;

public class Lv_0_Find_Location_Point {
    public int solution(int[] dot) {
        int answer = 0;

        if(dot[0] > 0 && dot[1] > 0){
            answer = 1;
        }
        else if(dot[0] < 0 && dot[1] > 0){
            answer = 2;
        }
        else if(dot[0] < 0 && dot[1] < 0){
            answer = 3;
        }
        else {
            answer = 4;
        }
        return answer;
    }

    public static void main(String[] args) {
        Lv_0_Find_Location_Point findLocationPoint = new Lv_0_Find_Location_Point();
        int[] a = {5, 9};
        System.out.println(findLocationPoint.solution(a));
    }
}
