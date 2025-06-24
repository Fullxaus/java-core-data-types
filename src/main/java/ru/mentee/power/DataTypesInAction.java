package ru.mentee.power;

public class DataTypesInAction {

    public static void main(String[] args) {
        // 1. Создание переменных различных типов
        int intVal = 7;
        int intVal2 = 3;
        double doubleVal = 2.5;
        float floatVal = 3.14f;
        byte byteVal = 120;
        short shortVal = 30000;
        long longVal = 1000000000L;
        boolean boolVal1 = true;
        boolean boolVal2 = false;
        char charVal = 'A';


        // 2. Деление целых чисел (деление с отбрасыванием дробной части)
        int intDiv = intVal / intVal2; // 7 / 3 = 2

        // 3. Деление целого на число с плавающей точкой (приводит к double)
        double mixedDiv = intVal / doubleVal; // 7 / 2.5 = 2.8

        // 4. Явное приведение типов
        int castToInt = (int) doubleVal; // 2.5 → 2 (отбрасывание дробной части)
        byte castToByte = (byte) 130;    // 130 выходит за диапазон byte (от -128 до 127), происходит "переполнение"
        char castToChar = (char) 65;     // число 65 преобразован в 'A'

        // 5. Автоматическое повышение типа при операциях
        // byte + short → int, byte + int → int, int + long → long и т.д.
        int sumInt = byteVal + shortVal;   // byte + short → int
        long sumLong = intVal + longVal;   // int + long → long

        // 6. Операции с boolean
        boolean boolAnd = boolVal1 && boolVal2; // false
        boolean boolOr = boolVal1 || boolVal2;  // true
        boolean boolNot = !boolVal1;             // false

        // 7. Работа с char и их кодами
        int charCode = charVal;          // преобразование char 'A' в его код 65
        char nextChar = (char) (charVal + 1); // следующий символ 'B'

        // Вывод результатов
        System.out.println("Деление целых чисел (7 / 3) = " + intDiv +
                " (дробная часть отбрасывается)");

        System.out.println("Деление int на double (7 / 2.5) = " + mixedDiv);

        System.out.println("Явное приведение double 2.5 к int = " + castToInt);
        System.out.println("Явное приведение int 130 к byte (переполнение) = " + castToByte);
        System.out.println("Явное приведение int 65 к char = " + castToChar);

        System.out.println("Автоматическое повышение типа (byte + short) = " + sumInt);
        System.out.println("Автоматическое повышение типа (int + long) = " + sumLong);

        System.out.println("Операции с boolean: true && false = " + boolAnd);
        System.out.println("Операции с boolean: true || false = " + boolOr);
        System.out.println("Операции с boolean: !true = " + boolNot);

        System.out.println("Код символа 'A' = " + charCode);
        System.out.println("Следующий символ после 'A' = " + nextChar);
    }
}
