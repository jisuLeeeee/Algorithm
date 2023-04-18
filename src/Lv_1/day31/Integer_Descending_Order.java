package Lv_1.day31;

public class Integer_Descending_Order {
    public long solution(long n) {
        long answer = 0;
        String n_str = String.valueOf(n);
        int[] arr = new int[n_str.length()];

        for(int i=0; i<arr.length; i++){
            arr[i] = n_str.charAt(i) - '0';
        }

        for(int i=0; i<arr.length - 1; i++){
            for(int j=0; j<arr.length - 1; j++){
                if(arr[j] < arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }

        n_str = "";

        for(int i=0; i<arr.length; i++){
            n_str += arr[i];
        }

        answer = Long.valueOf(n_str);

        return answer;
    }

    public static void main(String[] args) {
        Integer_Descending_Order integerDescendingOrder = new Integer_Descending_Order();
        long a = 1183924;
        System.out.println(integerDescendingOrder.solution(a));
    }
}
