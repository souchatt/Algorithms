package com.tapedbanana.algorithms;

import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Consumer;
import java.util.stream.IntStream;

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
        int times = 10;
        while (times-- > 0) {
            int[] arr = shuffle(IntStream.range(0, 1000).toArray());
            sort.accept(arr);
            assertThat(arr).isSorted();
        }
    }

    private static int[] shuffle(int[] arr) {
        Random random = ThreadLocalRandom.current();
        for (int i = arr.length - 1; i > 0; i--) {
            int rnd = random.nextInt(i + 1);
            swap(arr, rnd, i);
        }
        return arr;
    }

    private static void swap(int[] arr, int i1, int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }
}