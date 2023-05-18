package Lv_2.day44;

import java.util.Arrays;

public class LifeBoat {
    public int solution(int[] people, int limit) {
        int answer = 0;

        Arrays.sort(people);
        int min=0;

        for(int i=people.length-1; i>=min; i--){
            if(people[i] + people[min] <= limit){
                min++;
            } answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        LifeBoat lifeBoat = new LifeBoat();
        int[] a = {70, 50, 80, 50};
        int b = 100;
        System.out.println(lifeBoat.solution(a, b));
    }
}
