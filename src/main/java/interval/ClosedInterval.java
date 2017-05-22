package interval;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class ClosedInterval extends Interval {

    public ClosedInterval(int lowerEndpoint, int upperEndpoint) {
        super(lowerEndpoint, upperEndpoint);
    }

    public int getLowerEndpoint() {
        return lowerEndpoint;
    }

    public int getUpperEndpoint() {
        return upperEndpoint;
    }

    @Override
    protected String getBoundedLowerString() {
        return String.format("[%s", lowerEndpoint);
    }

    @Override
    protected String getBoundedUpperString() {
        return String.format("%s]", upperEndpoint);
    }

    @Override
    protected boolean isBoundedLower(int value) {
        return lowerEndpoint <= value;
    }

    @Override
    protected boolean isBoundedUpper(int value) {
        return value <= upperEndpoint;
    }
}
