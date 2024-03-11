package SOLID.SingleResponsibility;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Calculator Test")
class CalculatorTest {

    Calculator calculator = new Calculator();

 /* @BeforeAll
  static void setup() {
      System.out.println("@BeforeAll - executes once before all test methods in this class");
  }

  @BeforeEach
    void init() {
      System.out.println("@BeforeEach - executes before each test method in this class");
  }*/


    @Test
    @DisplayName("Test adding two positive numbers")
    void testAddPositiveNumbers() {
        int actual = calculator.add(4, 5);
        int expected = 9;
        assertEquals(expected, actual, "The sum of 4 and 5 should be 9");
    }

    @Test
    @DisplayName("Test adding two negative numbers")
    void testAddNegativeNumbers() {
        int actual = calculator.add(-4, -5);
        int expected = -9;
        assertEquals(expected, actual, "The sum of -4 and -5 should be -9");
    }

    @Test
    @DisplayName("Test Divide by Zero")
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(10,0));
    }


}