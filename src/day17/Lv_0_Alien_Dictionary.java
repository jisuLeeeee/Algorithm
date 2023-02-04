package day17;

public class Lv_0_Alien_Dictionary {
    public int solution(String[] spell, String[] dic) {
        //spell에 담긴 알파벳을 한번씩만 모두 사용한 단어가 dic에 존재한다면 1, 존재하지 않는다면 2를 return
        int answer = 0;
        int cnt = 0;


        for(int i=0; i<dic.length; i++){
            cnt=0;
            for(int j=0; j<spell.length; j++){
                if(dic[i].contains(spell[j]))
                    cnt++;
            }
            if(cnt == spell.length){
                answer = 1;
                break;
            }
            else
                answer = 2;
        }

        return answer;
    }

    public static void main(String[] args) {
        Lv_0_Alien_Dictionary alienDictionary = new Lv_0_Alien_Dictionary();
        String[] a = {"p", "o", "s"};
        String[] b = {"sod", "eocd", "qixm", "adio", "soo"};
        System.out.println(alienDictionary.solution(a, b));
    }
}
