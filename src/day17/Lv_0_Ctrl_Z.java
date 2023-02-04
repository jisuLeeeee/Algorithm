package day17;

public class Lv_0_Ctrl_Z {
    public int solution(String s) {
        int answer = 0;
        String[] s_arr = s.split(" ");

        for(int i=0; i<s_arr.length; i++){
            if(s_arr[i].equals("Z"))
                answer -= Integer.parseInt(s_arr[i-1]);
            else
                answer += Integer.parseInt(s_arr[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        Lv_0_Ctrl_Z ctrlZ = new Lv_0_Ctrl_Z();
        String a = "1 2 Z 3";
        System.out.println(ctrlZ.solution(a));
    }
}
