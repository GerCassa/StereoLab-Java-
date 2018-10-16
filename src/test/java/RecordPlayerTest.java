import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecordPlayerTest {

    RecordPlayer recordPlayer;

    @Before
    public void before() {
        recordPlayer = new RecordPlayer("Technics", "SL-1210 GR", 33);
    }

    @Test
    public void hasMake() {
        assertEquals("Technics", recordPlayer.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("SL-1210 GR", recordPlayer.getModel());
    }


    @Test
    public void canPlayAtSpeed() {
        assertEquals("Record is playing at 33.", recordPlayer.playStop("Play"));
    }

    @Test
    public void canStop() {
        assertEquals("Record has stopped playing.", recordPlayer.playStop("Stop"));
    }

    @Test
    public void canChangeSpeed() {
        recordPlayer.setSpeed(45);
        assertEquals(45, recordPlayer.getSpeed());
    }
}
