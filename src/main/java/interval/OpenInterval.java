package interval;

/**
 * Created by jaludden on 22/05/2017.
 */
public class OpenInterval extends Interval {

    public OpenInterval(int lowerEndpoint, int upperEndpoint) {
        super(new OpenEndpoint(lowerEndpoint), new OpenEndpoint(upperEndpoint));
    }
}
