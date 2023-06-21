package Lv_2.day63;

public class Target_Number {
    int answer = 0;
    public int solution(int[] numbers, int target) {

        dfs(numbers, 0, target, 0);

        return answer;
    }
    public void dfs(int[] numbers, int depth, int target, int sum){
        if(depth == numbers.length){
            if(target == sum)
                answer++;
        }else {
            dfs(numbers, depth + 1, target, sum + numbers[depth]);
            dfs(numbers, depth + 1, target, sum - numbers[depth]);
        }
    }

    public static void main(String[] args) {
        Target_Number targetNumber = new Target_Number();
        int[] n = {4, 1, 2, 1};
        int t = 4;
        System.out.println(targetNumber.solution(n, t));
    }
}
