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
        return lowerEndpoint == other.lowerEndpoint && upperEndpoint == other.upperEndpoint;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lowerEndpoint, upperEndpoint);
    }
}
