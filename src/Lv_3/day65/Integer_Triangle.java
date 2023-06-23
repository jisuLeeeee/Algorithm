package Lv_3.day65;

public class Integer_Triangle {
    public int solution(int[][] triangle) {
        int answer = 0;

        for(int i=1; i<triangle.length; i++){
            for(int j=0; j<triangle[i].length; j++){
                if(j == 0){
                    triangle[i][j] += triangle[i-1][j];
                }
                else if(j == i){
                    triangle[i][j] += triangle[i-1][j-1];
                }
                else {
                    triangle[i][j] += Math.max(triangle[i-1][j-1], triangle[i-1][j]);
                }
                answer = Math.max(answer, triangle[i][j]);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Integer_Triangle integerTriangle = new Integer_Triangle();
        int[][] t = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
        System.out.println(integerTriangle.solution(t));
    }
}
