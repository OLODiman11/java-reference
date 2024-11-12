import java.io.Serializable;

public class Child2 implements Serializable, Cloneable {
    private int a = 5;
    private int b = 6;
    private int c = 7;
    private int d = 8;

    @Override
    public String toString() {
        return "Child2{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
