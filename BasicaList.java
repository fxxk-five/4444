package main.java.damo.generics.main.java.com.damo.collections;

import java.util.ArrayList;
import java.util.List;

public class BasicaList {
    public static void main(String[] args) {
        List<String> vowels=new ArrayList<>();

        vowels.add("A");
        vowels.add("I");
        vowels.add(1,"E");

        List<String> list=new ArrayList<>();
        list.add("O");
        list.add("U");


        vowels.addAll(list);

        list.add("x");
        list.clear();
        System.out.println(vowels);

        vowels.set(2,"E");
        System.out.println(vowels);

        vowels.clear();
        vowels.add("R");
        vowels.add("E");
        vowels.add("T");
        vowels.add("Y");
        list=vowels.subList(0,2);
        System.out.println("vomels="+vowels+"list="+list);


        vowels.set(0,"A");
        System.out.println("vomels="+vowels+"list="+list);

        list.add("U");
        System.out.println("vomels="+vowels+"list="+list);
    }
}
