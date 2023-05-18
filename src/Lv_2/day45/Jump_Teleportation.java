package Lv_2.day45;

public class Jump_Teleportation {
    public int solution(int n) {
        int ans = 0;

        while(n != 0){
            if(n % 2 == 0)
                n /= 2;
            else {
                n--;
                ans++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Jump_Teleportation jumpTeleportation = new Jump_Teleportation();
        int a = 5;
        System.out.println(jumpTeleportation.solution(a));
    }
}
