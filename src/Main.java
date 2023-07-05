import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int salary = 15000;
        int total = 0;
        int month = 0;
        while (total <= 2_459_000) {
            total = total + salary;
            month = month + 1;
            System.out.println("Месяц " + month + ", Cумма накоплений равна " + total + " рублей.");
        }

    }

    public static void task2() {
        System.out.println("Задача 2");
        int number = 1;
        while (number < 10) {
            System.out.print(number);
            number = number + 1;
        }
        System.out.print(number);

        System.out.println();
        for (; number > 0; number--) {
            System.out.print(number);
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int population = 12_000_000;
        int born = 17;
        int death = 8;
        int year = 2023;
        int naturalGrowth = born - death;
        for (; year <= 2033; year++) {
            System.out.println("Год " + year + ", численность населения составляет " + population);
            population += population * naturalGrowth / 1000;
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int deposit = 15000;
        int i = 0;
        for (; deposit <= 12000000; ) {
            System.out.println("Месяц " + i + ", сумма накоплений равна " + deposit + " рублей.");
            i++;
            deposit = deposit + deposit / 100 * 7;
        }
        System.out.println("Месяц " + i + ", сумма накоплений равна " + deposit + " рублей.");
    }

    public static void task5() {
        System.out.println("Задача 5");
        int deposit = 15000;
        int i = 0;
        for (; deposit <= 12000000; ) {
            i++;
            deposit = deposit + deposit / 100 * 7;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + deposit + " рублей.");
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int deposit = 15000;
        int i = 1;
        int monthIn9Year = i * 12 * 9;
        for (; i <= monthIn9Year; ) {
            i++;
            deposit = deposit + deposit / 100 * 7;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + deposit + " рублей.");
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int friday = 5;
        while (friday <= 31) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
            friday = friday + 7;
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int year = 0;
        int pastYear = 1823;
        int futureYear = 2123;
        while (year <= futureYear) {
            year++;
            if (year % 79 == 0 && pastYear <= year && year <= futureYear) {
                System.out.println(year);
            }
        }
    }
}