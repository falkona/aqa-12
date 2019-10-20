package ru.netology.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    @DisplayName("Сумма покупок ноль: выбросить исключение")
    void shouldReturn1000IfAmountIs0() {
        CashbackHackService service = new CashbackHackService();

        assertThrows(IllegalArgumentException.class, () -> service.remain(0));
    }

    @Test
    @DisplayName("Сумма покупок 1000: вернуть 0")
    void shouldReturn0IfAmountIs1000() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Сумма покупок 400: вернуть 600")
    void shouldReturn600IfAmountIs400() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(400);
        int expected = 600;

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Сумма покупок 1900: вернуть 100")
    void shouldReturn100IfAmountIs1900() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1900);
        int expected = 100;

        assertEquals(expected, actual);
    }
}