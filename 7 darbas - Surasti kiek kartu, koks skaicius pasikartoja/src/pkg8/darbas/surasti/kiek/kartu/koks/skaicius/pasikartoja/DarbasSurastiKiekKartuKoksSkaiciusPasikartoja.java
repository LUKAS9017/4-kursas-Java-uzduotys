package pkg8.darbas.surasti.kiek.kartu.koks.skaicius.pasikartoja;

import java.util.HashSet;
import java.util.Set;

public class DarbasSurastiKiekKartuKoksSkaiciusPasikartoja {

    public static void main(String[] args) {

        int[] masyvas = {1, 5, 1, 5, 5, 6};
        Set<Integer> printedElements = new HashSet<>(); //masyvas bet prijema tik unikales reiksmias, pasikartojimu negali buti

        // Iterate over each element in the array
        for (int i = 0; i < masyvas.length; i++) {
            int currentElement = masyvas[i];

            // If the current element has already been printed, skip it
            if (printedElements.contains(currentElement)) {
                continue;
            }

            int kartu = 0; // Reset kartu for each new element

            // Count occurrences of the current element in the array
            for (int j = 0; j < masyvas.length; j++) {
                if (masyvas[j] == currentElement) {
                    kartu++;
                }
            }

            // Print the count for the current element
            System.out.println(currentElement + " kartu: " + kartu);

            // Add the current element to the set of printed elements
            printedElements.add(currentElement);
        }

    }
    /*
    }
        int a;
        int sk;
        int[] masyvas = {1, 5, 1, 5, 5, 6};
        for (int i = 0; i < masyvas.length; i++) {
            a = masyvas[i];
            int kartu = 0;
            for (int j = 0; j < masyvas.length; j++) {
                if (a == masyvas[j]) {
                    sk = a;
                    kartu++;
                }
            }
            
            for (int j = 0; j < masyvas.length; j++) {
                System.out.println(sk + " kartu: " + kartu);
            }
    }
     */
}
