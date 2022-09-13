package com.tapedbanana.algorithms;

class Sort {

    static void bubbleSort(int[] arr) {
        for (int ptr = arr.length - 1; ptr > 0; ptr--) {
            boolean swapped = false;
            for (int i = 0; i < ptr; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
    }

    static void selectionSort(int[] arr) {
        for (int ptr = 0; ptr < arr.length - 1; ptr++) {
            int smallest = ptr;
            for (int i = ptr + 1; i < arr.length; i++) {
                if (arr[i] < arr[smallest])
                    smallest = i;
            }
            if (smallest != ptr)
                swap(arr, ptr, smallest);
        }
    }

    static void insertionSort(int[] arr) {
        for (int ptr = 1; ptr < arr.length; ptr++) {
            for (int i = ptr; i > 0 && arr[i - 1] > arr[i]; i--)
                swap(arr, i - 1, i);
        }
    }

    private static void swap(int[] arr, int i1, int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }
}
