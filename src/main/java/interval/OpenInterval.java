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
        return new OpenEndpoint(lowerEndpoint).getBoundedLowerString();
    }

    @Override
    protected String getBoundedUpperString() {
        return new OpenEndpoint(upperEndpoint).getBoundedUpperString();
    }

    @Override
    protected boolean isBoundedLower(int value) {
        return new OpenEndpoint(lowerEndpoint).isBoundedLower(value);
    }

    @Override
    protected boolean isBoundedUpper(int value) {
        return new OpenEndpoint(upperEndpoint).isBoundedUpper(value);
    }
}
