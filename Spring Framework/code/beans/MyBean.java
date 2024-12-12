package beans;

public class MyBean {
    private int a;
    private int b;
    private String  c;
    private String d;
    private AnotherBean anotherBean;

    public MyBean(int a, int b, String c, String d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public String toString() {
        return "MyBean{" +
                "a=" + a +
                ", b=" + b +
                ", c='" + c + '\'' +
                ", d='" + d + '\'' +
                ", anotherBean=" + anotherBean +
                '}';
    }

    public void setAnotherBean(AnotherBean anotherBean) {
        this.anotherBean = anotherBean;
    }

    public void setA(int a) {
        this.a = a;
    }
}
