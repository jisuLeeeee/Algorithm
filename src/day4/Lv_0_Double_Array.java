package day4;

public class Lv_0_Double_Array {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        int idx = 0;

        for(int i : numbers){
            answer[idx] = i * 2;
            idx++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Lv_0_Double_Array doubleArray = new Lv_0_Double_Array();
        int[] a = {1,2,3,4,5,6};
        int[] b = doubleArray.solution(a);
        for(int i : b){
            System.out.println(i);
        }
    }
}
