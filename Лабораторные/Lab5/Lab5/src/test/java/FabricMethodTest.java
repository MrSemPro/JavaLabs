import org.junit.jupiter.api.Test;
import task2.*;

import static org.junit.Assert.assertEquals;

public class FabricMethodTest{
    @Test
    public void main() throws Exception {
        Configuration confMob = Configuration.initMob();
        Configuration confWeb = Configuration.initWeb();
        assertEquals(2, confMob.getPlatform());
        assertEquals(1, confWeb.getPlatform());
    }
}