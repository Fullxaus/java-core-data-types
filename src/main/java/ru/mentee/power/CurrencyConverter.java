package ru.mentee.power;

public class CurrencyConverter {

    // Курс валют к рублю (примерные значения)
    public static final double USD_TO_RUB = 74.25;
    public static final double EUR_TO_RUB = 88.50;
    public static final double CNY_TO_RUB = 11.30;

    // Суммы в различных валютах
    public static double usdAmount = 100.0;
    public static double eurAmount = 50.0;
    public static double cnyAmount = 200.0;

    public static void main(String[] args) {

        // Конвертация в рубли
        double rubFromUsd = usdAmount * USD_TO_RUB;
        double rubFromEur = eurAmount * EUR_TO_RUB;
        double rubFromCny = cnyAmount * CNY_TO_RUB;

        // Конвертация рубли в доллары
        double rubAmount = 10000.0;
        double usdFromRub = rubAmount / USD_TO_RUB;

        // Демонстрация проблемы точности с double
        double a = 0.1;
        double b = 0.2;
        double sum = a + b;
        boolean equal = (sum == 0.3);

        // Вывод результатов
        System.out.println("Конвертация валют в рубли:");
        System.out.println(usdAmount + " USD = " + rubFromUsd + " RUB");
        System.out.println(eurAmount + " EUR = " + rubFromEur + " RUB");
        System.out.println(cnyAmount + " CNY = " + rubFromCny + " RUB");

        System.out.println("\nКонвертация рублей в доллары:");
        System.out.println(rubAmount + " RUB = " + usdFromRub + " USD");

        System.out.println("\nДемонстрация проблемы точности double:");
        System.out.println("0.1 + 0.2 = " + sum);
        System.out.println("Сравнение (0.1 + 0.2) == 0.3: " + equal);
        System.out.println("Объяснение: из-за особенностей представления double точное равенство не выполняется.");
    }
}
