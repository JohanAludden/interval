package interval;

import java.util.Objects;

/**
 * Created by jaludden on 22/05/2017.
 */
public abstract class Interval {

    protected Endpoint lowerEndpoint;
    protected Endpoint upperEndpoint;

    protected Interval(Endpoint lowerEndpoint, Endpoint upperEndpoint) {
        this.lowerEndpoint = lowerEndpoint;
        this.upperEndpoint = upperEndpoint;
    }

    public boolean contains(int value) {
        return isBoundedLower(value) && isBoundedUpper(value);
    }

    protected abstract boolean isBoundedLower(int value);

    protected abstract boolean isBoundedUpper(int value);

    @Override
    public String toString() {
        return String.format("%s-%s", getBoundedLowerString(), getBoundedUpperString());
    }

    protected abstract String getBoundedLowerString();

    protected abstract String getBoundedUpperString();

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Interval other = (Interval) obj;
        return lowerEndpoint.equals(other.lowerEndpoint) && upperEndpoint.equals(other.upperEndpoint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lowerEndpoint, upperEndpoint);
    }
}
