package Lv_1.day47;

public class Dart_Game {
    public int solution(String dartResult) {
        int idx = -1;
        int num = 0;
        int[] result = new int[3];
        boolean ten = false;

        for(int i=0; i<dartResult.length(); i++){
            if(Character.isDigit(dartResult.charAt(i))){
                if(ten){
                    num = 10;
                    ten = false;
                }
                else {
                    num = Integer.parseInt(dartResult.substring(i,i+1));
                }
                if(dartResult.charAt(i+1) == 'S'){
                    idx++;
                    result[idx] += num;
                }
                else if(dartResult.charAt(i+1) == 'D'){
                    idx++;
                    result[idx] += Math.pow(num, 2);

                }
                else if(dartResult.charAt(i+1) == 'T'){
                    idx++;
                    result[idx] += Math.pow(num, 3);
                }
                else if(dartResult.charAt(i+1) == '0'){// 10일때
                    ten = true;
                }

            }
            else if(dartResult.charAt(i) == '*'){
                if(idx > 0) {
                    result[idx] *= 2;
                    result[idx-1] *= 2;
                }
                else
                    result[idx] *= 2;
            }
            else if(dartResult.charAt(i) == '#'){
                result[idx] *= -1;
            }
        }

        return result[0] + result[1] + result[2];
    }

    public static void main(String[] args) {
        Dart_Game dartGame = new Dart_Game();
        String a = "10D4S10D";
        System.out.println(dartGame.solution(a));
    }
}
