/*
[]create a method that returns a new array of a random 100 ints
[]create another method that looks at the first and last method
    
 */
package mcmurchie;

import java.util.Arrays;
import java.util.Random;

public class ArrayPractice {

    static Random rand = new Random();

    public static void main(String[] args) {
        int[] myArray = createArray(100);
        changeEnds(myArray);
        for (int num : myArray) {
            System.out.println(num + ",");
        }
        System.out.println();
        System.out.println(linearSearch(myArray, 85));
        Arrays.sort(myArray);
        for (int num : myArray) {
            System.out.println(num + "");
        }

        System.out.println();
        System.out.println(binarySearch(myArray, 85));
    }

    public static int[] createArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(100);
        }
        return arr;
    }

    public static void changeEnds(int[] Arr) {
        if (Arr[0] > Arr[Arr.length - 1]) {
            Arr[Arr.length - 1] = Arr[0];
        } else if (Arr[Arr.length - 1] > Arr[0]) {
            Arr[0] = Arr[Arr.length - 1];
        }
    }

    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;
        int middle = 0;
        while (low <= high) {
            middle = (low + high / 2);
        }
        if (target == array[middle]) {
            return middle;
        } else if (target < array[middle]) {
            high = middle - 1;
        } else {
            low = middle + 1;
        }
        return -1;
    }
}
