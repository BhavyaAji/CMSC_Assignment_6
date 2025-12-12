import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TicketingOfficeJUnitTest {

    private TicketingOffice office;

    @BeforeEach
    public void setUp() {
        office = new TicketingOffice("Red", 20.0, 15.0);
    }

    @Test
    public void testConstructor() {
        assertEquals("Red", office.getColor());
        assertEquals(20.0, office.getLength());
        assertEquals(15.0, office.getWidth());
        assertEquals("Ticketing Office", office.getBuildingType());
    }

    @Test
    public void testSetSize() {
        office.setSize(30.0, 25.0);
        assertEquals(30.0, office.getLength());
        assertEquals(25.0, office.getWidth());
    }

    @Test
    public void testSetColor() {
        office.setColor("Blue");
        assertEquals("Blue", office.getColor());
    }

    @Test
    public void testSetBuildingType() {
        office.setBuildingType("Special Office");
        assertEquals("Special Office", office.getBuildingType());
    }

    @Test
    public void testToString() {
        String expected = "Size (L*W) : 20.0 * 15.0\nColor: Red\nBuilding Type: Ticketing Office";
        assertEquals(expected, office.toString());
    }
}
