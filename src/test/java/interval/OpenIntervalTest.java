package interval;

import org.junit.Test;

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

}
