package com.ust.app;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

public class CalculatorTest {

    private Calculator calc;

    @BeforeAll
    public static void init(){
        System.out.println("Testing Begins");
    }

    @AfterAll
    public static void complete(){
        System.out.println("Testing Completed");
    }

    @BeforeEach
    public void setUp(){
        System.out.println("Test Running");
        calc = new Calculator();
    }

    @AfterEach
    public void tearDown(){
        calc = null;
        System.out.println("Test Ends");
    }

    @Test
    @DisabledOnOs(OS.WINDOWS)
    @DisabledOnJre(JRE.JAVA_21)
    public void testAdd() {

        Assertions.assertEquals(30, calc.add(10, 20));
        Assertions.assertEquals(10, calc.add(-10, 20));
        Assertions.assertEquals(0, calc.add(-10, 10));
        Assertions.assertEquals(0, calc.add(0, 0));

    }



    @Nested
    class DivideTest{

        @Test
        public void testDivide(){
            Assertions.assertEquals(10,calc.divide(20,2));
        }

        @Test
        public void testDivideForException() {
            Assertions.assertThrows(
                    ArithmeticException.class,
                    () -> calc.divide(10, 0));


        }
    }

}
