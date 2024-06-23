package list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(35);
        list.add(55);

        list.add(20);
        list.add(35);

        for(int num:list){
            System.out.println(num);
        }

    }

}
