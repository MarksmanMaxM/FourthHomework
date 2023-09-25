import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    // Задание 1


        byte clientOS = 1;

        if (clientOS == 1)
            System.out.println("Установите версию приложения для Android по ссылке");
        else System.out.println("Установите версию приложения для iOS по ссылке");

        // Задание 2

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год производства устройства:");
        int clientDeviceYear = scanner.nextInt();
        String message = clientDeviceYear < 2015 ? "Light" : "";
        String messageOs = clientOS == 1 ? "Android" : "iOs";
        System.out.printf("Установите версию приложения %s для %s по ссылке \n", message, messageOs);

        // Задание 3


        System.out.println("Введите год:");
        int year = scanner.nextInt();
        if (year % 4 == 0 && year > 1584 && (year % 100 != 0 || year % 400 == 0))
            System.out.println("Год високосный!");
        else if (year > 1584) System.out.println("Год не високосный!");
        else System.out.println("В это время високосные годы не были введены!");

        // Задание 4
        System.out.println("Введите расстояние до клиента:");
        int deliveryDistance = scanner.nextInt();
        int days = 1;
        if (deliveryDistance > 20 && deliveryDistance <= 60)
            days = 2;
        else if (deliveryDistance > 60 && deliveryDistance < 100)
            days = 3;
        else if (deliveryDistance > 100)
            days = 4;

        System.out.printf("Потребуется %d дней  для доставки \n", days);

        // Задание 5
        System.out.println("Введите номер месяца:");
        int monthNumber = scanner.nextInt();
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Это зимний месяц!");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Это весенний месяц!");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Это летний месяц!");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Это осенний месяц!");
                break;
            default:
                System.out.println("Такого месяца нет!");
        }


    }
}