package interval;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class ClosedInterval extends Interval {

    public ClosedInterval(int lowerEndpoint, int upperEndpoint) {
        super(new ClosedEndpoint(lowerEndpoint), new ClosedEndpoint(upperEndpoint));
    }
}
