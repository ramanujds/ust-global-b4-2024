package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {

        Set<Integer> list = new HashSet<>();

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
