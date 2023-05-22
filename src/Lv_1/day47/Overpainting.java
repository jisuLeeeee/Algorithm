package Lv_1.day47;

public class Overpainting {
    public int solution(int n, int m, int[] section) {
        int answer = 1;
        int area = section[0];

        for(int i=1; i<section.length; i++){
            if(area + m - 1 < section[i]){
                answer++;
                area = section[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Overpainting overpainting = new Overpainting();
        int n = 8, m = 4;
        int[] section = {2, 3, 6};
        System.out.println(overpainting.solution(n, m, section));
    }
}
