package interval;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by jaludden on 22/05/2017.
 */
public class OpenIntervalTest {

    private Interval interval;

    @Before
    public void setUp() {
        interval = OpenInterval.createOpenInterval(1, 3);
    }

    @Test
    public void testCreateOpenInterval() {
        assertThat(interval.getLowerEndpoint(), is(1));
        assertThat(interval.getUpperEndpoint(), is(3));
    }

    @Test
    public void testContainsValueBetweenLowerAndUpperEndpoints() {
        assertThat(interval.contains(2), is(true));
    }

    @Test
    public void testContainsValueEqualToLowerEndpoint() {
        assertThat(interval.contains(1), is(false));
    }

    @Test
    public void testContainsValueEqualToUpperEndpoint() {
        assertThat(interval.contains(3), is(false));
    }

    @Test
    public void testToString() {
        assertThat(interval.toString(), is("(1-3)"));
    }
    @Test
    public void testEqualsAndHashCode() {
        Interval a = OpenInterval.createOpenInterval(1, 3);
        Interval b = OpenInterval.createOpenInterval(1, 3);
        Interval c = OpenInterval.createOpenInterval(1, 4);
        Interval d = OpenInterval.createOpenInterval(0, 3);

        assertThat(a, is(b));
        assertThat(b, is(a));
        assertThat(a, is(not(c)));
        assertThat(a, is(not(d)));
        assertThat(a.equals(null), is(false));

        assertThat(a.hashCode(), is(b.hashCode()));
    }
}
