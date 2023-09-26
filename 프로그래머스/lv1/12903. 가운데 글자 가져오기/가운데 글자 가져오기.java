class Solution {
    public String solution(String s) {
        String answer = "";
        int length = s.length();
        int middleLength = length / 2;
        for(int i=0; i<length; i++){
            if(i % 2 == 0){
                answer = s.substring(middleLength, middleLength+1);
            }
            else{ answer = s.substring(middleLength-1, middleLength+1);}
        }
        
        return answer;
    }
}