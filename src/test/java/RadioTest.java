import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    Radio radio;

    @Before
    public void before() {
        radio = new Radio("Sony", "SuperRadio3000");
    }

    @Test
    public void hasMake() {
        assertEquals("Sony", radio.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("SuperRadio3000", radio.getModel());
    }

    @Test
    public void canTuneStation() {
        assertEquals("You are listening to Radio 99.5", radio.tuneStation(99.5));
    }
}
