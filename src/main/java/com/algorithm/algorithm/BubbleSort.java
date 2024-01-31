package com.algorithm.algorithm;

public class BubbleSort {

    //bubleSort 속도가 안좋음 시간복잡도 o(n²)
    //반복문으로 한번씩돌아서 정렬하고 n-1로 다시 돌기때문에 해당 시간복잡도를 가지고있음.

    public static void bubleSort(int[] arr){
        System.out.println("arr.length = " + arr.length);
        bubleSort(arr, arr.length - 1);
    }
    private static void bubleSort(int[] arr, int last){
        //4
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
