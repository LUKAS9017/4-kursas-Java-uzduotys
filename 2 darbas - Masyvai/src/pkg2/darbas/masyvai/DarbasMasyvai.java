package pkg2.darbas.masyvai;

public class DarbasMasyvai {

    static int[] masyvas = {1, 5, 2, 6, 8, 7};

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1 uzduotis
        /*int s1 = 9;
        System.out.println(sqr(s1));
        System.out.println(s1);
         */

        //2 uzduotis
        /*
        System.out.println(masyvas.length);
        System.out.println(masyvas[0]);
        masyvas[0] = 100;
        System.out.println(masyvas[0]);
         */
        
        /*
        //3 uzduotis
        // --> Paleidziama is ArrayUtils.java
        ArrayUtils.printArray(masyvas);
        ArrayUtils.editArray(masyvas);
        ArrayUtils.printArray(masyvas);
        //--> Galima pakeisti skaiciu jamama is kito failo
        System.out.println(ArrayUtils.skaicius);
        ArrayUtils.skaicius = 30;
        System.out.println(ArrayUtils.skaicius);

        //4 uzduotis
        lyginiai(masyvas);

        //--> Paleidziama is Preke.java
        Preke preke1 = new Preke();
        Preke preke2 = new Preke("Saldytuvas", 700.99, "sald01", true);
        */
        
        /*
        System.out.println(preke1);
        System.out.println(preke2);
        System.out.println(preke3);
        System.out.println(preke4);
        Preke.x = 10;
        
        TransportoPriemone tp = new TransportoPriemone(5, "ssd");
        */
        
        //Uzduotis - perpanaudoti koda
        SausumosTransportoPriemone stp1 = new SausumosTransportoPriemone(10.00, "Juoda");
        System.out.println(stp1.getGreitis());
        stp1.kairen();
        stp1.desinen();
        stp1.greitek();
        System.out.println(stp1.getGreitis());
    }

    //--> Perkeliau i ArrayUtils.java
//    //3 uzduotis
//    public static void editArray(int[] array) {
//        /*
//        array[0] = 100;
//        array[1] = 200;
//        //printArray(masyvas);
//         */
//        for (int i = 0; i < array.length; i++) {
//            array[i] = array[i] * 10;
//            //System.out.println(i);
//        }
//    }
//
//    public static void printArray(int[] array) {
//        for (long elementas : array) {
//            System.out.println(elementas + " ");
//        }
//        System.out.println("");
//    }
    //4 uzduotis - lyginius elementus pakeisti nuliais
    public static void lyginiai(int[] xd) {
        // Iterate through the array
        for (int i = 0; i < masyvas.length; i++) {
            // Check if the current element is even
            if (masyvas[i] % 2 == 0) {
                // Replace even numbers with 0
                masyvas[i] = 0;
            }
        }
        // Print the modified array
        for (int num : masyvas) {
            System.out.print(num + " ");
        }
    }

    //1 uzduotis
    public static int sqr(int sk) {
        sk = sk - 1;
        return sk * sk;
    }

}
