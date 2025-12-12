import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArenaJUnitTest {

    private Arena arena;

    @BeforeEach
    void setUp() {
        arena = new Arena("Blue", 100.0, 50.0);
    }

    @Test
    void testConstructorAndInitialValues() {
        assertEquals("Blue", arena.getColor(), "Initial color is incorrect.");
        assertEquals(100.0, arena.getLength(), 0.001, "Initial length is incorrect.");
        assertEquals(50.0, arena.getWidth(), 0.001, "Initial width is incorrect.");
        assertEquals("Arena", arena.getBuildingType(), "Initial building type is incorrect.");
    }

    @Test
    void testSetSize() {
        arena.setSize(150.0, 75.0);
        assertEquals(150.0, arena.getLength(), 0.001, "Length after setSize is incorrect.");
        assertEquals(75.0, arena.getWidth(), 0.001, "Width after setSize is incorrect.");
    }

    @Test
    void testSetColor() {
        arena.setColor("Red");
        assertEquals("Red", arena.getColor(), "Color after setColor is incorrect.");
    }


    @Test
	void testSetBuildingType() {
    	arena.setBuildingType("Stadium");
    	assertEquals("Stadium", arena.getBuildingType(),"Building Type after setBuildingType is incorrect");
    }

      
    @Test
    void testToString() {
        String expected = "Size (L*W) : 100.0 * 50.0\nColor: Blue\nBuilding Type: Arena";
        assertEquals(expected, arena.toString(), "toString output is incorrect.");
    }
    
    
}
