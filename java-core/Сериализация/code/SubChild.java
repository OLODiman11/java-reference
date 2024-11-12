public class SubChild extends Child {
    private static final long serialVersionUID = 3552323763119512463L;

    private int d = 1;
    private int e = 1;

    public SubChild(int f) {
        super(f);
    }

    @Override
    public String toString() {
        return "SubChild{" +
                "d=" + d +
                '}';
    }
}
