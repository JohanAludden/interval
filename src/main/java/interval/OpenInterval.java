package interval;

/**
 * Created by jaludden on 22/05/2017.
 */
public class OpenInterval {

    public static Interval createOpenInterval(int lower, int upper) {
        return new Interval(new OpenEndpoint(lower), new OpenEndpoint(upper));
    }

}
