import Entitites.Rectangle;
import Services.RectangleService;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;


public class TestRectangle {
    RectangleService rs;

    @BeforeAll
    static void beforeAll() {

    }

    @AfterAll
    static void afterAll() {

    }

    @BeforeEach
    void setUp() {
        rs = new RectangleService();
    }

    @AfterEach
    void tearDown() {

    }

    @Test
    public void shouldInicializateColor() {
        System.out.println("Testing colour");
        assertNotNull(new Rectangle(10, 10).getColour());
    }

    @Test
    public void shouldInicializateActive() {
        System.out.println("Testing active");
        Rectangle r = new Rectangle(10, 10);
        assertTrue(r.isActive());
        r.setActive(false);
        assertFalse(r.isActive());
    }

    @Test
    public void shouldCalculateArea() {
        System.out.println("Testing getArea");
        assertEquals(100, rs.getArea(new Rectangle(10, 10)), 0);
        assertEquals(20, rs.getArea(new Rectangle(4, 5)), 0);
        assertEquals(1, rs.getArea(new Rectangle(1,1)),0);
    }

    @Test
    public void shouldCalculatePerimeter() {
        System.out.println("Testing getPerimeter");
        assertEquals(40, rs.getPerimeter(new Rectangle(10, 10)), 0);
        assertEquals(30, rs.getPerimeter(new Rectangle(10, 5)), 0);
        assertEquals(4, rs.getPerimeter(new Rectangle(1,1)),0);
    }

}
