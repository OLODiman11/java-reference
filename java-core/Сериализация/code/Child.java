import java.io.Serializable;

public class Child extends Parent implements Serializable, Cloneable {
    private static final long serialVersionUID = 2192579907273624894L;

    private int a = 1;
    private int b = 2;
    private int c = 3;
    private Child2 child2 = new Child2();

    public Child() {
        super(2);
    }

    public Child(int f) {
        super(f);
    }

//    public Child() {
//
//    }


    @Override
    public String toString() {
        return "Child{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", child2=" + child2 +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Child2 getChild2() {
        return child2;
    }
}
