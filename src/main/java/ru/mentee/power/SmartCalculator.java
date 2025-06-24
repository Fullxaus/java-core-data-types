package ru.mentee.power;

public class SmartCalculator {

    public static void main(String[] args) {

        int intVal1 = 10;
        int intVal2 = 3;
        double doubleVal1 = 5.5;
        float floatVal1 = 2.0f;
        long longVal1 = 1000000000L;

        // 1. Сложение целых чисел
        int sumInt = intVal1 + intVal2;
        // Тип int выбран, т.к. оба операнда целые int
        System.out.println("Сложение int: " + intVal1 + " + " + intVal2 + " = " + sumInt + " (int)");

        // 2. Умножение целого на дробное (int * double)
        double mulMixed = intVal1 * doubleVal1;
        // Результат double, т.к. double является более точным и "широким" типом
        System.out.println("Умножение int на double: " + intVal1 + " * " + doubleVal1 + " = " + mulMixed + " (double)");

        // 3. Деление с правильным выбором результата
        int intDividend = 7;
        int intDivisor = 2;
        if (intDivisor != 0) {
            // Чтобы избежать потери дробной части, используем double в делении
            double divisionResult = (double) intDividend / intDivisor;
            System.out.println("Деление int на int с преобразованием к double: "
                    + intDividend + " / " + intDivisor + " = " + divisionResult + " (double)");
        } else {
            System.out.println("Ошибка: деление на ноль");
        }

        // Особый случай деления на ноль с double
        double doubleDividend = 5.0;
        double doubleDivisor = 0.0;
        if (doubleDivisor != 0) {
            double result = doubleDividend / doubleDivisor;
            System.out.println("Деление double на double: " + doubleDividend + " / " + doubleDivisor + " = " + result);
        } else {
            // В Java деление double на 0.0 даёт Infinity или -Infinity, в зависимости от знака
            double result = doubleDividend / doubleDivisor;
            System.out.println("Деление double на 0.0 даёт: " + result);
        }

        // 4. Возведение в степень с Math.pow
        // Math.pow всегда возвращает double, поэтому результат объявлен как double
        double base = 2.0;
        int exponent = 10;
        double powerResult = Math.pow(base, exponent);
        System.out.println("Возведение в степень: " + base + " ^ " + exponent + " = " + powerResult + " (double)");

        // Демонстрация с типом long - умножение long и int даёт long
        long longMul = longVal1 * intVal2;
        System.out.println("Умножение long на int: " + longVal1 + " * " + intVal2 + " = " + longMul + " (long)");
    }

}
