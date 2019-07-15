package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

while (true) {                  // цикл для вибору (ще один приклад/вихід з програми)
    Scanner scan = new Scanner(System.in);  //клас сканнер

    Roman r = new Roman();      // об'єкт r класу Roman
    Arab o = new Arab();       // об'єкт o класу Arab


    System.out.println("\tВиберіть систему чилення:\n 1. Римська \n 2. Арабська ");
    int ask = scan.nextInt();    // обираємо систему числення

    switch (ask) {
        case 1:
            r.Znach();              //метод Znach класу Roman
            break;
        case 2:
            o.ArabSystem();               // метод ArabSystem класу Arab
            break;
        default:
            System.out.print("Помилка, виберіть систему числення. 1 - Римська. 2 - Арабська.");
    }
    int exit;
    System.out.println("\nЩе приклад?\n 1 - так\n 2 - ні");
    exit = scan.nextInt();

    if (exit == 2)
    {
        break;
    }                                       // вибираємо, продовжимо працювати з програмою, або виходимо
}


        }
    }

