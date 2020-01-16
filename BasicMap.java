package main.java.damo.generics.main.java.com.damo.collections;

import java.security.KeyStore;
import java.util.*;

public class BasicMap {
    public static void main(String[] args){
        Map<String,String> data =new HashMap<>();
        data.put("A","A");
        data.put("B","A");
        data.put("C","A");
        data.put("D",null);
        data.put("E","A");
        data.put(null,"A");

        System.out.println(data);

        String value =data.get(null);
        System.out.println("key=null,value="+value);

        value=data.getOrDefault("M","Default");
        System.out.println("key=M,value="+value);

        boolean keyExists=data.containsKey(null);
        boolean valueExists=data.containsValue(null);
        System.out.println(keyExists);
        System.out.println(valueExists);

        System.out.println("data map size is"+data.size());

        Set<Map.Entry<String,String>>entrySet =data.entrySet();
        System.out.println(entrySet);

        Set<String> keySet=data.keySet();
        System.out.println("data key is "+keySet);

        Collection<String> values = data.values();
        System.out.println("data value is "+values);

        data.clear();
        System.out.println("data mao is empty="+data.isEmpty());

        for (Map.Entry entry:data.entrySet()){

            data.put((String)entry.getKey(),
                    (String)entry.getKey()+(String)entry.getValue());

        }

        System.out.println(data);



        data.compute(null,(k,v)->k+v+v+v+v);
        data.compute("null",(k,v)->k+v+v+v+v);
        System.out.println(data);
    }
}