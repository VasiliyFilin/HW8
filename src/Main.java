import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Задача 1

            System.out.println("Задача 1:\n");
            int[] numbers = new int[3];
            numbers[0] = 1;
            numbers[1] = 2;
            numbers[2] = 3;
            double[] pointNumbers = {1.57, 7.654, 9.986};
            int[] random = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        // Задача 2

            System.out.println("\nЗадача 2:\n");
            for (int i = 0; i < numbers.length; i++) {
                if (i == numbers.length - 1) {
                    System.out.println(numbers[i]);
                    break;
                }
                System.out.print(numbers[i] + ", ");
            }
            for (int i = 0; i < pointNumbers.length; i++) {
                if (i == pointNumbers.length - 1) {
                    System.out.println(pointNumbers[i]);
                    break;
                }
                System.out.print(pointNumbers[i] + ", ");
            }
            for (int i = 0; i < random.length; i++) {
                if (i == random.length - 1) {
                    System.out.println(random[i]);
                    break;
                }
                System.out.print(random[i] + ", ");
            }

        // Задача 3

            System.out.println("\nЗадача 3:\n");
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(numbers[i]);
                break;
            }
            System.out.print(numbers[i] + ", ");
        }
        for (int i = pointNumbers.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(pointNumbers[i]);
                break;
            }
            System.out.print(pointNumbers[i] + ", ");
        }
        for (int i = random.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(random[i]);
                break;
            }
            System.out.print(random[i] + ", ");
        }

        // Задача 4

            System.out.println("\nЗадача 4:\n");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 1) {
                numbers[i] += 1;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}