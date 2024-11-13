package Lab_4;

import java.util.Arrays;

public class Lab_4_3 {
    public static int[] editArray(int[] array){
        if (array == null){
            throw new NullPointerException("array is null");
        }

        int[] editedArray= new int[array.length];
        for (int i = 0; i < array.length; i++){
            if(array[i] < 0){
                editedArray[i] = array[i] * -1;
            }
            if(array[i] == 0){
                editedArray[i] = -2;
            }
            else{
                editedArray[i] = array[i] -3;
            }
        }
        return editedArray;
    }
    public static void main(String[] args) {
        int[] array={1,-5, 8, 10, 0, 3, 2};
        System.out.println(Arrays.toString(editArray(array)));
    }
}
