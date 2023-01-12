package day14;

public class Lv_0_Make_B_with_A {
    public int solution(String before, String after) {
        int answer = 0;
        int sum1 = 0, sum2 = 0;

        for(int i=0; i<before.length(); i++){
            sum1 += before.charAt(i);
            sum2 += after.charAt(i);
        }
        if(sum1 == sum2)
            answer = 1;

        return answer;
    }

    public static void main(String[] args) {
        Lv_0_Make_B_with_A makeBWithA = new Lv_0_Make_B_with_A();
        String a = "olleh", b = "hello";
        System.out.println(makeBWithA.solution(a, b));
    }
}
