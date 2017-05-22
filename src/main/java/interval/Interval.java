package interval;

import java.util.Objects;

/**
 * Created by jaludden on 22/05/2017.
 */
public abstract class Interval {

    protected int lowerEndpoint;
    protected int upperEndpoint;

    protected Interval(int lowerEndpoint, int upperEndpoint) {
        this.lowerEndpoint = lowerEndpoint;
        this.upperEndpoint = upperEndpoint;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Interval other = (Interval) obj;
        return lowerEndpoint == other.lowerEndpoint && upperEndpoint == other.upperEndpoint;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lowerEndpoint, upperEndpoint);
    }
}
