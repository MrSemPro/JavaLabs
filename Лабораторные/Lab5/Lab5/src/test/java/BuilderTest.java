import org.junit.Test;
import static org.junit.Assert.assertEquals;
import task4.*;
public class BuilderTest{
    @Test
    public void main() throws Exception {
        CarBuilder builder = new CarBuilder();
        builder.setCarType(CarType.CITY_CAR);
        builder.setSeats(5);
        builder.setEngine(new Engine(1.8, 2000));
        builder.setTransmission(Transmission.MANUAL);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
        Car car = builder.getResult();
        assertEquals("CITY_CAR", car.getCarType().toString());
        assertEquals(5, car.getSeats());
        assertEquals(1.8, car.getEngine().getVolume(), 0.001);
        assertEquals(2000, car.getEngine().getMileage(), 0.001);
        assertEquals("MANUAL", car.getTransmission().toString());
    }
}