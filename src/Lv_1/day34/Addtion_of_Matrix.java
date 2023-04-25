package Lv_1.day34;

public class Addtion_of_Matrix {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];

        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr1[i].length; j++){
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Addtion_of_Matrix addtionOfMatrix = new Addtion_of_Matrix();
        int[][] a = {{1, 2}, {2, 3}}, b = {{3, 4}, {5, 6}};
        int[][] result = addtionOfMatrix.solution(a, b);
        for(int i = 0; i<a.length; i++) {
            for (int j = 0; j<a[i].length - 1; j++) {
                System.out.print("[[" + result[i][j] + ", " + result[i][j+1] + "]]");
            }
            System.out.print(", ");
        }
    }
}
