package interval;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by jaludden on 22/05/2017.
 */
public class OpenIntervalTest extends AbstractIntervalTest {


    @Override
    public Interval createInterval(int lower, int upper) {
        return Interval.createOpenInterval(lower, upper);
    }

    @Override
    protected boolean includesLowerEndpoint() {
        return false;
    }

    @Override
    protected boolean includesUpperEndpoint() {
        return false;
    }

    @Test
    public void testToString() {
        assertThat(interval.toString(), is("(1-3)"));
    }

}
