import java.util.*;
class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        myString = myString.toLowerCase(); // 모두 소문자로 변환
        pat = pat.toLowerCase(); // 모두 소문자로 변환
        if( myString.contains(pat) ){
            answer = 1;
        }
        
        return answer;
    }
}