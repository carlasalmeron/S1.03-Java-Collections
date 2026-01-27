package Task2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();

        list1.add(2);
        list1.add(4);
        list1.add(6);
        list1.add(8);
        list1.add(10);

        System.out.println("Original List: " + list1);

        List<Integer> list2 = new ArrayList<>();

        ListIterator<Integer> iterator = list1.listIterator(list1.size());

        while (iterator.hasPrevious()){
            list2.add(iterator.previous());
        }

        System.out.println("Inverse List: " + list2);

    }
}
