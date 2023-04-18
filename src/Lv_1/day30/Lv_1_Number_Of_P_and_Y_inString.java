package Lv_1.day30;

public class Lv_1_Number_Of_P_and_Y_inString {
    boolean solution(String s) {
        int pCnt = 0, yCnt = 0;

        String[] arr = s.split("[^pyPY]");

        for(int i=0; i<arr.length; i++){
            if(arr[i] == null)
                continue;
            for(int j=0; j<arr[i].length(); j++){
                if(arr[i].charAt(j) == ('p') || arr[i].charAt(j) == ('P'))
                    pCnt++;
                else if(arr[i].charAt(j) == ('y') || arr[i].charAt(j) == ('Y'))
                    yCnt++;
            }
        }


        return pCnt == yCnt ? true : false;
    }

    public static void main(String[] args) {
        Lv_1_Number_Of_P_and_Y_inString numberOfPAndYInString = new Lv_1_Number_Of_P_and_Y_inString();
        String a = "pPoooyY";
        System.out.println(numberOfPAndYInString.solution(a));
    }
}
