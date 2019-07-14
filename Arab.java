package com.company;

import java.util.Scanner;

public class Arab {

    public static void ArabSystem () {
        Scanner scan = new Scanner(System.in);   // клас сканер

        System.out.println("Введіть перше число, (від 0 до 10): ");
        int a = scan.nextInt();                    // вводимо 1-ше число від 0 до 10

        if (a<0 || a>10) {
            System.out.println("Помилка, введіть число від 0 до 10");
            return;                                 // перевіряємо, щоб воно було <0 та >10
        }

        System.out.println("Введіть друге число, (від 0 до 10): ");
        int b = scan.nextInt();                     // вводимо 2-ге число від 0 до 10

        if (b<0 || b>10) {
            System.out.println("Помилка, введіть число від 0 до 10");
            return;                                 // перевіряємо, щоб воно було <0 та >10

        }
            System.out.println("Виберіть операцію, яку потрібно виконати:\n 1. Додавання\n 2. Віднімання\n 3. Ділення\n 4. Множення ");

                    int c = scan.nextInt();           // обираємо математичну операцію

                    switch (c) {
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
                            System.out.println("Помилка, виберіть операцію: \n1. Додавання \n2. Віднімання \n3. Ділення \n4. Множення");
            }
        }

    }
