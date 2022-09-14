package com.tapedbanana.algorithms;

import org.junit.jupiter.api.Test;

import java.util.function.Consumer;

import static org.assertj.core.api.Assertions.assertThat;

class SortTest {

    @Test
    void bubbleSortWorks() {
        assertSortWorks(Sort::bubbleSort);
    }

    @Test
    void selectionSortWorks() {
        assertSortWorks(Sort::selectionSort);
    }

    @Test
    void insertionSortWorks() {
        assertSortWorks(Sort::insertionSort);
    }

    @Test
    void mergeSortWorks() {
        assertSortWorks(Sort::mergeSort);
    }

    @Test
    void quickSortWorks() {
        assertSortWorks(Sort::quickSort);
    }

    void assertSortWorks(Consumer<int[]> sort) {
        int[] arr = new int[] {8, 5, 1, 7, 3, 2, 4, 9, 0, 6};
        sort.accept(arr);
        assertThat(arr).isSorted();
    }
}