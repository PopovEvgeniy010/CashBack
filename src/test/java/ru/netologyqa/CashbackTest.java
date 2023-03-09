package ru.netologyqa;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackTest {

    @Test
    public void testRemain() {
        int amount = 900;
        int expected = 100;
        Cashback service = new Cashback();
        int actual = service.remain(amount);
        assertEquals(actual,expected);

    }
    @Test
    public void remain1 () {
        int amount = 1000;
        int expected = 0;
        Cashback service = new Cashback();
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }
}
