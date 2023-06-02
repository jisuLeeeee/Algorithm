package Lv_1.day52;

import java.util.ArrayList;

public class Making_Hamburgers {
    public int solution(int[] ingredient) {
        int answer = 0;
        ArrayList<Integer> hamburger = new ArrayList<>();

        for(int i : ingredient){
            hamburger.add(i);
            if(hamburger.size() >= 4){
                if(hamburger.get(hamburger.size()-1) == 1 &&
                        hamburger.get(hamburger.size()-2) == 3 &&
                        hamburger.get(hamburger.size()-3) == 2 &&
                        hamburger.get(hamburger.size()-4) == 1){
                    answer++;
                    hamburger.subList(hamburger.size()-4, hamburger.size()).clear();
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Making_Hamburgers makingHamburgers = new Making_Hamburgers();
        int[] i = {1, 1, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1};
        System.out.println(makingHamburgers.solution(i));
    }
}
