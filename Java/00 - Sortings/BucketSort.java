/**
 *
 * 0.7 Bucket Sort
 *     Time: O()
 *     Space: O()
 *     Runtime: ms
 *
 */

class BucketSort {
    public static void sort(int numbers) {
        
    }

    public static void main(String[] args) {
        final int SIZE = 200000;
        int[] numbers = new int[SIZE];
        Random rand = new Random();
        
        for (int i = 0; i < SIZE; ++i) {
            numbers[i] = Math.abs(rand.nextInt() % 10000);
        }
        
        sort(numbers);
    }
}