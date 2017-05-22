package interval;

/**
 * Created by jaludden on 22/05/2017.
 */
public class OpenInterval extends Interval {

    public OpenInterval(int lowerEndpoint, int upperEndpoint) {
        super(lowerEndpoint, upperEndpoint);
    }

    public int getLowerEndpoint() {
        return lowerEndpoint;
    }

    public int getUpperEndpoint() {
        return upperEndpoint;
    }

    @Override
    public String toString() {
        return String.format("%s-%s", getBoundedLowerString(), getBoundedUpperString());
    }

    @Override
    protected String getBoundedLowerString() {
        return String.format("(%s", lowerEndpoint);
    }

    @Override
    protected String getBoundedUpperString() {
        return String.format("%s)", upperEndpoint);
    }

    @Override
    protected boolean isBoundedLower(int value) {
        return lowerEndpoint < value;
    }

    @Override
    protected boolean isBoundedUpper(int value) {
        return value < upperEndpoint;
    }
}
