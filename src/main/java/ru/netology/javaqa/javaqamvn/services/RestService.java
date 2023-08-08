package ru.netology.javaqa.javaqamvn.services;
public class RestService {
    public int calculate(int income, int expenses, int treshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (money >= treshold) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                money = money + income - expenses;
            } else {
                money = (money - expenses) / 3;
            }
        }
        return count;
    }
}
