package interval;

/**
 * Created by jaludden on 22/05/2017.
 */
public class OpenEndpoint implements Endpoint {

    private final int value;

    public OpenEndpoint(int value) {
        this.value = value;
    }

    @Override
    public int getValue() {
        return value;
    }

    public String getBoundedLowerString() {
        return String.format("(%s", value);
    }

    public String getBoundedUpperString() {
        return String.format("%s)", value);
    }

    public boolean isBoundedLower(int v) {
        return value < v;
    }

    public boolean isBoundedUpper(int v) {
        return v < value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        OpenEndpoint other = (OpenEndpoint) obj;
        return value == other.value;
    }

    @Override
    public int hashCode() {
        return value;
    }

}
