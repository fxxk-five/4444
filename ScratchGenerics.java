package main.java.damo.generics;


class GenericKlass<P>{
    P ob;

    public GenericKlass(P ob) {
        this.ob = ob;
    }

    public P getOb() {
        return ob;
    }

    void getType(){
        System.out.println("Type is"+ob.getClass().getName());
    }
}

public class ScratchGenerics {

    public static void main(String[] args) {
        GenericKlass<Double> dOb=new GenericKlass<>(1.33);
        dOb.getType();
        System.out.println("Value is"+dOb.getOb());
        GenericKlass<String> strdOb=new GenericKlass<String>("adasd");
        strdOb.getType();
        System.out.println("Value is"+strdOb.getOb());
    }

}
