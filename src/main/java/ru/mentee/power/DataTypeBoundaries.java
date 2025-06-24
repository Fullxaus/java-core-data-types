package ru.mentee.power;

public class DataTypeBoundaries {

    public static void main(String[] args) {
        // Вывод минимальных и максимальных значений для числовых примитивных типов
        System.out.println("byte: от " + Byte.MIN_VALUE + " до " + Byte.MAX_VALUE);
        System.out.println("short: от " + Short.MIN_VALUE + " до " + Short.MAX_VALUE);
        System.out.println("int: от " + Integer.MIN_VALUE + " до " + Integer.MAX_VALUE);
        System.out.println("long: от " + Long.MIN_VALUE + " до " + Long.MAX_VALUE);
        System.out.println("float: от " + Float.MIN_VALUE + " до " + Float.MAX_VALUE);
        System.out.println("double: от " + Double.MIN_VALUE + " до " + Double.MAX_VALUE);

        // Демонстрация переполнения на примере byte
        byte maxByte = Byte.MAX_VALUE; // 127
        System.out.println("\nМаксимальное значение byte: " + maxByte);
        byte overflowByte = (byte) (maxByte + 1);
        System.out.println("Результат maxByte + 1 (переполнение): " + overflowByte);
        // Здесь значение "переключается" на минимальное, т.е. -128
    }

}
