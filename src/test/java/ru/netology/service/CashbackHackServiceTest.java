package ru.netology.service;

import org.junit.Assert;   ///Asserts расположены в классе org.testng.Assert. Обратите внимание: в TestNG принято actual, expected вместо expected, actual
import org.junit.Test; ///Аннотация @Test должна иметь Fully Qualified Name org.testng.annotations.Tes

public class CashbackHackServiceTest {

    @Test
    public void testCashbackHackService900() {
        CashbackHackService service = new CashbackHackService();
        int result = service.remain(900);
        Assert.assertEquals(100, result);
    }

    @Test
    public void testCashbackHackService1000() {
        CashbackHackService service = new CashbackHackService();
        int result = service.remain(1000);
        Assert.assertEquals(0, result); ///ОШИБКА при покупке на 1000 не должно выводиться купите еще на 1000
    }
    @Test
    public void testCashbackHackService1100() {
        CashbackHackService service = new CashbackHackService();
        int result = service.remain(1100);
        Assert.assertEquals(900, result);
    }

    @org.junit.jupiter.api.Test
    public void testCashbackHackServiceJupiterApi() {
        CashbackHackService service = new CashbackHackService();
        int result = service.remain(900);
        Assert.assertEquals(100, result);
    }
    @org.junit.jupiter.api.Test
    public void testCashbackHackService1000JupiterApi() {
        CashbackHackService service = new CashbackHackService();
        int result = service.remain(1000);
        Assert.assertEquals(0, result);
    }
    @org.junit.jupiter.api.Test
    public void testCashbackHackService1100JupiterApi() {
        CashbackHackService service = new CashbackHackService();
        int result = service.remain(1100);
        Assert.assertEquals(900, result);
    }




}

