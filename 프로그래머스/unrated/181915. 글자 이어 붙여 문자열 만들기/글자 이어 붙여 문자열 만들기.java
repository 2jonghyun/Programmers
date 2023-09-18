class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        for(int idx : index_list){
            char f = my_string.charAt(idx);
            answer += f;
        }
        return answer;
    }
}