package Lv_1.day48;

public class Knight_Weapon {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int cnt = 0;

        for(int i=1; i<number+1; i++){
            cnt = 0;
            for(int j=1; j*j<=i; j++){
                if(j*j == i){
                    cnt++;
                }
                else if(i % j == 0){
                    cnt+=2;
                }
            }
            answer += cnt > limit ? power : cnt;
        }
        return answer;
    }

    public static void main(String[] args) {
        Knight_Weapon knightWeapon = new Knight_Weapon();
        int a = 5, b = 3, c = 2;
        System.out.println(knightWeapon.solution(a, b, c));
    }
}
