package easy.list;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

class MergeTwoListsTest {

    @Test
    void whenMergeTwoListsThenGetSortedList() {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 5, 7, 8, 4, -9, 0, 34));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(11, -45, 0, 1, 22, 124, 786, -456));
        List<Integer> expected = new ArrayList<>(Arrays.asList(-456, -45, -9, 0, 0, 1, 1, 4, 5, 7, 8, 11, 22, 34, 124, 786));
        assertThat(expected).isEqualTo(MergeTwoLists.mergeTwoLists(list1, list2));
    }

    @Test
    void whenMergeTwoListsWithOneElementThenGetSortedList() {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(0));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1));
        List<Integer> expected = new ArrayList<>(Arrays.asList(0, 1));
        assertThat(expected).isEqualTo(MergeTwoLists.mergeTwoLists(list1, list2));
    }

    @Test
    void mergeTwoListsWithNoElementInOneListThenGetSortedList() {
        List<Integer> list1 = new ArrayList<>(Arrays.asList());
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 5, 7, 8, 4, -9, 0, 34));
        List<Integer> expected = new ArrayList<>(Arrays.asList(-9, 0, 1, 4, 5, 7, 8, 34));
        assertThat(expected).isEqualTo(MergeTwoLists.mergeTwoLists(list1, list2));
    }

    @Test
    void whenMergeTwoListsWithNullValueThenThrowException() {
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1));
        assertThatThrownBy(() -> MergeTwoLists.mergeTwoLists(null, list2)).isInstanceOf(IllegalArgumentException.class);
    }
}