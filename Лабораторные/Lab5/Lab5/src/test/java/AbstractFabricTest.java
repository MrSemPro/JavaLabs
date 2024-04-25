import org.junit.Assert;
import org.junit.jupiter.api.Test;
import task3.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class AbstractFabricTest{
    @Test
    public void main() throws Exception {
        AbstractFabricService afs = new AbstractFabricService();
        Configuration cfgMob = Configuration.initMob();
        Configuration cfgWeb = Configuration.initWeb();
        Assert.assertEquals(2, cfgMob.getPlatform());
        Assert.assertEquals(1, cfgWeb.getPlatform());
    }
}