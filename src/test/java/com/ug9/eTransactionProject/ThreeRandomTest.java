package com.ug9.eTransactionProject;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class ThreeRandomTest {

    @DisplayName("helloYou passing in Blank")
    @Test
    void Should_ReturnStringHelloBlank_When_GivenBlank () {
        String expects = "Hello Blank";
        String received = ThreeRandoms.helloYou("Blank");
        assertEquals(expects, received);
    }

    @DisplayName("countDogs no dogs in string")
    @Test
    void Should_ReturnZero_When_NoDogInString () {
        int count = ThreeRandoms.countDogs("cat cat catcat");
        assertEquals(0, count);
    }

    @DisplayName("countDogs dog at end of string")
    @Test
    void Should_Return1_When_DogAtEndOfString () {
        int count = ThreeRandoms.countDogs("cat cat catcatdog");
        assertEquals(1, count);
    }

    @DisplayName("flipFlop both same sign")
    @Test
    void Should_ReturnFalse_When_BothIntsSameSign () {
        ThreeRandoms t = new ThreeRandoms ();
        boolean result = t.flipFlop(-9, -7);
        assertFalse(result);
    }

    @DisplayName("flipFlop different signs")
    @Test
    void Should_ReturnTrue_When_BothIntsDiffSign () {
        ThreeRandoms t = new ThreeRandoms ();
        boolean result = t.flipFlop(9, -7);
        assertTrue(result);
    }

}