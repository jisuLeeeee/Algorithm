package Lv_1.day83;

public class Walk_in_Park {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        int x=0, y=0, park_weight = park[0].length(), park_height = park.length;

        for(int i=0; i<park.length; i++){
            if(park[i].contains("S")){
                y = i;
                x = park[i].indexOf("S");
                break;
            }
        }

        int currX;
        int currY;

        for(int i=0; i<routes.length; i++){
            String direction = routes[i].split(" ")[0];
            int cnt = Integer.parseInt(routes[i].split(" ")[1]);
            boolean flag = true;
            currX = x;
            currY = y;

            switch(direction){ // E W S N
                case "E":
                    for(int j=0; j<cnt; j++){
                        currX++;
                        if(currX == park_weight){ // 공원의 범위를 벗어날 때
                            flag = false;
                            break;
                        }
                        else if(park[currY].charAt(currX) == 'X'){ // 장애물이 없을 때
                            flag = false;
                            break;
                        }

                    }
                    if(flag)
                        x = currX;
                    break;
                case "W":
                    for(int j=0; j<cnt; j++){
                        currX--;
                        if(currX == -1){ // 공원의 범위를 벗어날 때
                            flag = false;
                            break;
                        }
                        else if(park[currY].charAt(currX) == 'X'){ // 장애물이 없을 때
                            flag = false;
                            break;
                        }
                    }
                    if(flag)
                        x = currX;
                    break;
                case "S":
                    for(int j=0; j<cnt; j++){
                        currY++;
                        if(currY == park_height){ // 공원의 범위를 벗어날 때
                            flag = false;
                            break;
                        }
                        else if(park[currY].charAt(currX) == 'X'){ // 장애물이 없을 때
                            flag = false;
                            break;
                        }
                    }
                    if(flag)
                        y = currY;
                    break;
                case "N":
                    for(int j=0; j<cnt; j++){
                        currY--;
                        if(currY == -1){ // 공원의 범위를 벗어날 때
                            flag = false;
                            break;
                        }
                        else if(park[currY].charAt(currX) == 'X'){ // 장애물이 없을 때
                            flag = false;
                            break;
                        }
                    }
                    if(flag)
                        y = currY;
                    break;
            }
        }

        answer[0] = y;
        answer[1] = x;
        return answer;
    }

    public static void main(String[] args) {
        Walk_in_Park walkInPark = new Walk_in_Park();
        String[] park = {"OSO", "OOO", "OXO","OOO"},
                routes = {"E 2","S 3","W 1"};
        for(int i : walkInPark.solution(park, routes))
            System.out.println(i);
    }
}
