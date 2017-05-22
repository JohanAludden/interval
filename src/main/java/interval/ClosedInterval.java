package interval;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class ClosedInterval extends Interval {

    public ClosedInterval(int lowerEndpoint, int upperEndpoint) {
        super(new ClosedEndpoint(lowerEndpoint), new ClosedEndpoint(upperEndpoint));
    }

    public int getLowerEndpoint() {
        return lowerEndpoint.getValue();
    }

    public int getUpperEndpoint() {
        return upperEndpoint.getValue();
    }

    @Override
    protected String getBoundedUpperString() {
        return new ClosedEndpoint(upperEndpoint.getValue()).getBoundedUpperString();
    }

    @Override
    protected boolean isBoundedLower(int value) {
        return new ClosedEndpoint(lowerEndpoint.getValue()).isBoundedLower(value);
    }

    @Override
    protected boolean isBoundedUpper(int value) {
        return new ClosedEndpoint(upperEndpoint.getValue()).isBoundedUpper(value);
    }
}
