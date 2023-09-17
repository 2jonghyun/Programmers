class Solution {
    public int solution(String num_str) {
        int answer = 0;
        String[] nStr = num_str.split("");
        for(int i=0; i<nStr.length; i++){
            answer += Integer.parseInt(nStr[i]);
        }
        return answer;
    }
}