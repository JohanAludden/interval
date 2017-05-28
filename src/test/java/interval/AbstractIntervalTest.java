package interval;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by jaludden on 28/05/2017.
 */
public abstract class AbstractIntervalTest {

    protected Interval interval;

    @Before
    public void setUp() {
        interval = createInterval(1, 3);
    }

    @Test
    public void testEndpoints() {
        assertThat(interval.getLowerEndpoint(), is(1));
        assertThat(interval.getUpperEndpoint(), is(3));
    }

    @Test
    public void testContainsValueBetweenLowerAndUpperEndpoints() {
        assertThat(interval.contains(2), is(true));
    }

    @Test
    public final void testDoesNotContainValueLessThenLowerEndpoint() {
        assertThat(interval.contains(0), is(false));
    }

    @Test
    public final void testDoesNotContainValueGreaterThenUpperEndpoint() {
        assertThat(interval.contains(4), is(false));
    }

    @Test
    public void testContainsLowerEndpoint() {
        assertThat(interval.contains(1), is(includesLowerEndpoint()));
    }

    @Test
    public void testContainsUpperEndpoint() {
        assertThat(interval.contains(3), is(includesUpperEndpoint()));
    }

    @Test
    public void testEqualsAndHashCode() {
        Interval a = createInterval(1, 3);
        Interval b = createInterval(1, 3);
        Interval c = Interval.createOpenInterval(1, 4);
        Interval d = Interval.createOpenInterval(0, 3);

        assertThat(a, is(b));
        assertThat(b, is(a));
        assertThat(a, is(not(c)));
        assertThat(a, is(not(d)));
        assertThat(a.equals(null), is(false));

        assertThat(a.hashCode(), is(b.hashCode()));
    }

    protected abstract boolean includesUpperEndpoint();

    protected abstract boolean includesLowerEndpoint();

    protected abstract Interval createInterval(int lower, int upper);
}
