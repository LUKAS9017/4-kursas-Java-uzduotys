package pkg2.darbas.masyvai;

public class ArrayUtils {

    public static final double PI = 3.14;
    
    public static int skaicius = 0;
    
    public static void editArray(int[] array) {
        /*
        array[0] = 100;
        array[1] = 200;
        //printArray(masyvas);
         */
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * 10;
            //System.out.println(i);
        }
    }

    public static void printArray(int[] array) {
        for (long elementas : array) {
            System.out.println(elementas + " ");
        }
        System.out.println("");
    }

}
