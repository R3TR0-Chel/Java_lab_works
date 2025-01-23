import java.util.Scanner;

public class chek {
        public static void main(String[] args) {
            int[] array = {3, 1, 4, 1, 5, 9, 2, 6, 5};

            int sum = 0;
            for (int num : array) {
                sum += num;
            }


            double average = (double) sum / array.length;


            int smallest = Integer.MAX_VALUE;
            int largest = Integer.MIN_VALUE;
            for (int num : array) {
                if (num < smallest) smallest = num;
                if (num > largest) largest = num;
            }


            int secondSmallest = Integer.MAX_VALUE;
            int secondLargest = Integer.MIN_VALUE;
            for (int num : array) {
                if (num > smallest && num < secondSmallest) secondSmallest = num;
                if (num < largest && num > secondLargest) secondLargest = num;
            }


            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);
            System.out.println("Smallest: " + smallest);
            System.out.println("Second Smallest: " + secondSmallest);
            System.out.println("Largest: " + largest);
            System.out.println("Second Largest: " + secondLargest);
        }
    }




