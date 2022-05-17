package it.isa.tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.stream;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

//import java.util.concurrent.locks.Condition;
//import static org.junit.Assert.assertTrue;
//import org.junit.Test;

/**
 * Unit test for simple App.
 */
@TestInstance(Lifecycle.PER_CLASS)
@Disabled
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        System.out.println("Eseguo metodo TRUE");
        assertTrue( true );
    }

    @BeforeAll
    public void shouldAnswerWithBeforeAll() {
        System.out.println("Before All");
    }

    @BeforeEach
    public void shouldAnswerWithBeforeEach() {
        System.out.println("Before Each"); 
    }

    @Test
    public void shouldAnswerWithFalse() {
        System.out.println("eseguo metodo FALSE");
        assertFalse( false );
    }

    @Test
    @Disabled
    @Timeout(value = 1, unit = TimeUnit.SECONDS)
    public void shouldSleep() {
        System.out.println("Start sleeping");
        try {
            TimeUnit.SECONDS.sleep(2);
            System.out.println("Waking up");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
