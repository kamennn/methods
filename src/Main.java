import java.time.LocalDate;
import java.util.Locale;

public class Main {

    public static void printIsLeapYear(int year) {
        boolean yearIsLeap = isLeap(year);
    }

    private static boolean isLeap(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
    private static void printIsLeapResult(int year,boolean yearIsLeap) {
        if (yearIsLeap) {
            System.out.println(year + "високосный");
        }else {
            System.out.println(year + "не является високосным");
        }
    }

    public static void recommendApplicationVersion(int clientOS, int deviceYear) {
        boolean deviceIsOld = isDeviceOld(deviceYear);
        System.out.print("Установите");
        if (deviceIsOld) {
            System.out.print("Lite");
        }
        System.out.println("версию для ");
        if (clientOS == 0) {
            System.out.println("iOS");
        }else {
            System.out.println("Android");
        }
    }

    private static boolean isDeviceOld(int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        return deviceYear <= currentYear;
    }

    public static void main(String[] args) {

    }

    public static void calculateDeliveryDays(int deliveryDistance) {
        int result = 1;
        if (deliveryDistance > 20) {
            result++;
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            result++;
        } else {
            System.out.println("Невозможно рассчитать срок доставки");
        }
        System.out.println("Потребуется дней " + result);
    }
}