package main;

import static org.junit.Assert.*;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DartsTest {

        @Test
        public void testDartOutsideTarget() {
            Darts darts = new Darts(-9, 9);
            assertEquals(0, Darts.score());
        }

        @Test
        public void testDartLandsOnBorderOfTarget() {
            Darts darts = new Darts(10, 0);
            assertEquals(1, Darts.score());
        }

        @Test
        public void testDartLandsOnMiddleOfCircle() {
            Darts darts = new Darts(-5, 0);
            assertEquals(5, Darts.score());
        }

        @Test
        public void testDartLandsOnBorderBetweenOutsideAndMiddleCircles() {
            Darts darts = new Darts(0, -1);
            assertEquals(10, Darts.score());
        }

        @Test
        public void testDartLandsInTheInnerCircle() {
            Darts darts = new Darts(0, 0);
            assertEquals(10, Darts.score());
        }

        @Test
        public void nearTheCentre() {
        Darts darts = new Darts(-0.1, -0.1);
        assertEquals(10, Darts.score());
       }

        @Test
        public void justWithinTheInnerCircle() {
            Darts darts = new Darts(0.7, 0.7);
            assertEquals(10, Darts.score());
        }

        @Test
        public void justOutsideTheInnerCircle() {
            Darts darts = new Darts(0.8, -0.8);
            assertEquals(5, Darts.score());
        }

        @Test
        public void justWithinTheMiddleCircle() {
            Darts darts = new Darts(-3.5, 3.5);
            assertEquals(5, Darts.score());
        }

        @Test
        public void justWithinTheOuterTheCircle() {
        Darts darts = new Darts(-7.0, 7.0);
        assertEquals(1, Darts.score());
        }

        @Test
        public void justOutsideTheOuterCircle() {
            Darts darts = new Darts(7.1, -7.1);
            assertEquals(0, Darts.score());
        }

        @Test
        public void AsymmetricPositionBetweenTheInnerAndMiddleCircles() {
            Darts darts = new Darts(0.5, -4);
            assertEquals(5, Darts.score());
        }
}