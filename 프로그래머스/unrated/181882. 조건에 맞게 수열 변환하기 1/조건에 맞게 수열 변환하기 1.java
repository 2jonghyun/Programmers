class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        if(arr.length>=1 && arr.length<=1000000){
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]>=1 && arr[i]<=100){

                if((arr[i]>=50 && arr[i] % 2==0)){
                    arr[i] = arr[i] /2;
                    answer = arr;
                }
                else if((arr[i]<=50 && arr[i] % 2!=0)){
                    arr[i] = arr[i] * 2;
                    answer = arr;
                }
            }
        }
        return answer;
    }
}