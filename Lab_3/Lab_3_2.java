package Lab_3;

public class Lab_3_2 {
    public static double calculateX(double t, int n, int l) {
        double sum = 0.0; // Змінна для збереження суми

        // Визначення значення суми залежно від парності l
        for (int i = 1; i <= n; i++) {
            if (l % 2 != 0) { // Непарні l
                sum += 1.0 / (t * l);
            } else { // Парні l
                sum += 1.0 / (Math.sqrt(t) * l);
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        double t = 10.0;
        int n = 10;
        int l;

        // Обчислення для непарних l
        for (l = 1; l <= 5; l += 2) { // Непарні l: 1, 3, 5
            double result = calculateX(t, n, l);
            System.out.println("x(" + t + ", " + n + ", " + l + ") = " + result);
        }

        // Обчислення для парних l
        for (l = 2; l <= 6; l += 2) { // Парні l: 2, 4, 6
            double result = calculateX(t, n, l);
            System.out.println("x(" + t + ", " + n + ", " + l + ") = " + result);
        }
    }
}
