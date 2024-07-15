package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo1 {



    public static void main(String[] args) {

        ArrayList list = new ArrayList();

        list.add(10);
        list.add('a');
        list.add(null);
        list.add("viaksh");
        list.add(10);
        System.out.println(list);
        list.remove(4);
        System.out.println(list);
        list.addAll(List.of(10,"vikky", "prince"));
        System.out.println(list);
        list.set(4, "basant");
        System.out.println(list);
        list.add(4, "vikky");
        System.out.println(list);
        System.out.println(list.contains("vikky"));
        System.out.println(list.lastIndexOf(10));
        Object[] array = list.toArray();
        System.out.println(Arrays.toString(array));

    }


}
