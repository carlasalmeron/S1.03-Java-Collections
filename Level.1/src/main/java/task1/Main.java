package task1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Month> months = new ArrayList<>();

        months.add(new Month("January"));
        months.add(new Month("February"));
        months.add(new Month("March"));
        months.add(new Month("April"));
        months.add(new Month("May"));
        months.add(new Month("June"));
        months.add(new Month("July"));
        months.add(new Month("September"));
        months.add(new Month("October"));
        months.add(new Month("November"));
        months.add(new Month("December"));

        System.out.println("ArrayList without August: " + months);

        months.add(7, new Month("August"));

        System.out.println("ArrayList with August: " + months);

        HashSet<Month> monthSet = new HashSet<>(months);
        monthSet.add(new Month("January"));

        System.out.println("HashSet (no duplicates): " + monthSet);

        System.out.println("Iteration with for-each:");
        for (Month m : months) {
            System.out.println(m);
        }

        System.out.println("Iteration with Iterator:");
        Iterator<Month> it = months.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
