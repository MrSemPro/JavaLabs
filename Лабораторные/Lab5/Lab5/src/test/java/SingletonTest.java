import org.junit.Test;
import task1.Conection;
import static org.junit.Assert.assertEquals;
public class SingletonTest{
    @Test
    public void main(){
        Conection conection1 = Conection.getInstance();
        Conection conection2 = Conection.getInstance();
        assertEquals(conection1,conection2);
    }
}