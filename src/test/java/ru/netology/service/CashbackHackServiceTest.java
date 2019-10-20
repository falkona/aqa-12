package ru.netology.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    @DisplayName("����� ������� ����: ��������� ����������")
    void shouldReturn1000IfAmountIs0() {

        /* ������� ������ � �������� � ���� ����� 0
        ��: IllegalArgumentException*/
        CashbackHackService service = new CashbackHackService();
        assertThrows(IllegalArgumentException.class, () -> service.remain(0));
    }

    @Test
    @DisplayName("����� ������� 1000: ������� 0")
    void shouldReturn0IfAmountIs1000() {

        /* ������� ������ � �������� � ���� ����� 1000
        ��: 0 ������ */

        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("����� ������� 400: ������� 600")
    void shouldReturn600IfAmountIs400() {

        /* ������� ������ � �������� � ���� ����� 400
        ��: 600 ������ */

        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(400);
        int expected = 600;

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("����� ������� 1900: ������� 100")
    void shouldReturn100IfAmountIs1900() {

        /* ������� ������ � �������� � ���� ����� 1900
        ��: 100 ������ */

        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1900);
        int expected = 100;

        assertEquals(expected, actual);
    }
}