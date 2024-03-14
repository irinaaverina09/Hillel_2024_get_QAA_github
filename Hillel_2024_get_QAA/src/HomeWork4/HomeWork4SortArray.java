package HomeWork4;

import java.util.Arrays;
import java.util.Comparator;

public class HomeWork4SortArray {
    public static void main(String[] args) {

        Integer[] numbers = new Integer[args.length];
        for (int i = 0; i < args.length; i++) {
            numbers[i] = Integer.parseInt(args[i]);
        }

        System.out.println("base: " + Arrays.toString(numbers));

        Arrays.sort (numbers);
        System.out.println("asc:  " + Arrays.toString(numbers));

       Arrays.sort (numbers, Comparator.reverseOrder());
        System.out.println("desc:  " + Arrays.toString(numbers));

    // another way of sorting
        /*  for (int i = 0; i < numbers.length / 2; i++) {
           int temp = numbers[i];
           numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
       }
        System.out.println("desc: " + Arrays.toString(numbers)); */

        int[] innerSortedArray = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            if (i%2 == 0) {
                innerSortedArray[i/2] = numbers [i];
            }
            else {
                innerSortedArray[numbers.length-1 - i/2] = numbers[i];
            }
        }
        System.out.println("inner: " + Arrays.toString(innerSortedArray));
    }
}
