package za.ac.cput.ADP372s_Assignment1_2021;

import org.junit.jupiter.api.*;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Student Name: Ian Louw
 * Student Number: 216250773
 */

class TDDTest {

    private TDDTest identity1;
    private TDDTest identity2;
    private TDDTest identity3;
    private TDDTest identity4;


    @BeforeEach
    void setUp(){

        identity1 = new TDDTest();
        identity2 = new TDDTest();
        identity3 = new TDDTest();
        identity4 = identity3;

    }


    @Test
    @DisplayName("This displays object equality")
    void objectEquality(){

        assertEquals(identity1, identity1);
        System.out.println("Objects are equal!");
    }


    @Test
    @DisplayName("This displays object identity")
    void objectIdentity(){

        assertSame(identity3, identity4);
        System.out.println("Objects are identical");

    }


    @Test
    @DisplayName("This displays a failed test")
    void failingTest(){

        fail("This test failed");
        assertNotSame(identity1, identity2);

    }


    @Test
    @DisplayName("This displays a TimeOut")
    void testTimeOut() {

        assertTimeout(Duration.ofMillis(100), () -> {
            Thread.sleep(2000);

            System.out.println("Test Timed out");
        });
    }


    @Test
    @Disabled("This displays a failed test")
    void disablingTest() {

        assertEquals(identity1,identity2);
        System.out.println("Not yet implemented");
    }

}