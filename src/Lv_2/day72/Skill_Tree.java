package Lv_2.day72;

public class Skill_Tree {
    public int solution(String skill, String[] skill_trees) {
        int answer = skill_trees.length;

        for(String str: skill_trees){
            int i = 0;
            for(String s : str.split("")){
                if(skill.contains(s) && i != skill.length()){
                    if(s.equals(skill.substring(i, i+1))){
                        i++;
                    }
                    else{
                        answer--;
                        break;
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Skill_Tree skillTree = new Skill_Tree();
        String skill = "CBD";
        String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
        System.out.println(skillTree.solution(skill, skill_trees));
    }
}
