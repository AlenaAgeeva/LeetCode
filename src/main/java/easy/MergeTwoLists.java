package easy;

import java.util.*;
import java.util.stream.Collectors;

/**
 * You are given two lists list1 and list2.
 * Merge and sort the two lists in one list.
 * @author Alena Ageeva
 */
public class MergeTwoLists {
    public List<Integer> mergeTwoLists(List<Integer> list1, List<Integer> list2) {
        List<Integer> list = new ArrayList<>(list1);
        list.addAll(list2);
        return list.stream()
                .sorted()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(new MergeTwoLists()
                .mergeTwoLists(List.of(7, 1, 4, 5), List.of(0, -10, -8, 45, 3)));
    }
}
