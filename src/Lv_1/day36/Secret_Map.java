package Lv_1.day36;

import java.util.Arrays;

public class Secret_Map {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] binary1 = new String[n];
        String[] binary2 = new String[n];
        int c = 0;

        binaryChange(arr1, binary1, n);
        binaryChange(arr2, binary2, n);

        binary1 = arrReverse(binary1, n);
        binary2 = arrReverse(binary2, n);


        for(int i = 0; i < binary1.length; i++){
            answer[i] = "";
            while(c < binary1[i].length()){
                if(binary1[i].charAt(c) == '1' || binary2[i].charAt(c) == '1'){
                    answer[i] += "#";
                    c++;
                }
                else{
                    answer[i] += " ";
                    c++;
                }
            }
            c = 0;
        }

        return answer;
    }

    public String[] binaryChange(int[] arr, String[] binary, int n){
        for(int i=0; i<arr.length; i++){
            binary[i] = "";
            while(arr[i] != 0){
                if(arr[i] % 2 == 1){
                    binary[i] += "1";
                    arr[i] /= 2;
                }
                else{
                    binary[i] += "0";
                    arr[i] /= 2;
                }
            }
            if(binary[i].length() < n)
                binary[i] = zeroPlus(binary[i], n);
        }
        return binary;
    }
    public String zeroPlus(String binary, int n){
        while(binary.length() < n){
            binary += "0";
        }
        return binary;
    }

    public String[] arrReverse(String[] arr, int l){
        String[] arrSum = new String[l];
        for(int i = 0; i < arr.length; i++){
            arrSum[i] = strReverse(arr[i]);
        }
        return arrSum;
    }

    public String strReverse(String str){
        String strSum = "";
        for(int i = str.length() - 1; i >= 0; i--){
            strSum += str.substring(i, i+1);
        }
        return strSum;
    }

    public static void main(String[] args) {
        Secret_Map secretMap = new Secret_Map();
        int[] a = {9, 20, 28, 18, 11}, b = {30, 1, 21, 17, 28};
        int c = 5;
        System.out.println(Arrays.toString(secretMap.solution(c, a, b)));
    }
}
