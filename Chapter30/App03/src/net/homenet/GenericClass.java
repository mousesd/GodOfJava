package net.homenet;

@SuppressWarnings("WeakerAccess")
public class GenericClass<X> {
    private X value;
    private Object object;

    public <T> GenericClass(T t) {
        this.object = t;
        System.out.println("T type=" + t.getClass().getName());
    }

    public void setValue(X x) {
        this.value = x;
        System.out.println("X type=" + x.getClass().getName());
    }
}
