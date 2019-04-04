package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        task1();

    }

    private static void task1()
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int type, ch1 ,k1,k2, ch2, i = 3, j =3, step = 0;
        char user1, user2;
        boolean game = false;
        String name1, name2, x = "X", o = "O";
        //
        System.out.println("Добро пожаловать в игру! \n" );
        System.out.println("Введите Ваше имя: ");
        name1 = scanner.next();
        String[][] field = new String[i][j];
        for (i =0; i<3; i++)
        {
            for (j = 0; j <3; j++)
            {
                field[i][j] = " ";

            }
        }
        System.out.println(
                "Выберите тип игры: \n " +
                        "1 - игра с компьютером; \n" +
                        "2 - игра с человеком; ");

        type = scanner.nextInt();
        if (type == 1)
        {
            System.out.println("Вы будете играть против компьютера. \n" +
                    "Выберите за кого играть: \n" +
                    "1 - крестики;\n" +
                    "2 - нолики.");
            ch1 = scanner.nextInt();

            if (ch1 == 2)
            {

                System.out.println("Вы играете за нолики. \n" +
                        "Вы ходите первыми.");
                for (int k = 0; k < 9; k++)
                {



                    System.out.println("Введите координаты:");
                    k1 = scanner.nextInt();
                    k2 = scanner.nextInt();
                    if (k1 > field.length-1 || k2 > field.length-1)
                    {
                        System.out.println("Неверные координаты!!!");
                        continue;
                    }
                    if (field[k1][k2] == " ")
                    {
                        field[k1][k2] = o;
                        System.out.println(
                                " __  __  __ \n" +
                                        "|" + field[0][0] + " | " + field[0][1] + " | " + field[0][2] + " | \n" +
                                        " __  __  __ \n" +
                                        "|" + field[1][0] + " | " + field[1][1] + " | " + field[1][2] + " | \n" +
                                        " __  __  __ \n" +
                                        "|" + field[2][0] + " | " + field[2][1] + " | " + field[2][2] + " | \n" +
                                        " __  __  __ \n"
                        );
                    }

                    else
                    {
                        System.out.println("Эта клетка уже занята!");
                        k--;
                        continue;
                    }

                    if (field[0][0] == field[0][1] && field[0][1] == field[0][2] && field[0][0] == o
                    ||  field[1][0] == field[1][1] && field[1][1] == field[1][2] && field[1][0] == o
                    ||  field[2][0] == field[2][1] && field[2][1] == field[2][2] && field[2][0] == o
                    ||  field[0][0] == field[1][0] && field[1][0] == field[2][0] && field[0][0] == o
                    ||  field[0][1] == field[1][1] && field[1][1] == field[2][1] && field[0][1] == o
                    ||  field[0][2] == field[1][2] && field[1][2] == field[2][2] && field[0][2] == o
                    ||  field[0][0] == field[1][1] && field[1][1] == field[2][2] && field[0][0] == o
                    ||  field[0][2] == field[1][1] && field[1][1] == field[2][0] && field[2][0] == o)
                    {
                        System.out.println("Поздравляю!!! Вы победили!!!");
                        break;
                    } else
                    {
                        if (field[0][0] == field[0][1] && field[0][1] == field[0][2] && field[0][0] == x
                        ||  field[1][0] == field[1][1] && field[1][1] == field[1][2] && field[1][0] == x
                        ||  field[2][0] == field[2][1] && field[2][1] == field[2][2] && field[2][0] == x
                        ||  field[0][0] == field[1][0] && field[1][0] == field[2][0] && field[0][0] == x
                        ||  field[0][1] == field[1][1] && field[1][1] == field[2][1] && field[0][1] == x
                        ||  field[0][2] == field[1][2] && field[1][2] == field[2][2] && field[0][2] == x
                        ||  field[0][0] == field[1][1] && field[1][1] == field[2][2] && field[0][0] == x
                        ||  field[0][2] == field[1][1] && field[1][1] == field[2][0] && field[2][0] == x)
                        {
                            System.out.println("Победил компьютер!");
                            break;
                        }
                    }
                    System.out.println("Ходит компьютер!");
                    step1:
                    k1 = random.nextInt(3);
                    k2 = random.nextInt(3);
                    System.out.println(k1 + " " + k2);
                    if (field[k1][k2] == " ")
                    {

                        field[k1][k2] = x;
                        System.out.println(
                                " __  __  __ \n" +
                                        "|" + field[0][0] + " | " + field[0][1] + " | " + field[0][2] + " | \n" +
                                        " __  __  __ \n" +
                                        "|" + field[1][0] + " | " + field[1][1] + " | " + field[1][2] + " | \n" +
                                        " __  __  __ \n" +
                                        "|" + field[2][0] + " | " + field[2][1] + " | " + field[2][2] + " | \n" +
                                        " __  __  __ \n"
                        );
                    }



                }

            }
            if (ch1 == 1)
            {

                System.out.println("Вы играете за крестики. \n" +
                        "Вы ходите первыми.");
                for (int k = 0; k < 9; k++)
                {



                    System.out.println("Введите координаты:");
                    k1 = scanner.nextInt();
                    k2 = scanner.nextInt();
                    if (k1 > field.length-1 || k2 > field.length-1)
                    {
                        System.out.println("Неверные координаты!!!");
                        continue;
                    }
                    if (field[k1][k2] == " ")
                    {
                        field[k1][k2] = x;
                        System.out.println(
                                " __  __  __ \n" +
                                        "|" + field[0][0] + " | " + field[0][1] + " | " + field[0][2] + " | \n" +
                                        " __  __  __ \n" +
                                        "|" + field[1][0] + " | " + field[1][1] + " | " + field[1][2] + " | \n" +
                                        " __  __  __ \n" +
                                        "|" + field[2][0] + " | " + field[2][1] + " | " + field[2][2] + " | \n" +
                                        " __  __  __ \n"
                        );
                    }

                    else
                    {
                        System.out.println("Эта клетка уже занята!");
                        k--;
                        continue;
                    }

                    if (field[0][0] == field[0][1] && field[0][1] == field[0][2] && field[0][0] == x
                            ||  field[1][0] == field[1][1] && field[1][1] == field[1][2] && field[1][0] == x
                            ||  field[2][0] == field[2][1] && field[2][1] == field[2][2] && field[2][0] == x
                            ||  field[0][0] == field[1][0] && field[1][0] == field[2][0] && field[0][0] == x
                            ||  field[0][1] == field[1][1] && field[1][1] == field[2][1] && field[0][1] == x
                            ||  field[0][2] == field[1][2] && field[1][2] == field[2][2] && field[0][2] == x
                            ||  field[0][0] == field[1][1] && field[1][1] == field[2][2] && field[0][0] == x
                            ||  field[0][2] == field[1][1] && field[1][1] == field[2][0] && field[2][0] == x)
                    {
                        System.out.println("Поздравляю!!! Вы победили!!!");
                        break;
                    } else
                    {
                        if (field[0][0] == field[0][1] && field[0][1] == field[0][2] && field[0][0] == o
                                ||  field[1][0] == field[1][1] && field[1][1] == field[1][2] && field[1][0] == o
                                ||  field[2][0] == field[2][1] && field[2][1] == field[2][2] && field[2][0] == o
                                ||  field[0][0] == field[1][0] && field[1][0] == field[2][0] && field[0][0] == o
                                ||  field[0][1] == field[1][1] && field[1][1] == field[2][1] && field[0][1] == o
                                ||  field[0][2] == field[1][2] && field[1][2] == field[2][2] && field[0][2] == o
                                ||  field[0][0] == field[1][1] && field[1][1] == field[2][2] && field[0][0] == o
                                ||  field[0][2] == field[1][1] && field[1][1] == field[2][0] && field[2][0] == o)
                        {
                            System.out.println("Победил компьютер!");
                            break;
                        }
                    }
                    System.out.println("Ходит компьютер!");

                    k1 = random.nextInt(3);
                    k2 = random.nextInt(3);
                    System.out.println(k1 + " " + k2);
                    if (field[k1][k2] == " ")
                    {

                        field[k1][k2] = o;
                        System.out.println(
                                " __  __  __ \n" +
                                        "|" + field[0][0] + " | " + field[0][1] + " | " + field[0][2] + " | \n" +
                                        " __  __  __ \n" +
                                        "|" + field[1][0] + " | " + field[1][1] + " | " + field[1][2] + " | \n" +
                                        " __  __  __ \n" +
                                        "|" + field[2][0] + " | " + field[2][1] + " | " + field[2][2] + " | \n" +
                                        " __  __  __ \n"
                        );
                    }



                }

            }
        }
        else if (type == 2)
        {
            System.out.println("Вы будете играть против человека. \n Введите имя второго игрока:" );
            name2 = scanner.next();

            System.out.println( "Выберите за кого играть: \n" +
                    "1 - крестики;\n" +
                    "2 - нолики.");
            ch1 = scanner.nextInt();
            if (ch1 == 1)
            {

                System.out.println("Вы играете за крестики. \n" +
                        "Ходит " + name1);
                for (int k = 0; k < 9; k++)
                {



                    System.out.println("Введите координаты:");
                    k1 = scanner.nextInt();
                    k2 = scanner.nextInt();
                    if (k1 > field.length-1 || k2 > field.length-1)
                    {
                        System.out.println("Неверные координаты!!!");
                        continue;
                    }
                    if (field[k1][k2] == " ")
                    {
                        field[k1][k2] = x;
                        System.out.println(
                                " __  __  __ \n" +
                                        "|" + field[0][0] + " | " + field[0][1] + " | " + field[0][2] + " | \n" +
                                        " __  __  __ \n" +
                                        "|" + field[1][0] + " | " + field[1][1] + " | " + field[1][2] + " | \n" +
                                        " __  __  __ \n" +
                                        "|" + field[2][0] + " | " + field[2][1] + " | " + field[2][2] + " | \n" +
                                        " __  __  __ \n"
                        );
                    }

                    else
                    {
                        System.out.println("Эта клетка уже занята!");
                        k--;
                        continue;
                    }

                    if (field[0][0] == field[0][1] && field[0][1] == field[0][2] && field[0][0] == x
                            ||  field[1][0] == field[1][1] && field[1][1] == field[1][2] && field[1][0] == x
                            ||  field[2][0] == field[2][1] && field[2][1] == field[2][2] && field[2][0] == x
                            ||  field[0][0] == field[1][0] && field[1][0] == field[2][0] && field[0][0] == x
                            ||  field[0][1] == field[1][1] && field[1][1] == field[2][1] && field[0][1] == x
                            ||  field[0][2] == field[1][2] && field[1][2] == field[2][2] && field[0][2] == x
                            ||  field[0][0] == field[1][1] && field[1][1] == field[2][2] && field[0][0] == x
                            ||  field[0][2] == field[1][1] && field[1][1] == field[2][0] && field[2][0] == x)
                    {
                        System.out.println("Поздравляю!!! Вы победили!!!");
                        break;
                    } else
                    {
                        if (field[0][0] == field[0][1] && field[0][1] == field[0][2] && field[0][0] == o
                                ||  field[1][0] == field[1][1] && field[1][1] == field[1][2] && field[1][0] == o
                                ||  field[2][0] == field[2][1] && field[2][1] == field[2][2] && field[2][0] == o
                                ||  field[0][0] == field[1][0] && field[1][0] == field[2][0] && field[0][0] == o
                                ||  field[0][1] == field[1][1] && field[1][1] == field[2][1] && field[0][1] == o
                                ||  field[0][2] == field[1][2] && field[1][2] == field[2][2] && field[0][2] == o
                                ||  field[0][0] == field[1][1] && field[1][1] == field[2][2] && field[0][0] == o
                                ||  field[0][2] == field[1][1] && field[1][1] == field[2][0] && field[2][0] == o)
                        {
                            System.out.println("Победил компьютер!");
                            break;
                        }
                    }
                    System.out.println("Ходит " + name2);

                    k1 = random.nextInt(3);
                    k2 = random.nextInt(3);
                    System.out.println(k1 + " " + k2);
                    if (field[k1][k2] == " ")
                    {

                        field[k1][k2] = o;
                        System.out.println(
                                " __  __  __ \n" +
                                        "|" + field[0][0] + " | " + field[0][1] + " | " + field[0][2] + " | \n" +
                                        " __  __  __ \n" +
                                        "|" + field[1][0] + " | " + field[1][1] + " | " + field[1][2] + " | \n" +
                                        " __  __  __ \n" +
                                        "|" + field[2][0] + " | " + field[2][1] + " | " + field[2][2] + " | \n" +
                                        " __  __  __ \n"
                        );
                    }



                }

            }
            if (ch1 == 2)
            {

                System.out.println("Вы играете за нолики. \n" +
                        "Ходит " + name1);
                for (int k = 0; k < 9; k++)
                {



                    System.out.println("Введите координаты:");
                    k1 = scanner.nextInt();
                    k2 = scanner.nextInt();
                    if (k1 > field.length-1 || k2 > field.length-1)
                    {
                        System.out.println("Неверные координаты!!!");
                        continue;
                    }
                    if (field[k1][k2] == " ")
                    {
                        field[k1][k2] = o;
                        System.out.println(
                                " __  __  __ \n" +
                                        "|" + field[0][0] + " | " + field[0][1] + " | " + field[0][2] + " | \n" +
                                        " __  __  __ \n" +
                                        "|" + field[1][0] + " | " + field[1][1] + " | " + field[1][2] + " | \n" +
                                        " __  __  __ \n" +
                                        "|" + field[2][0] + " | " + field[2][1] + " | " + field[2][2] + " | \n" +
                                        " __  __  __ \n"
                        );
                    }

                    else
                    {
                        System.out.println("Эта клетка уже занята!");
                        k--;
                        continue;
                    }

                    if (field[0][0] == field[0][1] && field[0][1] == field[0][2] && field[0][0] == x
                            ||  field[1][0] == field[1][1] && field[1][1] == field[1][2] && field[1][0] == x
                            ||  field[2][0] == field[2][1] && field[2][1] == field[2][2] && field[2][0] == x
                            ||  field[0][0] == field[1][0] && field[1][0] == field[2][0] && field[0][0] == x
                            ||  field[0][1] == field[1][1] && field[1][1] == field[2][1] && field[0][1] == x
                            ||  field[0][2] == field[1][2] && field[1][2] == field[2][2] && field[0][2] == x
                            ||  field[0][0] == field[1][1] && field[1][1] == field[2][2] && field[0][0] == x
                            ||  field[0][2] == field[1][1] && field[1][1] == field[2][0] && field[2][0] == x)
                    {
                        System.out.println("Поздравляю!!! Вы победили!!!");
                        break;
                    } else
                    {
                        if (field[0][0] == field[0][1] && field[0][1] == field[0][2] && field[0][0] == o
                                ||  field[1][0] == field[1][1] && field[1][1] == field[1][2] && field[1][0] == o
                                ||  field[2][0] == field[2][1] && field[2][1] == field[2][2] && field[2][0] == o
                                ||  field[0][0] == field[1][0] && field[1][0] == field[2][0] && field[0][0] == o
                                ||  field[0][1] == field[1][1] && field[1][1] == field[2][1] && field[0][1] == o
                                ||  field[0][2] == field[1][2] && field[1][2] == field[2][2] && field[0][2] == o
                                ||  field[0][0] == field[1][1] && field[1][1] == field[2][2] && field[0][0] == o
                                ||  field[0][2] == field[1][1] && field[1][1] == field[2][0] && field[2][0] == o)
                        {
                            System.out.println("Победил компьютер!");
                            break;
                        }
                    }
                    System.out.println("Ходит " + name2);

                    System.out.println("Введите координаты:");
                    k1 = scanner.nextInt();
                    k2 = scanner.nextInt();

                    if (field[k1][k2] == " ")
                    {

                        field[k1][k2] = o;
                        System.out.println(
                                " __  __  __ \n" +
                                        "|" + field[0][0] + " | " + field[0][1] + " | " + field[0][2] + " | \n" +
                                        " __  __  __ \n" +
                                        "|" + field[1][0] + " | " + field[1][1] + " | " + field[1][2] + " | \n" +
                                        " __  __  __ \n" +
                                        "|" + field[2][0] + " | " + field[2][1] + " | " + field[2][2] + " | \n" +
                                        " __  __  __ \n"
                        );
                    }



                }

            }
        }
        else
        {
            System.out.println("Ошибка!");
            return;
        }
    }
}
