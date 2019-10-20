package ru.netology.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    @DisplayName("Сумма 0: выбросить исключение")
    void shouldReturn1000IfAmountIs0() {

        /* Сумма покупок 0
        ОР: IllegalArgumentException*/
        CashbackHackService service = new CashbackHackService();
        assertThrows(IllegalArgumentException.class, () -> service.remain(0));
    }

    @Test
    @DisplayName("Сумма 1000: вернуть 0")
    void shouldReturn0IfAmountIs1000() {

        /* Сумма покупок 1000
        ОР: 0 рублей */

        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Сумма 400: вернуть 600")
    void shouldReturn600IfAmountIs400() {

        /* Сумма покупок 400
        ОР: 600 рублей */

        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(400);
        int expected = 600;

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Сумма 1900: вернуть 100")
    void shouldReturn100IfAmountIs1900() {

        /* Сумма покупок 1900
        ОР: 100 рублей */

        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1900);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @DisplayName("Тест с параметрами")
    @CsvFileSource(resources = "/differentValues.csv", numLinesToSkip = 1)
    void parametrizedTest (int amount, int expected) {

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(amount);

        assertEquals(expected, actual);

    }
}