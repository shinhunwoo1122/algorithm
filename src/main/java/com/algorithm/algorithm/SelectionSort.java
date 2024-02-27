package com.algorithm.algorithm;

public class SelectionSort {
    /*
    *
    * 선택정렬
    * selectionSort 정렬 시간복잡도 o(n₂) 속도가 안좋음
    *
    * 알고리즘 내용
    * 최소값 인덱스를 최초 인덱스로 지정해주고 반복문을 통해 arr에서 가장 작은 값을 찾아 해당 인덱스와 최초인덱스 값을 swap하여
    * 최소값을 가장 앞으로 밀어주고 최소값 인덱스를 + 1하여서 해당 arr의 length까지 돌아 정렬하는 방법
    *
    * ex)
    * {3, 6, 1, 8, 2, 4}의 arr가 있다고 가정시 최초 인덱스 min_index에 처음 start인덱스를 넣어주고
    * 반복문을 반복하여  {3, 6, 1, 8, 2, 4} arr를 반복문을 통해 한바퀴돌고 최소값 1을 가진 인덱스 2번인덱스를 min_index에 넣어주고
    * start의 arr위치와 min_index와의 값을 변경해주고 start를 한칸밀어 arr의 length만큼 반복하여 정렬해주고 마무리함
    * 최종 output {1, 2, 3, 4, 6, 8}
    *
    * */











    private static void selectionSort(int[] arr){
        selectionSort(arr, 0);
    }
    private static void selectionSort(int[] arr, int start){
        if(start < arr.length -1){
            int min_index = start;
            for(int i = start; i < arr.length; i++){
                if(arr[i] < arr[min_index]) min_index = i;
            }
            swap(arr, start, min_index);
            selectionSort(arr, start + 1);
        }
    }

    private static void swap(int[] arr, int index1, int index2){
        int tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }
    
    private static void printArray(int[] arr){
        for(int data : arr){
            System.out.print(data + ",");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {3, 6, 1, 8, 2, 4};
        printArray(arr);
        selectionSort(arr);
        printArray(arr);
    }
}
