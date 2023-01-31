package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void ShouldReturnSumIfRemainExists() {
        int amount = 900;
        CashbackHackService service = new CashbackHackService();

        int expected = 100;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void ShouldReturn0IfNoRemain() {
        int amount = 1000;
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }
}