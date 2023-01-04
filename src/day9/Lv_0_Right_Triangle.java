package day9;

import java.util.Scanner;

public class Lv_0_Right_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int row=1; row<=n; row++){
            for(int col=1; col<=row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
