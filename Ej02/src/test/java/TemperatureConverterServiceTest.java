import Entities.TemperatureConverter;
import Services.TemperatureConverterService;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class TemperatureConverterServiceTest {
    static TemperatureConverterService tcService;
    static TemperatureConverter tc01;
    static TemperatureConverter tc02;
    static TemperatureConverter tc03;
    static TemperatureConverter tc04;
    static TemperatureConverter tc05;
    static TemperatureConverter tc06;
    static TemperatureConverter tc07;
    static TemperatureConverter tc08;
    static TemperatureConverter tc09;
    static TemperatureConverter tc10;
    static TemperatureConverter tc11;
    static TemperatureConverter tc12;


    @BeforeAll
    static void beforeAll() {
        tcService = new TemperatureConverterService();
        tc01 = new TemperatureConverter("celsius", -10);
        tc02 = new TemperatureConverter("celsius", 0);
        tc03 = new TemperatureConverter("celsius", 100);
        tc04 = new TemperatureConverter("celsius", 200);
        tc05 = new TemperatureConverter("kelvin", -10);
        tc06 = new TemperatureConverter("kelvin", 0);
        tc07 = new TemperatureConverter("kelvin", 100);
        tc08 = new TemperatureConverter("kelvin", 200);
        tc09 = new TemperatureConverter("fahrenheit", -10);
        tc10 = new TemperatureConverter("fahrenheit", 0);
        tc11 = new TemperatureConverter("fahrenheit", 100);
        tc12 = new TemperatureConverter("fahrenheit", 200);
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
    void convertCelsiusToKTest() {
        assertEquals(263.15, tcService.convertCelsiusToK(tc01), 0.01);
        assertEquals(273.15, tcService.convertCelsiusToK(tc02), 0.01);
        assertEquals(373.15, tcService.convertCelsiusToK(tc03), 0.01);
        assertEquals(473.15, tcService.convertCelsiusToK(tc04), 0.01);
    }

    @Test
    void convertCelsiusToFTest() {
        assertEquals(14, tcService.convertCelsiusToF(tc01), 0.01);
        assertEquals(32, tcService.convertCelsiusToF(tc02), 0.01);
        assertEquals(212, tcService.convertCelsiusToF(tc03), 0.01);
        assertEquals(392, tcService.convertCelsiusToF(tc04), 0.01);
    }

    @Test
    void convertKelvinToCTest() {
        assertEquals(-283.15, tcService.convertKelvinToC(tc05), 0.01);
        assertEquals(-273.15, tcService.convertKelvinToC(tc06), 0.01);
        assertEquals(-173.15, tcService.convertKelvinToC(tc07), 0.01);
        assertEquals(-73.15, tcService.convertKelvinToC(tc08), 0.01);
    }

    @Test
    void convertKelvinToFTest() {
        assertEquals(-477.67, tcService.convertKelvinToF(tc05), 0.01);
        assertEquals(-459.67, tcService.convertKelvinToF(tc06), 0.01);
        assertEquals(-279.67, tcService.convertKelvinToF(tc07), 0.01);
        assertEquals(-99.67, tcService.convertKelvinToF(tc08), 0.01);
    }

    @Test
    void convertFahrenheitToCTest() {
        assertEquals(-23.333, tcService.convertFahrenheitToC(tc09), 0.01);
        assertEquals(-17.777, tcService.convertFahrenheitToC(tc10), 0.01);
        assertEquals(37.777, tcService.convertFahrenheitToC(tc11), 0.01);
        assertEquals(93.333, tcService.convertFahrenheitToC(tc12), 0.01);
    }

    @Test
    void convertFahrenheitToKTest() {
        assertEquals(249.817, tcService.convertFahrenheitToK(tc09), 0.01);
        assertEquals(255.372, tcService.convertFahrenheitToK(tc10), 0.01);
        assertEquals(310.928, tcService.convertFahrenheitToK(tc11), 0.01);
        assertEquals(366.483, tcService.convertFahrenheitToK(tc12), 0.01);
    }

}
