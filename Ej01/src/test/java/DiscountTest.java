import Entities.Discount;
import Services.DiscountServices;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class DiscountTest {
    static DiscountServices ds;
    static Discount d1;
    static Discount d2;
    static Discount d3;

    @BeforeAll
    static void beforeAll() {
        d1 = new Discount(100, 10);
        d2 = new Discount(100, 55);
        d3 = new Discount(100, 0);
    }

    @AfterAll
    static void afterAll() {
    }

    @BeforeEach
    void setUp() {
        
    }

    @AfterEach
    void tearDown() {
        
    }

    @Test
    void applyDiscountTest() {
        ds = new DiscountServices();
        assertEquals(90, ds.applyDiscount(d1), 0);
        assertEquals(45, ds.applyDiscount(d2), 0);
        assertEquals(100, ds.applyDiscount(d3), 0);
    }
}
