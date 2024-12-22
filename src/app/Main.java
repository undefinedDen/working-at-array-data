package app;

import java.util.Scanner;
public class Main {
    static int sumNegative = 0;
    static int paired = 0;
    static int notPaired = 0;
    static int min;
    static int max;
    static double sumArr = 0;
    static double average = 0;
    static int count = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {10, -1, 1, -2, 8, -1, 47, 0, 99, -85, 7, 98, -28, 0, -89, -73, 1, 4, 7, 66};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                sumNegative += array[i];
            }
            if (array[i] % 2 == 0) {
                paired++;
            } else {
                notPaired++;
            }
        }
        System.out.println("Sum of negative numbers: " + sumNegative +
                "\n A quantity of paired numbers: " + paired + "\n A quantity of unpaired: " + notPaired);
        min = array[0];
        max = array[0];
        int indexMin = 0;
        int indexMax = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                indexMin = i;
            }
            if (array[i] > max) {
                max = array[i];
                indexMax = i;
            }
        }
        System.out.println("Minimum number is: " + min + ", with index (" + indexMin + ") " +
                "\n Maximum number is: " + max + ",  with index: (" + indexMax + ")");
        //average
        int afterFirstNegativeArrayIndex = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] < 0) {
                System.out.println("I find a negative number: " + array[j] + " with index: [" + j +"]");
                afterFirstNegativeArrayIndex = j;
                break;
            }else {
                System.out.print("Negative numbers don't find!!");
            }
        }
        System.out.print("Enter index to confirm calculation: ");
        int index = scanner.nextInt();
        if (index == afterFirstNegativeArrayIndex) {
            for (int a = index + 1; a < array.length; a++) {
                sumArr += array[a];
                count++;
            }
            average = sumArr / count;
            System.out.printf("The arithmetic average of the numbers after the first negative number: %.2f", average);
        } else{
            System.out.println("Error! Enter correct value!");
        }
    }
}