

import org.example.Calculator;
import static org.junit.Assert.*;
import org.junit.Test;
import java.math.*;
public class Caltest {
    private static final double DELTA = 1e-15;
    Calculator calculator = new Calculator();

    @Test
    public void squarerootTruePositive(){
        assertEquals("Finding squareroot of two number for True Positive", 5, calculator.squareroot(25), DELTA);
        assertEquals("Finding squareroot of two number for True Positive", 8, calculator.squareroot(64), DELTA);
    }

    @Test
    public void squarerootFalsePositive(){
        assertNotEquals("Finding squareroot of two number for False Positive", 5, calculator.squareroot(23), DELTA);
        assertNotEquals("Finding squareroot of two number for False Positive", 6, calculator.squareroot(37), DELTA);
    }

    @Test
    public void factorialTruePositive(){
        assertEquals("Finding factorial for True Positive", 24, calculator.factorial(4), DELTA);
        assertEquals("Finding factorial for True Positive", 120, calculator.factorial(5), DELTA);
    }

    @Test
    public void factorialFalsePositive(){
        assertNotEquals("Finding factorial for False Positive", 27, calculator.factorial(3), DELTA);
        assertNotEquals("Finding factorial for False Positive", 987, calculator.factorial(6), DELTA);

    }

    @Test
    public void naturallogarithmTruePositive(){
        assertEquals("Finding naturallogarithm for True Positive", 2.30258509299, calculator.naturallogarithm(10), DELTA);
        assertEquals("Finding naturallogarithm for True Positive", 2.7080502011, calculator.naturallogarithm(15), DELTA);
    }

    @Test
    public void naturallogarithmFalsePositive(){
        assertNotEquals("Finding naturallogarithm for False Positive", 11, calculator.naturallogarithm(121), DELTA);
        assertNotEquals("Finding naturallogarithm for False Positive", 3, calculator.naturallogarithm(8), DELTA);

    }


    @Test
    public void powerTruePositive(){
        assertEquals("Finding subtraction of two number for True Positive", 8, calculator.power(2,3), DELTA);
        assertEquals("Finding subtraction of two number for True Positive", 9, calculator.power(3,2), DELTA);
    }

    @Test
    public void powerFalsePositive(){
        assertNotEquals("Finding subtraction of two number for False Positive", 32, calculator.power(2,4), DELTA);
        assertNotEquals("Finding subtraction of two number for False Positive", 78, calculator.power(3,4), DELTA);
    }



}

