package day10;

public class Lv_0_Rotating_Array {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        int last_num = 0;

        if(direction.equals("right")){
            last_num = numbers[numbers.length - 1];
            for(int i=numbers.length - 1; i>0; i--){
                answer[i] = numbers[i - 1];
            }
            answer[0] = last_num;
        }
        else if(direction.equals("left")){
            last_num = numbers[0];

            for(int i=0; i<numbers.length - 1; i++){
                answer[i] = numbers[i+1];
            }
            answer[numbers.length - 1] = last_num;
        }
        return answer;
    }

    public static void main(String[] args) {
        Lv_0_Rotating_Array rotatingArray = new Lv_0_Rotating_Array();
        int[] a = {4, 455, 6, 4, -1, 45, 6};
        String b = "left";
        for(int i:rotatingArray.solution(a, b))
            System.out.println(i);
    }
}
