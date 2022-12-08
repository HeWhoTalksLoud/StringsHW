import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        task1();
        System.out.println();

        task2();
        System.out.println();

        task3();
        System.out.println();

        task4();
        System.out.println();

        task5();
        System.out.println();

        task6();
        System.out.println();

        task7();
        System.out.println();


    }

    public static void task1() {

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";

        System.out.println("ФИО сотрудника - " + lastName + " " + firstName + " " +
                middleName);

    }

    public static void task2() {

        String fullName = "Ivanov Ivan Ivanovich";

        System.out.println("Данные ФИО сотрудника для заполнения отчета - " +
                fullName.toUpperCase());

    }

    public static void task3() {

        String fullName = "Иванов Семён Семёнович";

        System.out.println("Данные ФИО сотрудника - " +
                fullName.replace('ё', 'е'));

    }

    public static void task4() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя:");
        String name = scanner.nextLine();
        System.out.println("Привет, " + name);

    }

    public static void task5() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите температуру:");
        int t = scanner.nextInt();
        System.out.println("Температура воздуха сегодня: " + t +
                " градусов");

    }

    public static void task6() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите день:");
        int d = scanner.nextInt();
        System.out.println("Введите месяц (номер):");
        int m = scanner.nextInt();
        System.out.println("Введите год:");
        int y = scanner.nextInt();
        System.out.printf("%02d:%02d:%d%n", d, m, y);


    }

    public static void task7() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя пользователя:");
        String userName = scanner.nextLine();
        System.out.println("Введите имя помощника:");
        String helperName = scanner.nextLine();
        System.out.println("Введите количество сообщений:");
        int lettersNumber = scanner.nextInt();
        System.out.println("Привет, " + userName + ". Это твой помощник " +
                helperName + ".");
        System.out.println("У тебя " + lettersNumber + " новых сообщений.");

    }
}