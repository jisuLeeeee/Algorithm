package Lv_1.day33;

public class Addtion_Neg_Pos {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for(int i=0; i<signs.length; i++){
            if(signs[i])
                answer += absolutes[i];
            else
                answer -= absolutes[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        Addtion_Neg_Pos addtionNegPos = new Addtion_Neg_Pos();
        int[] absolutes = {4, 7, 12};
        boolean[] signs = {true, false, true};
        System.out.println(addtionNegPos.solution(absolutes, signs));
    }
}
