public class Main {
    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 17;
        System.out.print("Если возраст члеовека равен " + age + " лет, то ");

        if(age>=18) {
            System.out.println("он совершеннолетний");
        } else {
            System.out.println("он не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int temperature = 10;
        System.out.print("На улице " + temperature + " градусов, ");

        if(temperature <= 5) {
            System.out.println("нужно надеть шапку");
        } else {
            System.out.println("можно идти без шапки");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed = 62;
        System.out.print("Если скорость " + speed + " км/ч, то ");

        if(speed > 60) {
            System.out.println("придется заплатить штраф");
        } else {
            System.out.println("можно ездить спокойно");
        }
    }
}