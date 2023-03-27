public class Main {


    public static boolean printYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;

    }


    public static void main(String[] args) {
        if (printYear(2024)) {
            System.out.println("Год високосный!");
        } else {
            System.out.println("Год не високосный!");
        }
        whichOS(0,2016);
        daysDistance(2,25);


    }




    public static void whichOS(int clientsOS, int yearPhone) {
        if (yearPhone < 2015) {
            if (clientsOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (clientsOS == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else {
            if (clientsOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (clientsOS == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");

            }

        }


    }

    public static void daysDistance (int days,int deliveryDistance) {
        if (deliveryDistance < 20) {
            System.out.println("Потребуется " + days + " день для доставки");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется для доставки " + (days + 1) + " дня");
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется для доставки " + (days + 2) + " дня");
        } else {
            System.out.println("Доставки нет");
        }

    }
}

