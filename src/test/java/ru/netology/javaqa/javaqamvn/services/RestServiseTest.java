package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
public class RestServiseTest {
    @ParameterizedTest
void calculateForMinIncome(){
RestService service = new RestService();

int income = 10_000;
int expenses = 5_000;
int treshold = 15_000;

int actual = service.calculate(income, expenses, treshold);
    }
}
