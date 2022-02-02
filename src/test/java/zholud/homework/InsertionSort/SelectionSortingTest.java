package zholud.homework.InsertionSort;

import org.junit.jupiter.api.Test;

class SelectionSortingTest extends SortingTest {
    private int[] array = new int[100];

    @Test
    void insertionSort() {
        addElementsToArray(array);
        SelectionSorting selectionSorting = new SelectionSorting(array);
        selectionSorting.sorting();
        compareSmallerElementWithLarger(array);
    }
}