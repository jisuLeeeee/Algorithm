package day16;

public class Lv_0_Addition_of_Hidden_Characters_2 {
    public int solution(String my_string) {
        int answer = 0;
        String[] str_arr = my_string.replaceAll("[^0-9]", " ").split(" ");

        for(String i:str_arr){
            if(i.equals("")) {
                continue;
            }
            else{
                answer += Integer.parseInt(i.trim());
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Lv_0_Addition_of_Hidden_Characters_2 additionOfHiddenCharacters2 = new Lv_0_Addition_of_Hidden_Characters_2();
        String a = "aAb1B2cC34oOp";
        System.out.println(additionOfHiddenCharacters2.solution(a));
    }
}
