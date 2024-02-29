package ru.netology.services;
public class CalcService {
    public int calculate (int income, int expenses, int threshold) {
        int money = 0; // количество денег на счету
        int count = 0; // счетчик месяцев отдыха
        for (int month = 0; month < 12; month++) {
            if ( money >= threshold) { // выбираем отдых
                count++; // увеличиваем счетчик месяцев отдыха
                money = (money - expenses) / 3;
            } else { // выбираем работу
                money = money + income - expenses;
            }
        }
        return count;
    }
}

