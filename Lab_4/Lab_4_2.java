package Lab_4;

public class Lab_4_2 {
    public static double AvarageofMaxandThird(int[] array){
        if(array == null || array.length < 3){
            throw new IllegalArgumentException("Array must contain more then 3 elements");
        }
        int max = array[0];
        for(int num : array){
            if(num > max){
                max = num;
            }
        }

        int third = array[2];

        return (max + third) / 2.0;
    }
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7};

        System.out.println(AvarageofMaxandThird(array));
    }
}
