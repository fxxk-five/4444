package main.java.damo.generics.main.java.com.damo.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapCompute {
    public static void main(String[] args) {
        Map<String,String> data =new HashMap<>();
        data.put("1","1");
        data.put("2","2");
        data.put(null,"4");
        data.put("5",null);

        System.out.println(data);

        for (String key:data.keySet()){
            data.compute(key,(k,v)-> k+v);
        }
        System.out.println("map after first compute ="+data);
    }
}
