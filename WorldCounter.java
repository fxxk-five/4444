package main.java.damo.generics.main.java.com.damo.collections;

import java.util.HashMap;

public class WorldCounter {

    public static void main(String[] args) {
        Integer[] nums={10,8,654,53,534,7657,354,54,543,54,54,};
        HashMap<?,Integer> counts=wordCounter(nums);
        System.out.println(counts);


        String str="Hi Hello Hi Helo hi";
        String[] words =str.split(" ");
        HashMap<?,Integer> counts1=wordCounter(words);
        System.out.println(counts1);
    }

    private static <T>HashMap<T,Integer> wordCounter(T groups[]){
        HashMap<T, Integer> map=new HashMap<>();
        for (T key:groups){
            Integer keyvalue=map.get(key);
            int value =1;
            if (map.get(key)!=null){
                value=keyvalue+1;
            }
            map.put(key,value);
        }
        return map;
    }
}
