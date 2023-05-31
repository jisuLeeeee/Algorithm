package Lv_1.day51;

public class Press_Keypad {
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        int left = 10, right = 12;

        for(int i : numbers){
            if(i == 1 || i == 4 || i == 7){
                answer.append("L");
                left = i;
            }
            else if(i == 3 || i == 6 || i ==9){
                answer.append("R");
                right = i;
            }
            else{
                if(i == 0){
                    i = 11;
                }
                int leftDistance = (Math.abs(left - i) / 3) + (Math.abs(left - i) % 3);
                int rightDistance = (Math.abs(right - i) / 3) + (Math.abs(right - i) % 3);

                if(leftDistance < rightDistance){
                    answer.append("L");
                    left = i;
                }
                else if(leftDistance == rightDistance){
                    if(hand.equals("left")){
                        answer.append("L");
                        left = i;
                    }else{
                        answer.append("R");
                        right = i;
                    }
                }
                else{
                    answer.append("R");
                    right = i;
                }

            }

        }
        return answer.toString();
    }

    public static void main(String[] args) {
        Press_Keypad pressKeypad = new Press_Keypad();
        int[] a = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2}; // "LRLLRRLLLRR"
        String b = "right";
        System.out.println(pressKeypad.solution(a, b));
    }
}
