package homeworks.homework1;

import java.util.Scanner;

public class myhomework1 {
    public static void main(String[] args) {
        while (true) {
            int temp = 0;
            int counter = 0;
            int j = 0;
            int[] numbers = new int[100];
            int[] array = new int[100];
            for (int i = 0; i < array.length; i++) {
                int r = (int) (Math.random() * (100 + 1));
                array[i] = r;
                System.out.println("Hello what is your name?");
                Scanner in = new Scanner(System.in);
                String name = in.next();
                System.out.println("Let the game begin!");
                for (j = 0; j < numbers.length; j++) {
                    System.out.println("Enter the number");
                    Scanner inp = new Scanner(System.in);
                    if (inp.hasNextInt()) {
                        int number = inp.nextInt();
                        counter++;
                        numbers[j] = number;
                        if (number < array[i]) {
                            System.out.println("Your number is too small. Please, try again");
                        } else if (number > array[i]) {
                            System.out.println("Your number is too big. Please, try again");
                        } else {
                            System.out.println("Congratulations " + name);
                            break;
                        }
                    }
                }
                for (j = 0; j < counter; j++) {
                    for (int k = 1; k < (counter - j); k++) {
                        if (numbers[k - 1] > numbers[k]) {
                            temp = numbers[k - 1];
                            numbers[k - 1] = numbers[k];
                            numbers[k] = temp;
                        }
                    }
                    System.out.print(numbers[j] + " ");
                }
                return;
            }
        }

    }
}