package Lv_1.day46;

public class Making_Prime_Numbers {
    public int solution(int[] nums) {
        int answer = 0;

        for(int i=0; i<nums.length-2; i++){
            for(int j=i+1; j<nums.length-1; j++){
                for(int k=j+1; k<nums.length; k++){
                    if((nums[i] + nums[j] + nums[k]) % 2 != 0){
                        if(primeNumbers(nums[i] + nums[j] + nums[k]))
                            answer++;
                    }
                }
            }
        }

        return answer;
    }

    public boolean primeNumbers(int n) {
        int cnt = 0;
        for(int i=1; i<=n; i++){
            if(n % i == 0){
                cnt++;
            }
            if(cnt > 2)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Making_Prime_Numbers makingPrimeNumbers = new Making_Prime_Numbers();
        int[] a= {1, 2, 7, 6, 4};
        System.out.println(makingPrimeNumbers.solution(a));
    }
}
