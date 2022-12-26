public class Main {
    public static void main(String[] args) {
        task1();
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
}