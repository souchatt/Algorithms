package com.tapedbanana.algorithms;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BinarySearchTest {

    @Test
    void binarySearchWorks() {
        int[] arr = new int[] {4, 8, 10, 11, 16, 20};
        assertThat(BinarySearch.binarySearch(arr, 16)).isEqualTo(4);
        assertThat(BinarySearch.binarySearch(arr, 61)).isEqualTo(-1);
        assertThat(BinarySearch.binarySearch(arr, 3)).isEqualTo(-1);
        assertThat(BinarySearch.binarySearch(arr, 12)).isEqualTo(-1);
    }

    @Test
    void findBoundaryWorks() {
        assertThat(BinarySearch.findBoundary(new boolean[] {false, false, false, true, true})).isEqualTo(3);
        assertThat(BinarySearch.findBoundary(new boolean[] {false, false, false, false, false})).isEqualTo(-1);
        assertThat(BinarySearch.findBoundary(new boolean[] {true, true, true, true, true})).isEqualTo(0);
    }
}