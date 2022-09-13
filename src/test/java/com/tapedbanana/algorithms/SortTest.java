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

    void assertSortWorks(Consumer<int[]> sort) {
        int[] arr = new int[] {5, 1, 3, 2, 4};
        sort.accept(arr);
        assertThat(arr).isSorted();
    }
}