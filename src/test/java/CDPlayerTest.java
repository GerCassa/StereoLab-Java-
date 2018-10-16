import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CDPlayerTest {

    CDPlayer cdPlayer;

    @Before
    public void before() {
        cdPlayer = new CDPlayer("Cartman", "AWESOME-O 4000", 4000);
    }

    @Test
    public void hasMake() {
        assertEquals("Cartman", cdPlayer.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("AWESOME-O 4000", cdPlayer.getModel());
    }

    @Test
    public void canPlay() {
        assertEquals("Cd is now Playing.", cdPlayer.playStop("Play"));
    }

    @Test
    public void canStop() {
        assertEquals("Cd has Stopped playing.", cdPlayer.playStop("Stop"));
    }
}
