package interval;

/**
 * Created by jaludden on 22/05/2017.
 */
public class OpenInterval extends Interval {

    private OpenInterval(int lowerEndpoint, int upperEndpoint) {
        super(new OpenEndpoint(lowerEndpoint), new OpenEndpoint(upperEndpoint));
    }

    public static Interval createOpenInterval(int lower, int upper) {
        return new OpenInterval(lower, upper);
    }

}
