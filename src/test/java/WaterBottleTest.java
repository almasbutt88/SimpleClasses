import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    WaterBottle bottle;

    @Before
    public void before() {
        bottle = new WaterBottle(100);
    }

    @Test
    public void startVolumeAt100(){
        assertEquals(100, bottle.getVolume());
    }

    @Test
    public void canDrink() {
        bottle.drink();
        assertEquals(90, bottle.getVolume());
    }
    @Test
    public void cannotDrinkIfBottleEmpty(){
        bottle.setVolume(0);
        bottle.drink();
        assertEquals(0, bottle.getVolume());
    }
    @Test
    public void canEmpty() {
        bottle.empty();
        assertEquals(0, bottle.getVolume());
    }

    @Test
    public void canRefill(){
        bottle.refill();
        assertEquals(100, bottle.getVolume());
    }

    }

