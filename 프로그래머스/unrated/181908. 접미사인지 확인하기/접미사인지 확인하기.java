class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        //for반복문으로 접미사 계속 찾기
        for(int i=0; i<my_string.length(); i++){
            //접미사를 계속 찾음
            String str = my_string.substring(i,my_string.length()); 
            //자른 것에 접미사가 포함되어 있다면 1 리턴
            if(str.equals(is_suffix)){
                answer = 1;
            }
        }
        return answer;
    }
}