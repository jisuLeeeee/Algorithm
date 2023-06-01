package Lv_1.day51;

public class Rough_Keyboard {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        int ansIdx = 0, tIdx = 101;
        boolean zeroCnt = false;

        for(String i : targets){
            for(String s : i.split("")){
                for(String k : keymap){
                    if(k.contains(s)){
                        zeroCnt = true;
                        if(tIdx > k.indexOf(s)){
                            tIdx = k.indexOf(s);
                        }
                    }
                }
                if(zeroCnt){
                    answer[ansIdx] += tIdx + 1;
                }
                else{
                    answer[ansIdx] = -1;
                    break;
                }
                tIdx = 101;
                zeroCnt = false;
            }
            ansIdx++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Rough_Keyboard roughKeyboard = new Rough_Keyboard();
        String[] key = {"ABACD", "BCEFD"}, target = {"ABCD","AABB"};
        for(int i : roughKeyboard.solution(key, target))
            System.out.println(i);
    }
}
