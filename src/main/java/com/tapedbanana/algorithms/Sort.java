package com.tapedbanana.algorithms;

import static java.lang.System.arraycopy;

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

    static void mergeSort(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }

    private static void mergeSort(int[] arr, int start, int end) {
        if (start == end)
            return;

        int mid = (start + end) / 2;

        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);

        merge(arr, start, mid, end);
    }

    private static void merge(int[] arr, int start, int mid, int end) {
        int[] mergedArr = new int[end - start + 1];
        int i1 = start, i2 = mid + 1;
        for (int i = 0; i < mergedArr.length; i++) {
            if (i1 > mid)
                mergedArr[i] = arr[i2++];
            else if (i2 > end)
                mergedArr[i] = arr[i1++];
            else if (arr[i1] > arr[i2])
                mergedArr[i] = arr[i2++];
            else
                mergedArr[i] = arr[i1++];
        }

        arraycopy(mergedArr, 0, arr, start, mergedArr.length);
    }

    static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int start, int end) {
        if (start >= end)
            return;

        int pivot = arr[end], left = start, right = end;
        while (left < right) {
            while (left < right && arr[left] < pivot)
                left++;
            while (left < right && arr[right] >= pivot)
                right--;
            if (left == right)
                break;
            swap(arr, left, right);
        }

        swap(arr, left, end);

        quickSort(arr, start, left - 1);
        quickSort(arr, left + 1, end);
    }

    private static void swap(int[] arr, int i1, int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }
}
