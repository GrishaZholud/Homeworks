package zholud.homework.InsertionSort;

import org.junit.jupiter.api.Test;

class BubbleSortingTest extends SortingTest {
    private int[] array = new int[100];

    @Test
    void insertionSort() {
        addElementsToArray(array);
        BubbleSorting bubbleSorting = new BubbleSorting(array);
        bubbleSorting.sorting();
        compareSmallerElementWithLarger(array);
    }
}