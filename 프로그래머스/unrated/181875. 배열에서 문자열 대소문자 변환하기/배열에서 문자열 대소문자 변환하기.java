import java.util.*;
class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        
        for(int i=0; i<strArr.length; i++){
            answer[i] = strArr[i];
            
            if(i % 2 != 0){
                answer[i] = answer[i].toUpperCase();
            }
            else{
                answer[i] = answer[i].toLowerCase();
            }
        }
        return answer;
    }
}