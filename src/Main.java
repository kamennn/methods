public class Main {
    public static int deliveryDistance() {
        int deliveryDistance;
        return deliveryDistance = 70;
    }

    public static int phoneVersion() {
        int phoneVersion;
        return phoneVersion = 1;
    }

    public static int clientDeviceYear() {
        int deviceYear;
        return deviceYear = 2014;
    }

    public static boolean checkPhoneVersionAndYear(int phoneVersion, int clientDeviceYear) {
        if (phoneVersion == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (phoneVersion == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (phoneVersion == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (phoneVersion == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        return true;
    }

    public static int subtractedYear() {
        int year;
        return year = 2023;
    }

    public static boolean leapYearCalculation(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static void main(String[] args) {
        if (leapYearCalculation(subtractedYear())) {
            System.out.println(subtractedYear() + " является високосным");
        } else {
            System.out.println(subtractedYear() + " не является високосным");
        }
        //вторая задача
        if (phoneVersion() == 0 && clientDeviceYear() >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (phoneVersion() == 0 && clientDeviceYear() < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (phoneVersion() == 1 && clientDeviceYear() >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (phoneVersion() == 1 && clientDeviceYear() < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Устанваливать ничего не нужно");
        }
        //третья задача//
        int result = 1;
        if (deliveryDistance() > 20) {
            result++;
        }
        if (deliveryDistance() > 60 && deliveryDistance() <= 100) {
            result++;
        } else {
            System.out.println("Невозможно рассчитать срок доставки");
        }
        System.out.println("Потребуется дней " + result);
    }
}