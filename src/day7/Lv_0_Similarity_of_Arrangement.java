package day7;

public class Lv_0_Similarity_of_Arrangement {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;

        for(int i=0; i<s1.length; i++){
            for(int j=0; j<s2.length; j++){
                if(s1[i].equals(s2[j]))
                    answer++;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Lv_0_Similarity_of_Arrangement similarityOfArrangement = new Lv_0_Similarity_of_Arrangement();
        String[] a = {"a", "b", "c"}, b = {"bbb", "aaa", "b", "zzz", "c"};
        System.out.println(similarityOfArrangement.solution(a, b));
    }
}
