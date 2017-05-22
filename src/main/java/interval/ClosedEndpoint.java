package interval;

/**
 * Created by jaludden on 22/05/2017.
 */
public class ClosedEndpoint {

    private final int value;

    public ClosedEndpoint(int value) {
        this.value = value;
    }

    public String getBoundedLowerString() {
        return String.format("[%s", value);
    }

    public String getBoundedUpperString() {
        return String.format("%s]", value);
    }

    public boolean isBoundedLower(int v) {
        return value <= v;
    }

    public boolean isBoundedUpper(int v) {
        return v <= value;
    }
}
