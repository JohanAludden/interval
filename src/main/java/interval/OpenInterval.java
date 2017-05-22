package interval;

/**
 * Created by jaludden on 22/05/2017.
 */
public class OpenInterval {

    private int lowerEndpoint;
    private int upperEndpoint;

    public OpenInterval(int lowerEndpoint, int upperEndpoint) {
        this.lowerEndpoint = lowerEndpoint;
        this.upperEndpoint = upperEndpoint;
    }

    public int getLowerEndpoint() {
        return lowerEndpoint;
    }

    public int getUpperEndpoint() {
        return upperEndpoint;
    }

    @Override
    public String toString() {
        return String.format("(%s-%s)", lowerEndpoint, upperEndpoint);
    }
}
