package Lv_1.day39;

public class Food_Fight_Contest {
    public String solution(int[] food) {
        String answer = "";

        for(int i=1; i<food.length; i++){
            for(int j=0; j<food[i]/2; j++){
                answer += i;
            }
        }
        answer += 0;

        for(int i=answer.length()-2; i>=0; i--){
            answer += answer.charAt(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Food_Fight_Contest foodFightContest = new Food_Fight_Contest();
        int[] a = {1, 3, 4, 6};
        System.out.println(foodFightContest.solution(a));
    }
}
