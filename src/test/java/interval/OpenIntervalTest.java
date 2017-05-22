package interval;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by jaludden on 22/05/2017.
 */
public class OpenIntervalTest {

    @Test
    public void testCreateOpenInterval() {
        OpenInterval interval = new OpenInterval(1, 3);
        assertThat(interval.getLowerEndpoint(), is(1));
        assertThat(interval.getUpperEndpoint(), is(3));
    }

    @Test
    public void testToString() {
        OpenInterval interval = new OpenInterval(1, 3);
        assertThat(interval.toString(), is("(1-3)"));
    }
    @Test
    public void testEqualsAndHashCode() {
        OpenInterval a = new OpenInterval(1, 3);
        OpenInterval b = new OpenInterval(1, 3);
        OpenInterval c = new OpenInterval(1, 4);
        OpenInterval d = new OpenInterval(0, 3);
        OpenInterval e = new OpenInterval(1, 3){};

        assertThat(a, is(b));
        assertThat(b, is(a));
        assertThat(a, is(not(c)));
        assertThat(a, is(not(d)));
        assertThat(a, is(not(e)));
        assertThat(a.equals(null), is(false));

        assertThat(a.hashCode(), is(b.hashCode()));
    }
}
