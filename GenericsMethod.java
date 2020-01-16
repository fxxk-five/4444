package main.java.damo.generics;

public class GenericsMethod {

    private  static <T> boolean isEqual(GenericsClass<T> g1,GenericsClass<T> g2){
        return g1.getItem().equals(g2.getItem());

    }

    private  static <T extends Comparable<T>>int compare(T t1, T t2){
        return t1.compareTo(t2);
    }

    public static void main(String[] args) {
        GenericsClass<String>g1=new GenericsClass<>();
        g1.setItem("xi'an");
        GenericsClass<String>g2=new GenericsClass<>();
        g2.setItem("xi'an");

        boolean isEqual=GenericsMethod.isEqual(g1,g2);
        System.out.println(isEqual);

        int compareResult=GenericsMethod.compare(11,22);
        System.out.println(compareResult);
    }
}
