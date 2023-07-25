import Entities.RandomNumberGenerator;
import Services.RandomNumberGeneratorService;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class RandomNumberGeneratorServiceTest {
    static RandomNumberGeneratorService service;
    static RandomNumberGenerator r1;
    static RandomNumberGenerator r2;
    static RandomNumberGenerator r3;

    @BeforeAll
    static void beforeAll() {
        r1 = new RandomNumberGenerator(100,15);
        r2 = new RandomNumberGenerator(1000,852);
        r3 = new RandomNumberGenerator(15,1);
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
    void randomizeWithParametersTest() {
        assertTrue(r1.getRandomNumber() <= r1.getRandomNumber()
                && r1.getRandomNumber() <= r1.getTopNumber());
        assertTrue(r2.getRandomNumber() <= r2.getRandomNumber()
                && r2.getRandomNumber() <= r2.getTopNumber());
        assertTrue(r3.getRandomNumber() <= r3.getRandomNumber()
                && r3.getRandomNumber() <= r3.getTopNumber());
    }
}
