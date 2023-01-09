package day11;

public class Lv_0_Age_of_Extrasolar_Planets {
    public String solution(int age) {
        String answer = "";
        String[] age_str = Integer.toString(age).split("");

        for(int i=0; i<age_str.length; i++){
            answer += (char)(Integer.parseInt(age_str[i]) + 97);
        }

        return answer;
    }
    public static void main(String[] args) {
        Lv_0_Age_of_Extrasolar_Planets ageOfExtrasolarPlanets = new Lv_0_Age_of_Extrasolar_Planets();
        int a = 23;
        System.out.println(ageOfExtrasolarPlanets.solution(a));
    }
}

