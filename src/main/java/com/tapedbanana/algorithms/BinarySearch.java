package com.tapedbanana.algorithms;

class BinarySearch {

    static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] < target)
                low = mid + 1;
            else if (arr[mid] > target)
                high = mid - 1;
            else return mid;
        }
        return -1;
    }

    static int findBoundary(boolean[] arr) {
        int low = 0, high = arr.length - 1, boundaryIndex = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid]) {
                boundaryIndex = mid;
                high = mid - 1;
            } else low = mid + 1;
        }
        return boundaryIndex;
    }
}
