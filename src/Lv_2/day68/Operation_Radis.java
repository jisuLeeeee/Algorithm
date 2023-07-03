package Lv_2.day68;

public class Operation_Radis {
    int answer = 0;
    boolean[] t;
    public int solution(int k, int[][] dungeons) {
        t = new boolean[dungeons.length];

        dfs(0, k, dungeons);

        return answer;
    }
    public void dfs(int dep, int k, int[][] d){
        for(int i = 0; i < d.length; i++){
            if(t[i] || k < d[i][0]){
                continue;
            }
            t[i] = true;
            dfs(dep + 1, k - d[i][1], d);
            t[i] = false;
        }
        answer = Math.max(answer, dep);
    }

    public static void main(String[] args) {
        Operation_Radis operationRadis = new Operation_Radis();
        int k = 80;
        int[][] d = {{80, 20}, {50, 40}, {30, 10}};
        System.out.println(operationRadis.solution(k, d));
    }
}
