/**
 *
 * 0.1 Insertion Sort
 *     Time: O(n*n)
 *     Space: O(1)
 *     Runtime: 6132ms
 *
 */
import java.util.*;

class InsertionSort {
    public static void sort(int[] numbers) {
        if (numbers.length < 2) {
            return;
        }
        for (int i = 1; i < numbers.length; ++i) {
            insert(numbers, i, numbers[i]);
        }
    }

    public static void insert(int[] numbers, int tail, int val) {
        int i = 0;
        for (; i < tail && numbers[i] < val; ++i) {}
        for (; i < tail; --tail) {
            numbers[tail] = numbers[tail - 1];
        }
        numbers[i] = val;
    }

    public static void main(String[] args) {
        final int SIZE = 200000;
        int[] numbers = new int[SIZE];
        Random rand = new Random();

        for (int i = 0; i < SIZE; ++i) {
            numbers[i] = rand.nextInt(Integer.MAX_VALUE);
        }

        sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}