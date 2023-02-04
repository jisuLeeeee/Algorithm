package day17;

public class Lv_0_Calculating_String {
    public int solution(String my_string) {
        String[] str_arr = my_string.split(" ");
        int answer = Integer.parseInt(str_arr[0]);

        for(int i=1; i<str_arr.length; i++){
            if(str_arr[i].equals("+"))
                answer += Integer.parseInt(str_arr[i+1]);
            else if(str_arr[i].equals("-"))
                answer -= Integer.parseInt(str_arr[i+1]);
            else
                continue;
        }

        return answer;
    }

    public static void main(String[] args) {
        Lv_0_Calculating_String calculatingString = new Lv_0_Calculating_String();
        String a = "3 + 4";
        System.out.println(calculatingString.solution(a));
    }
}
