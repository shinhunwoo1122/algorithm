package com.algorithm.algorithm;


import lombok.extern.slf4j.Slf4j;

/* 구간합 알고리즘
*
* 구간합이란 합배열을 이용하여 해당 배열의 원하는 구간의 값을 뽑는 알고리즘이다.
* 구간합을 구하기 위해서는 합배열을 필요로하고 해당 값을 통해 구간합 알고리즘을 통해 뽑아내어
* 지정해놓으면 해당값을 뽑기 위해 시간복잡도 o(N)을 통해 구하는것을 미리 지정해놓은 구간합배열을통해 o(1)으로 한번에 접근하여 값을 뽑을 수 있다.

*  합배열을 구하기위한 알고리즘
* S[i] = S[i - 1] + A[i]
*
* 구간합을 구하기위한 알고리즘
* S[j] - S[i - 1]
*
* */
@Slf4j
public class PrefixSum {

    public static void main(String[] args) {

        //최초 배열 값 지정
        int[] arr = {10, 20, 3, 7, 12, 15};
        //합배열을 위한 배열 생성
        int[] sumArr = new int[arr.length];

        //최초값은 똑같이 지정해준다.
        sumArr[0] = arr[0];






        //합배열 공식을 사용하여 1번 인덱스부터 해당 인덱스 -1의 값과 Arr에 담겨있는 값과 합쳐줘서 합배열에 저장한다.
        for(int i = 1; i < arr.length; i++){
            sumArr[i] = sumArr[i - 1] + arr[i];
            log.info("구간합 값 {} " , sumArr[i]);
        }




        //67 30
        int i = 2;
        int j = 5;

        //2번인덱스 부터 5번 인덱스 까지의 구간 합 구하기
        log.info("구간 합 값 : {} ", (sumArr[j] - sumArr[i - 1]));
    }
}
