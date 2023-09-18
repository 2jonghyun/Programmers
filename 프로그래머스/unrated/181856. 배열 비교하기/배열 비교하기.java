class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        //sum 변수 2개로 배열 합 구해준다
        int sum1 = 0;
        int sum2 = 0;
        for(int a : arr1){
            sum1 += a;
        }
        for(int b : arr2){
            sum2 += b;
        }
        // return 할 조건들을 구해준다
        //1 answer 가 1인경우 : 1.arr1 배열이 크거나 2.두 배열의 길이가 같은데 sum1> sum2 조건만족
        if(arr1.length > arr2.length || (arr1.length == arr2.length && sum1>sum2)){ answer = 1;}
        //2 answer -1 인경우 : 1.arr2 이 크거나 2.두 배열의 길이가 같은데 sum1 < sum2 조건만족
        else if(arr1.length < arr2.length || (arr1.length == arr2.length && sum1 < sum2)){answer=-1;}
        // else 나머지 answer = 0;
        else{answer = 0;}
        return answer;
    }
}