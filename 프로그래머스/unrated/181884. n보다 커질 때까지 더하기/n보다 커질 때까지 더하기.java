//배열 numbers의 요소를 앞에서부터 하나씩 더해가면서 합이 n을 초과하는 시점에서 중단하고 현재까지 더한 값을 반환합니다.
class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        for(int i=0; i<numbers.length; i++){
            answer += numbers[i];
            if(answer > n){
                break;
            }
        }
        return answer;
    }
}