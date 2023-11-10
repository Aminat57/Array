import java.util.Arrays;

public class Element {
    public static void main(String[] args) {
        
       int[] array = {10,9,8,7,6,5,4,3,2,1};
       System.out.println("Before: ");
        System.out.println(Arrays.toString(array));

        for (int j = 0; j < array.length-1; j++){
           if(array[j] > array [j+1]){
               int greater = array[j];
               array[j] = array[j+1];
               array[j+1] = greater;
           }
       }
        System.out.println("after: ");
        System.out.println(Arrays.toString(array));
           int counter = 0;
        for (int i = 0; i < array.length - 1; i++) {
        counter++;
        for (int j = 0; j < array.length - 1; j++) {
            counter++;
            if (array[j] > array [j + 1]){
                counter++;
                int greater = array[j];
                array[j] = array[j + 1];
                array[j + 1] = greater;
            }

        }
    }
    }
}










