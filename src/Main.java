public class Main {
    public static int calculateDeliveryDays() {
        int DeliveryDays;
        return DeliveryDays = 40;
    }

    public static boolean deliveryDaysCalculation(int DeliveryDays){
        return calculateDeliveryDays() > 20;
    }

    public static boolean deliveryDaysCalculation1(int DeliveryDays){
        return calculateDeliveryDays() > 60 && calculateDeliveryDays() <= 100;
    }


    public static int phoneVersion (){
        int version;
        return version = 0;
    }
    public static int clientDeviceYear (){
        int deviceYear;
        return deviceYear = 2014;
    }

    public static boolean checkPhoneVersionAndYear(int phoneVersion, int clientDeviceYear) {
        return phoneVersion == 0 && clientDeviceYear >= 2015;
    }
    public static boolean checkPhoneVersionAndYear1(int phoneVersion, int clientDeviceYear) {
        return phoneVersion == 1 && clientDeviceYear >= 2015;
    }
    public static boolean checkPhoneVersionAndYear2(int phoneVersion, int clientDeviceYear) {
        return phoneVersion == 0 && clientDeviceYear < 2015;
    }
    public static boolean checkPhoneVersionAndYear3(int phoneVersion, int clientDeviceYear) {
        return phoneVersion == 1 && clientDeviceYear < 2015;
    }

    //задача первая

    public static int subtractedYear (){
        int year;
        return year = 2023;
    }
    public static boolean leapYearCalculation(int year){
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
    public static void main(String[] args) {
        subtractedYear();
        if (leapYearCalculation(subtractedYear())) {
            System.out.println(subtractedYear() + " является високосным");
        } else {
            System.out.println(subtractedYear() + " не является високосным");
        }
        //задача вторая

        if (checkPhoneVersionAndYear(phoneVersion(), clientDeviceYear())) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (checkPhoneVersionAndYear2(phoneVersion(), clientDeviceYear())) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (checkPhoneVersionAndYear1(phoneVersion(), clientDeviceYear())) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (checkPhoneVersionAndYear3(phoneVersion(), clientDeviceYear())) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        //третья задача
        int result = 1;
        if (deliveryDaysCalculation(calculateDeliveryDays())) {
            result++;
        }
        if (deliveryDaysCalculation1(calculateDeliveryDays())) {
            result++;
        } else {
            System.out.println("Невозможно рассчитать срок доставки");
        }
        System.out.println("Потребуется дней " + result);
        }
    }
