import java.util.Scanner;

public class PotapovJavaPervoe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод чисел
        System.out.print("Введите число (a): ");
        int a = scanner.nextInt();

        System.out.print("Введите число (b): ");
        int b = scanner.nextInt();

        // Сравнение чисел
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        // Арифметические операции
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));

        // Проверка деления на ноль
        if (b != 0) {
            System.out.println(a + " / " + b + " = " + ((double) a / b));
        } else {
            System.out.println("Деление на ноль невозможно");
        }

        scanner.close();
    }
}
