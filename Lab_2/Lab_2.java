package Lab_2;

public class Lab_2 {
    public static void main(String[] args) {
        // Значення для змінних
        double a = -1.49, b = 23.4, c = 1.23, d = 2.542,
                a2 = 0.478, b2 = -1.26, c2 = 2.68, d2 = 18.24,
                a3 = 2.54, b3 =1.23, c3 = 2.14, d3 = 0.23;
        // Розрахунок виразу
        double result = calculate1(a, b, c, d);
        System.out.println("Результат: " + result);
        double result2 = calculate2(a2, b2, c2, d2);
        System.out.println("Результат: " + result2);
        double result3 = calculate3(a3, b3, c3, d3);
        System.out.println("Результат: " + result3);

    }

    // Обчислення виразів
    public static double calculate1(double a, double b, double c, double d) {
        // Формула: y = sqrt(|sin(a) - (4 * ln(b)) / (c^d)|)
        return Math.sqrt(Math.abs(Math.sin(a) - (4 * Math.log(b)) / Math.pow(c, d)));
    }
    public static double calculate2(double a, double b, double c, double d) {
        // Формула: y = 9 * (arcsin(a) / cos(sqrt(|b|))) + 2.43^d + ln(c)
        double part1 = 9 * (Math.asin(a) / Math.cos(Math.sqrt(Math.abs(b))));
        double part2 = Math.pow(2.43, d);
        double part3 = Math.log(c);
        return part1 + part2 + part3;
    }
    public static double calculate3(double a, double b, double c, double d) {
        // Формула: y = 3 * (ln(|a/b|) + sqrt(cos(c) + e^d))
        // double part1 = 3 * (Math.log(Math.abs(a/b)) + Math.sqrt(Math.cos(c)) + Math.pow(Math.E,d));
        double part1 = Math.log(Math.abs(a/b)) + Math.sqrt(Math.abs(Math.cos(c))) + Math.pow(Math.E,d);
        return part1 ;
    }
}
