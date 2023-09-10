class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        //자를 숫자 변수로 만들기
        int left = overwrite_string.length()+s;
        answer = my_string.substring(0,s) + overwrite_string + my_string.substring(left);
        return answer;
    }
}