package Lab_4;

public class Lab_4_1 {
    public static int findMaxandMin(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        return max + min;
    }

    public static void main(String[] args) {
        int[] array1 = {5, 11, 14, 9, 4, -8, -9};

        System.out.println(findMaxandMin(array1));
    }
}