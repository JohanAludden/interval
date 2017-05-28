package interval;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by jaludden on 28/05/2017.
 */
public class OpenClosedIntervalTest extends AbstractIntervalTest {

    @Override
    public Interval createInterval(int lower, int upper) {
        return Interval.openLower(lower).closedUpper(upper).build();
    }

    @Override
    protected boolean includesLowerEndpoint() {
        return false;
    }

    @Override
    protected boolean includesUpperEndpoint() {
        return true;
    }

    @Test
    public void testToString() {
        assertThat(interval.toString(), is("(1-3]"));
    }
}
