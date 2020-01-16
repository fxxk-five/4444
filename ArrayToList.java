package main.java.damo.generics.main.java.com.damo.collections;

import java.util.Arrays;
import java.util.List;

public class ArrayToList {
    public static void main(String[] args) {
        String[] vowels={"a","e","i","o","u"};

        List<String> vowelsList= Arrays.asList(vowels);
        System.out.println(vowelsList);


        String[] vowelsArray=(String[])vowelsList.toArray();
        for (Object vowel:vowelsArray){
            System.out.println(vowel+" ");
        }
    }
}
