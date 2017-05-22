package interval;

/**
 * Created by jaludden on 22/05/2017.
 */
public class OpenInterval extends Interval {

    public OpenInterval(int lowerEndpoint, int upperEndpoint) {
        super(new OpenEndpoint(lowerEndpoint), new OpenEndpoint(upperEndpoint));
    }

    public int getLowerEndpoint() {
        return lowerEndpoint.getValue();
    }

    public int getUpperEndpoint() {
        return upperEndpoint.getValue();
    }

    @Override
    protected String getBoundedUpperString() {
        return new OpenEndpoint(upperEndpoint.getValue()).getBoundedUpperString();
    }

    @Override
    protected boolean isBoundedLower(int value) {
        return new OpenEndpoint(lowerEndpoint.getValue()).isBoundedLower(value);
    }

    @Override
    protected boolean isBoundedUpper(int value) {
        return new OpenEndpoint(upperEndpoint.getValue()).isBoundedUpper(value);
    }
}
