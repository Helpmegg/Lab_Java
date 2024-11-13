public class SortAlgorithms {

    // Метод для сортування вибором
    public static void selectionSort(byte[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

           //Найменше 
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

           //Перестановка
            byte temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    // Метод для сортування вставками
    public static void insertionSort(byte[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            byte key = array[i];
            int j = i - 1;

           // Переміщення поточного більшого елменту, на одну позицію вперед
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    
    public static void printArray(byte[] array) {
        for (byte b : array) {
            System.out.print(b + " ");
        }
        System.out.println();
    }

    
    public static void main(String[] args) {
        byte[] originalArray = {5, 2, 9, 1, 5, 6};

        System.out.println("Початковий масив:");
        printArray(originalArray);

        // Копія масиву для сортування вибором
        byte[] selectionSortedArray = originalArray.clone();
        selectionSort(selectionSortedArray);
        System.out.println("Відсортований масив (Selection Sort):");
        printArray(selectionSortedArray);

        // Копія масиву для сортування вставками
        byte[] insertionSortedArray = originalArray.clone();
        insertionSort(insertionSortedArray);
        System.out.println("Відсортований масив (Insertion Sort):");
        printArray(insertionSortedArray);
    }
}
