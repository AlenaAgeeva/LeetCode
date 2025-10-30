package easy.list;

import java.util.*;
import java.util.stream.Collectors;

/**
 * You are given two lists list1 and list2.
 * Merge and sort the two lists in one list.
 *
 * @author Alena Ageeva
 */
public class MergeTwoLists {
    public static List<Integer> mergeTwoLists(List<Integer> list1, List<Integer> list2) {
        if (list1 == null || list2 == null) {
            throw new IllegalArgumentException("Null argument.");
        }
        List<Integer> list = new ArrayList<>(list1);
        list.addAll(list2);
        return list.stream()
                .sorted()
                .collect(Collectors.toList());
    }
}
