import bridge.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BridgeTest {
    @Test
    void testbridge() {
        Device d1 = new Radio();
        BasicRemote basicRemote = new BasicRemote(d1);
        basicRemote.power();
        assertTrue(d1.isEnabled());
        assertEquals(30, d1.getVolume());
        assertEquals(1, d1.getChannel());
        AdvancedRemote advancedRemote = new AdvancedRemote(d1);
        advancedRemote.power();
        advancedRemote.mute();
        assertFalse(d1.isEnabled());
        assertEquals(0, d1.getVolume());
        assertEquals(1, d1.getChannel());
    }
}