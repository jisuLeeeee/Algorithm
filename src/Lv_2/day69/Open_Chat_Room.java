package Lv_2.day69;

import java.util.HashMap;

public class Open_Chat_Room {
    public String[] solution(String[] record) {

        HashMap<String, String> map = new HashMap<>();
        int cnt = 0;

        for(String r : record){
            String[] command = r.split(" ");

            if(command[0].equals("Enter")){
                map.put(command[1], command[2]);
                cnt++;
            }
            else if(command[0].equals("Leave")){
                cnt++;
            }
            else if(command[0].equals("Change")){
                map.put(command[1], command[2]);
            }
        }

        String[] answer = new String[cnt];
        int idx = 0;

        for(String str : record){
            String[] arr = str.split(" ");

            if(arr[0].equals("Enter")){
                answer[idx] = map.get(arr[1]) + "님이 들어왔습니다.";
                idx++;
            }
            else if(arr[0].equals("Leave")){
                answer[idx] = map.get(arr[1]) + "님이 나갔습니다.";
                idx++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Open_Chat_Room openChatRoom = new Open_Chat_Room();
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234",
                "Enter uid1234 Prodo", "Change uid4567 Ryan"};
        for(String s : openChatRoom.solution(record))
            System.out.println(s);
    }
}
