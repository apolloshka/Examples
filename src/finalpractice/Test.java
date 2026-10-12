package finalpractice;

public final class Test {
    private final int CONSTANT;

    private static final String TYPE = "Константы";

    Test() {
        this(0);
    }

    Test(int CONSTANT) {
        this.CONSTANT = CONSTANT;
    }

    public int getConstant() {
        return CONSTANT;
    }


    public static String getType() {
        return TYPE;
    }
}
