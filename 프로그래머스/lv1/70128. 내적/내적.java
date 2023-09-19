class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        for(int i=0; i<a.length; i++){
            int sum = 0;
            answer += a[i] * b[i];
        }
        return answer;
    }
}