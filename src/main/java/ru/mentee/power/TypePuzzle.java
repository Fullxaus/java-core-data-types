package ru.mentee.power;

public class TypePuzzle {

    public static void main(String[] args) {
        System.out.println("=== 1. Сравнение чисел с плавающей точкой ===");
        double a = 0.1 + 0.2;
        double b = 0.3;
        System.out.println("0.1 + 0.2 == 0.3 -> " + (a == b));
        // Почему так? Из-за особенностей хранения double 0.1 и 0.2 представлены не точно,
        // итоговое значение 0.1+0.2 немного отличается от 0.3.
        // Как исправить? Использовать BigDecimal для точной арифметики или сравнивать с некоторой дельтой:
        double epsilon = 1e-10;
        System.out.println("Сравнение с дельтой: " + (Math.abs(a - b) < epsilon));

        System.out.println("\n=== 2. Переполнение byte ===");
        byte by = 127; // максимум для byte
        by += 1;       // переполнение
        System.out.println("byte 127 + 1 = " + by);
        // Почему? byte хранит от -128 до 127, при переполнении происходит "обертка" и значение становится -128
        // Как избежать? Использовать тип с большим диапазоном или проверять переполнение вручную

        System.out.println("\n=== 3. Автоупаковка/распаковка и сравнение объектов ===");
        Integer i1 = 127;
        Integer i2 = 127;
        Integer i3 = 128;
        Integer i4 = 128;
        System.out.println("i1 == i2 -> " + (i1 == i2)); // true, т.к. кэширование Integer от -128 до 127
        System.out.println("i3 == i4 -> " + (i3 == i4)); // false, новые объекты
        // Почему? Java кэширует объекты Integer в диапазоне -128..127 при автоупаковке.
        // Как исправить? Для сравнения значений использовать equals():
        System.out.println("i3.equals(i4) -> " + i3.equals(i4));

        System.out.println("\n=== 4. Неожиданное поведение с char и int ===");
        char c1 = 65;          // символ 'A'
        char c2 = 'A';
        System.out.println("c1 == c2 -> " + (c1 == c2)); // true
        int sum = c1 + c2;     // char автоматически приводятся к int
        System.out.println("c1 + c2 = " + sum);
        // Но char нельзя просто так инкрементировать с помощью литерала:
        // char c3 = c1 + 1; // ошибка компиляции, т.к. c1+1 - int
        char c3 = (char)(c1 + 1); // так правильно
        System.out.println("c1 + 1 как char = " + c3);

        System.out.println("\n=== 5. Странный результат при сложении строк и чисел ===");
        System.out.println("1 + 2 + \"3\" = " + (1 + 2 + "3")); // "33"
        System.out.println("\"1\" + 2 + 3 = " + ("1" + 2 + 3)); // "123"
        // Почему? Операции идут слева направо:
        // 1+2=3, потом "3" + "3" = "33"
        // А вторая строчка сразу строка, все последующие конкатенации со строкой
    }
}
