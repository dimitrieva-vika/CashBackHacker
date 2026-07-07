package ru.netology.service;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class CashbackHackServiceTestNG {

    @Test
    public void shouldReturnRemainForAmountLessThan1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expectedRemain = 100;

        int result = service.remain(amount);

        assertEquals(result, expectedRemain, "Для суммы 900 должен быть остаток 100");
    }

    @Test
    public void shouldReturnRemainForAmountMoreThan1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1500;
        int expectedRemain = 500;

        int result = service.remain(amount);

        assertEquals(result, expectedRemain, "Для суммы 1500 должен быть остаток 500");
    }

    @Test
    public void shouldReturnZeroForAmountExactly1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expectedRemain = 0;

        int result = service.remain(amount);

        // Этот тест должен упасть
        assertEquals(result, expectedRemain, "Для суммы 1000 должен быть остаток 0");
    }
}