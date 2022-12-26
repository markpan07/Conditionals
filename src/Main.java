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
        /*task5();
        System.out.println();
        task6();
        System.out.println();
        task7();
        System.out.println();*/
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

    public static void task4() {
        System.out.println("Задача 4");
        int age = 15;
        System.out.print("Если возраст человека равен " + age + ", то ему нужно ходить ");

        if(age >= 2 && age <= 6) {
            System.out.println("в детский сад");
        }

        if (age > 6 && age <=18) {
            System.out.println("в школу");
        }

        if (age > 18 && age <=24) {
            System.out.println("в университет");
        }

        if (age > 24) {
            System.out.println("на работу");
        }
    }
}