package interval;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by jaludden on 28/05/2017.
 */
public class ClosedOpenIntervalTest extends AbstractIntervalTest {

    @Override
    public Interval createInterval(int lower, int upper) {
        return Interval.closedLower(lower).openUpper(upper).build();
    }

    @Override
    protected boolean includesLowerEndpoint() {
        return true;
    }

    @Override
    protected boolean includesUpperEndpoint() {
        return false;
    }

    @Test
    public void testToString() {
        assertThat(interval.toString(), is("[1-3)"));
    }
}
