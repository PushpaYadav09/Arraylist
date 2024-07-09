import java.util.ArrayList;
import java.util.Collections;

import static java.util.Collections.sort;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<Integer>();
        //add elements
        list.add(8);
        list.add(3);
        list.add(0);
        list.add(5);
        list.add(9);
        System.out.println(list);

        //get an element
        int element=list.get(4);
        System.out.println(element);

        //add element in between
        list.add(5,7);
        System.out.println(list);
       // set element
        list.set(5,1);
        System.out.println(list);
        //delete element
        list.remove(3);
        System.out.println(list);
        //size of Arrray
        int size=list.size();
        System.out.println(size);
        //sorting in list
        sort(list);
        System.out.println(list);

    }
}
