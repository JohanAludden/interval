package interval;

import java.util.Objects;

/**
 * Created by jaludden on 22/05/2017.
 */
public class Interval {

    protected Endpoint lowerEndpoint;
    protected Endpoint upperEndpoint;

    protected Interval(Endpoint lowerEndpoint, Endpoint upperEndpoint) {
        this.lowerEndpoint = lowerEndpoint;
        this.upperEndpoint = upperEndpoint;
    }

    public static Interval createClosedInterval(int lower, int upper) {
        return new Builder().closedLower(lower).closedUpper(upper).build();
    }

    public static Interval createOpenInterval(int lower, int upper) {
        return new Builder().openLower(lower).openUpper(upper).build();
    }

    public int getLowerEndpoint() {
        return lowerEndpoint.getValue();
    }

    public int getUpperEndpoint() {
        return upperEndpoint.getValue();
    }

    public boolean contains(int value) {
        return isBoundedLower(value) && isBoundedUpper(value);
    }

    protected boolean isBoundedLower(int value) {
        return lowerEndpoint.isBoundedLower(value);
    }

    protected boolean isBoundedUpper(int value) {
        return upperEndpoint.isBoundedUpper(value);
    }

    @Override
    public String toString() {
        return String.format("%s-%s", getBoundedLowerString(), getBoundedUpperString());
    }

    protected String getBoundedLowerString() {
        return lowerEndpoint.getBoundedLowerString();
    }

    protected String getBoundedUpperString() {
        return upperEndpoint.getBoundedUpperString();
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
        return lowerEndpoint.equals(other.lowerEndpoint) && upperEndpoint.equals(other.upperEndpoint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lowerEndpoint, upperEndpoint);
    }

    public static class Builder {

        private Endpoint lower;
        private Endpoint upper;

        public Builder closedLower(int lower) {
            this.lower = new ClosedEndpoint(lower);
            return this;
        }

        public Builder openLower(int lower) {
            this.lower = new OpenEndpoint(lower);
            return this;
        }

        public Builder closedUpper(int upper) {
            this.upper = new ClosedEndpoint(upper);
            return this;
        }

        public Interval build() {
            return new Interval(lower, upper);
        }

        public Builder openUpper(int upper) {
            this.upper = new OpenEndpoint(upper);
            return this;
        }
    }
}
