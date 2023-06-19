package Lv_2.day61;

import java.util.ArrayList;
import java.util.Collections;
public class News_Clustering {
    public int solution(String str1, String str2) {
        double answer;
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        ArrayList<String> arr1 = new ArrayList<>();
        ArrayList<String> arr2 = new ArrayList<>();


        for(int i=0; i<str1.length()-1; i++){
            String s1 = str1.substring(i, i+2);
            if(!(s1.replaceAll("[^a-z]", "").length() <= 1)){
                arr1.add(str1.substring(i,i+2));
            }
        }
        for(int i=0; i<str2.length()-1; i++){
            String s2 = str2.substring(i, i+2);
            if(!(s2.replaceAll("[^a-z]|' '", "").length() <= 1)){
                arr2.add(str2.substring(i,i+2));
            }
        }

        Collections.sort(arr1);
        Collections.sort(arr2);

        ArrayList<String> intersection = new ArrayList<>();
        ArrayList<String> union = new ArrayList<>();

        for(String s1 : arr1){
            if(arr2.remove(s1)){
                intersection.add(s1);
            }
            union.add(s1);
        }
        union.addAll(arr2);

        if(union.size() == 0){
            answer = 1;
        }
        else{
            answer = ((double)intersection.size() / (double)union.size());
        }
        return (int)(answer * 65536);
    }

    public static void main(String[] args) {
        News_Clustering newsClustering = new News_Clustering();
        String a = "Frence", b = "Franch";
        System.out.println(newsClustering.solution(a, b));
    }
}
