package Lv_1.day47;

public class Bunch_of_Cards {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int idx1 = 0, idx2 = 0;
        boolean finish1 = false, finish2 = false;

        for(int i=0; i<goal.length;i++){
            if(!finish1 && goal[i].equals(cards1[idx1])){
                idx1++;
                if(idx1 == cards1.length)
                    finish1 = true;
            }
            else if(!finish2 && goal[i].equals(cards2[idx2])){
                idx2++;
                if(idx2 == cards2.length)
                    finish2 = true;
            }
            else {
                return "No";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Bunch_of_Cards bunchOfCards = new Bunch_of_Cards();
        String[] cards1 = {"i", "water", "drink"}, cards2 = {"want", "to"}, goal = {"i", "want", "to", "drink", "water"};
        System.out.println(bunchOfCards.solution(cards1, cards2, goal));
    }
}
