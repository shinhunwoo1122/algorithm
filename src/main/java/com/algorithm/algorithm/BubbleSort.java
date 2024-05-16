package com.algorithm.algorithm;

public class BubbleSort {

    /*
    -bleSort 속도가 안좋음 시간복잡도 o(n²)
    -반복문으로 한번씩돌아서 정렬하고 n-1로 다시 돌기때문에 해당 시간복잡도를 가지고있음.
    -이론 최초값과 한칸옆의 값과 비교하여 작은값과 큰값을 변경해주고 한칸이동하여 해당알고리즘을 반복한 후 배열의 끝까지 도달했을때
    -1회전 가장 큰값이 정렬되었으니 인덱스를 -1하여 큰값을 밀어주고 배열인덱스가 0이될때 해당 정렬이 완료됨
    -ex {3, 5, 4, 2, 1} -> 3,5를 비교하면 5가 더큰값이니 유지하고 다음인덱스로 넘어가고 5, 4를 비교하면 오른쪽의 값이 더 작으니 5, 4를 swap 하여 3, 4, 5, 2, 1로 변경
    -이러한 방식으로 1회전 처리시 3, 4, 2, 1, 5 이런식으로 가장 큰 값이 맨처음 정렬되고 마지막인덱스 -1에서 다시 정렬하여 최종반복하면 output 값이
    -1, 2, 3, 4, 5 이런식으로 정렬을 할 수있음
    */


    public static void bubleSort(int[] arr){


        System.out.println("arr.length = " + arr.length);
        bubleSort(arr, arr.length - 1);
    }




    private static void bubleSort(int[] arr, int last){
        if(last > 0){
            for(int i = 1; i <= last; i++){
                //선택된 인덱스의값이 해당 arr의 값보다 크면 한칸 옆으로 이동하기 위해 swap함
                if(arr[i - 1] > arr[i]){
                    swap(arr, i - 1, i);
                }
            }
            bubleSort(arr, last - 1);
        }
    }









    public static void swap(int[] arr, int source, int target) {
        //swap을 위한 값 source 한칸 오른쪽으로 밀기전의 값 target 보다 큰 수
        //tmp를 만들어 해당 값을 미리 지정해놓고 target에다 큰 값을 넣어준 후고 sorce값에 기존에 지정해놓은 tmp값을 넣어줘서 정렬처리함.
        int tmp = arr[source];
        arr[source] = arr[target];
        arr[target] = tmp;
    }




    private static void printArray(int[] arr){

        for(int data : arr){
            System.out.print(data + ", ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {3,5,4,2,1};
        printArray(arr);
        bubleSort(arr);
        printArray(arr);
    }
}
