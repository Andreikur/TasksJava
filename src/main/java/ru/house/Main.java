package ru.house;


import java.util.Scanner;


// Решение задач с сайта https://code.mu/ru/java/tasker/stager/
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        //уровень 1
        /*
        String str;
        str = sc.next();
        System.out.println("Строка: " + str);
        System.out.println("Имеет длину " + str.length() + " символов.");
        System.out.println("Последний символ в строке: " + str.charAt(str.length()-1));
        */

        //Уровень 2
        /*Integer number;
        number = sc.nextInt();
        System.out.println("Введено число: " + number);
        String str = number.toString();
        int number1;
        int number2;
        number1 = Character.getNumericValue(str.charAt(0));
        number2 = Character.getNumericValue(str.charAt(str.length()-1));
        System.out.println("Первая цифра данного числа: " + str.charAt(0));
        System.out.println("последняя цифра данного числа: " + str.charAt(str.length()-1));
        number = number1 + number2;
        System.out.println("Сумма первой и последней цифр данного числа: " + number);
        System.out.println("Колличество чисел в числе: " + str.length());
        */


        String str;
        String strOut;
        WorkingWithStrings wws = new WorkingWithStrings();

        str = sc.next();
        System.out.println("Строка: " + str);
        wws.stringParameters(str);
        str = wws.flipTheLine(str);
        System.out.println("Перевернутая строка: " + str);


        sc.close();
    }
}