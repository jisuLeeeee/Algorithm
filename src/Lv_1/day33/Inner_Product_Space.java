package Lv_1.day33;

public class Inner_Product_Space {
    public int solution(int[] a, int[] b) {
        int answer = 0;

        for(int i=0; i<a.length; i++){
            answer += (a[i] * b[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        Inner_Product_Space innerProductSpace = new Inner_Product_Space();
        int[] a = {1,2,3,4}, b = {-3,-1,0,2};
        System.out.println(innerProductSpace.solution(a, b));
    }
}
