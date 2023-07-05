// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task1();


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
}