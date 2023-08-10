package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RestServiceTest {
    @Test
    public void calculateForMinIncome() {
        RestService service = new RestService();

        int actual = service.calculate(10000, 3000, 20000);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }
}
