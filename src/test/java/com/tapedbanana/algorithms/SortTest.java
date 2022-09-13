package com.tapedbanana.algorithms;

import org.junit.jupiter.api.Test;

import static com.tapedbanana.algorithms.Sort.*;
import static org.assertj.core.api.Assertions.assertThat;

class SortTest {

    @Test
    void bubbleSortWorks() {
        int[] arr = new int[] {5, 1, 3, 2, 4};
        bubbleSort(arr);
        assertThat(arr).isSorted();
    }

    @Test
    void selectionSortWorks() {
        int[] arr = new int[] {5, 1, 3, 2, 4};
        selectionSort(arr);
        assertThat(arr).isSorted();
    }

    @Test
    void insertionSortWorks() {
        int[] arr = new int[] {5, 1, 3, 2, 4};
        insertionSort(arr);
        assertThat(arr).isSorted();
    }
}