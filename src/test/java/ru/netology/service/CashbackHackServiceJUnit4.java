package ru.netology.service;

import org.junit.Test;
import static org.junit.Assert.*;

public class CashbackHackServiceJUnit4 {

    @Test
    public void shouldReturnRemainForAmountLessThan1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expectedRemain = 100;

        int result = service.remain(amount);

        assertEquals("Для суммы 900 должен быть остаток 100", expectedRemain, result);
    }

    @Test
    public void shouldReturnRemainForAmountMoreThan1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1500;
        int expectedRemain = 500;

        int result = service.remain(amount);

        assertEquals("Для суммы 1500 должен быть остаток 500", expectedRemain, result);
    }

    @Test
    public void shouldReturnZeroForAmountExactly1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expectedRemain = 0;

        int result = service.remain(amount);

        // Этот тест должен упасть
        assertEquals("Для суммы 1000 должен быть остаток 0", expectedRemain, result);
    }
}