package generic;

// generic class
public class Generics<T> {

    T val;

    public void set(T val) {
        this.val = val;
    }

    public T get() {
        return val;
    }

    // generc methods

}
