package Lv_2.day57;

import java.util.LinkedList;

public class Cache {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;

        if(cacheSize == 0)
            return cities.length * 5;
        LinkedList<String> linkedlist = new LinkedList<>();

        for (String city : cities) {
            String s = city.toUpperCase();
            if (linkedlist.remove(s)) {
                linkedlist.add(s);
                answer += 1;
            } else if (linkedlist.size() == cacheSize) {
                linkedlist.remove(0);
                linkedlist.add(s);
                answer += 5;
            } else {
                linkedlist.add(s);
                answer += 5;
            }
        }
            return answer;
    }
    public static void main(String[] args) {
        Cache cache = new Cache();
        int size = 3;
        String[] a = {"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"};
        System.out.println(cache.solution(size, a));
    }
}
