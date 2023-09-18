import java.util.*;
class Solution {
    public List<Integer> solution(int[] num_list) {
        List<Integer> answer = new ArrayList<>();
        int leng = num_list.length;
        for(int i=0; i<num_list.length; i++){
            answer.add(num_list[i]);
        }
        //마지막 원소가 그전 원소보다 크면 마지막 원소에서 그전 원소를 뺀 값
        if(num_list[leng-1]>num_list[leng-2]){
            answer.add(num_list[leng-1]-num_list[leng-2]);
        }
        //마지막 원소가 그전 원소보다 크지 않다면 마지막 원소를 두 배한 값을 추가
        else{
            answer.add(num_list[leng-1]*2);
        }
        return answer;
    }
}