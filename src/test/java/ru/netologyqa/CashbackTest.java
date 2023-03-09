package ru.netologyqa;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackTest {
        @Test
        public void remain () {
            int amount = 900;
            int expected = 100;
            Cashback service = new Cashback();
            int actual = service.remain(amount);
            assertEquals(expected, actual);
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



