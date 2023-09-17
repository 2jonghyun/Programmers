class Solution {
    public int solution(int n, String control) {
        int answer = n;
        String[] ctr = control.split("");
        
        for(int i=0; i<ctr.length; i++){
            if(ctr[i].equals("w")){
                answer += 1;
            }
            else if(ctr[i].equals("s")){
                answer -= 1;
            }
            else if(ctr[i].equals("d")){
                answer += 10;
            }
            else if(ctr[i].equals("a")){
                answer -= 10;
            }
        }
        return answer;
    }
}