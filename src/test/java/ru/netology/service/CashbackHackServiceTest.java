package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void shouldReturn1000IfAmountIs0() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(0);
        int expected = 1000;

        assertEquals(expected, actual);
    }

    @Test
    void shouldReturn0IfAmountIs1000() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void shouldReturn600IfAmountIs400() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(400);
        int expected = 600;

        assertEquals(expected, actual);
    }

    @Test
    void shouldReturn100IfAmountIs1900() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1900);
        int expected = 100;

        assertEquals(expected, actual);
    }
}