import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before(){
        printer = new Printer(500, 100);
    }
    @Test
    public void hasSheets(){
        assertEquals(500, printer.getSheets());
    }
    @Test
    public void hasToner(){
        assertEquals(100, printer.getToner(), 0.0);
    }

    @Test
    public void canPrint(){
        printer.print(4, 1);
        assertEquals(496,  printer.getSheets());
        assertEquals(96, printer.getToner(), 0.0);
    }
    @Test
    public void cannotPrint(){
        printer.print(500,2);
        assertEquals(500, printer.getSheets());
        assertEquals(100, printer.getToner(), 0.0);
    }




}
