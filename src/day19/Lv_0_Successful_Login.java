package day19;

public class Lv_0_Successful_Login {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";

        for(int i=0; i<db.length; i++){
            if(db[i][0].equals(id_pw[0]) && db[i][1].equals(id_pw[1])){
                answer = "login";
                break;
            }
            else if(db[i][0].equals(id_pw[0]) && !db[i][1].equals(id_pw[1])){
                answer = "wrong pw";
                break;
            }
            else
                answer = "fail";
        }
        return answer;
    }

    public static void main(String[] args) {
        Lv_0_Successful_Login successfulLogin = new Lv_0_Successful_Login();
        String[] a = {"programmer01", "15789"};
        String[][] b = {{"programmer02", "111111"}, {"programmer00", "134"}, {"programmer01", "1145"}};
        System.out.println(successfulLogin.solution(a, b));
    }
}
