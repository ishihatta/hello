package com.ishihata_tech.hello;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void janken_calc() {
        assertEquals(Main.janken_calc(0, 0), 0);
        assertEquals(Main.janken_calc(0, 1), 1);
        assertEquals(Main.janken_calc(0, 2), 2);

        assertEquals(Main.janken_calc(1, 0), 2);
        assertEquals(Main.janken_calc(1, 1), 0);
        assertEquals(Main.janken_calc(1, 2), 1);

        assertEquals(Main.janken_calc(2, 0), 1);
        assertEquals(Main.janken_calc(2, 1), 2);
        assertEquals(Main.janken_calc(2, 2), 0);
    }
}