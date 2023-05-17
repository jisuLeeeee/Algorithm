package Lv_2.day44;

public class Carpet {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        for(int i=2; i<=brown; i++){
            for(int j=1; j<=i; j++){
                if((brown + yellow) == (i * j)){
                    boolean res = calc(i, j, yellow);
                    if(res){
                        answer[0] = i;
                        answer[1] = j;
                        return answer;
                    }
                }
            }
        }
        return answer;
    }
    public boolean calc(int a, int c, int yellow){
        if((a*c) - (2*a) - (2*c) + 4 == yellow) // (x-2)(y-2)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Carpet carpet = new Carpet();
        int brown = 10, yellow = 2;
        for(int i : carpet.solution(brown, yellow))
            System.out.print(i);
    }
}
