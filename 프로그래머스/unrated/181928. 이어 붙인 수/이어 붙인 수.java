import java.util.*;
class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String j = "";
        String h = "";
        
        for(int i=0; i<num_list.length; i++){
            if(num_list[i] % 2 == 0){
                j += String.valueOf(num_list[i]);
            }
            else{
                h += String.valueOf(num_list[i]);
            }
        }
        answer = Integer.parseInt(j) + Integer.parseInt(h);
        return answer;
    }
}