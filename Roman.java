package com.company;

import java.util.Scanner;

public class Roman {

    public static void Znach () {
        Scanner vvod = new Scanner(System.in);      // клас сканер

        String first;                              // строка для 1-го числа
        String second;                            // строка для 2-го числа
        boolean retVal;                          // булеве поле

        System.out.print("Введіть перше число (від I до X): ");
        first = vvod.nextLine();                  //вводимо перше число

        if ((retVal = first.equals("1")) || (retVal = first.equals("2"))|| (retVal = first.equals("3")) || (retVal = first.equals("4"))|| (retVal = first.equals("5"))|| (retVal = first.equals("6"))|| (retVal = first.equals("7"))|| (retVal = first.equals("8"))|| (retVal = first.equals("9"))|| (retVal = first.equals("10")))
// перевіряємо, чи містить перше строка в собі числа з десяткової системи (для виключення виразів типу "2 + II")

        {
            System.out.println("Помилка, введіть число від I до X.");
            return;                                 // якщо містить числа від 0 до 10 – помилка
        }

        switch (first) {                            // визначаємо римські цифри, як арабські в строку "I" ("i") = "1"
            case "I":
            case "i":
                first = "1";
                break;
            case "II":
            case"ii":
                first = "2";
                break;
            case "III":
            case"iii":
                first = "3";
                break;
            case "IV":
            case"iv":
                first = "4";
                break;
            case "V":
            case"v":
                first = "5";                        // визначаємо римські цифри, як арабські в строку "I" ("i") = "1"
                break;
            case "VI":
            case"vi":
                first = "6";
                break;
            case "VII":
            case "vii":
                first = "7";
                break;
            case "VIII":
            case "viii":
                first = "8";
                break;
            case "IX":
            case "ix":
                first = "9";                        // визначаємо римські цифри, як арабські в строку "I" ("i") = "1"
                break;
            case "X":
            case "x":
                first = "10";
                break;
        }

        int a = Integer.parseInt(first);            // перше число з Roman переводимо в Арабську (String = int)

        if(a<=0 || a>10) {
            System.out.println("Введіть число, від I до X");
            return;
        }                                           // перевіряємо чи число більше 0 та менше 10


        System.out.print("Введіть друге число (від I до X): ");
        second = vvod.nextLine();                   //вводимо друге число

        boolean retval2;
        if ((retval2 = second.equals("1")) || (retval2 = second.equals("2"))|| (retval2 = second.equals("3")) || (retval2 = second.equals("4"))|| (retval2 = second.equals("5"))|| (retval2 = second.equals("6"))|| (retval2 = second.equals("7"))|| (retval2 = second.equals("8"))|| (retval2 = second.equals("9"))|| (retval2 = second.equals("10")))

// перевіряємо, чи містить перше строка в собі числа з десяткової системи (для виключення виразів типу "2 + II")
        {
            System.out.println("Помилка, введіть число від I до X.");
            return;                                 // якщо містить числа від 0 до 10 – помилка
        }

        switch (second) {                           // визначаємо римські цифри, як арабські в строку "I" ("i") = "1"
            case "I":
            case "i":
                second = "1";
                break;
            case "II":
            case"ii":
                second = "2";
                break;
            case "III":
            case"iii":
                second = "3";
                break;
            case "IV":
            case"iv":
                second = "4";
                break;
            case "V":
            case"v":
                second = "5";                       // визначаємо римські цифри, як арабські в строку "I" ("i") = "1"
                break;
            case "VI":
            case"vi":
                second = "6";
                break;
            case "VII":
            case "vii":
                second = "7";
                break;
            case "VIII":
            case "viii":
                second = "8";
                break;
            case "IX":
            case "ix":
                second = "9";                        // визначаємо римські цифри, як арабські в строку "I" ("i") = "1"
                break;
            case "X":
            case "x":
                second = "10";
                break;
        }

        int b = Integer.parseInt(second);        // друге число з Roman переводимо в Арабську (String = int)

        if(b<=0 || b>10) {
            System.out.println("Помилка, введіть число, від I до X");
            return;
        }                                         // перевіряємо чи число більше 0 та менше 10

        System.out.println("Виберіть операцію, яку потрібно виконати:\n 1. Додавання\n 2. Віднімання\n 3. Ділення\n 4. Множення ");

            int operac = vvod.nextInt();            // обираємо операцію 1 - 4
        switch (operac) {
            case 1:
                System.out.print("ВІДПОВІДЬ: ");
                System.out.println(a+b);
                break;
            case 2:
                System.out.print("ВІДПОВІДЬ: ");
                System.out.println(a-b);
                break;
            case 3:
                System.out.println("ВІДПОВІДЬ: " + a/b);
                break;
            case 4:
                System.out.println("ВІДПОВІДЬ: " + a*b);
                break;
                default:
                    System.out.println("Помилка, оберіть операцію:\n 1. Додавання\n 2. Віднімання\n 3. Ділення\n 4. Множення");

        }
        }
    }
