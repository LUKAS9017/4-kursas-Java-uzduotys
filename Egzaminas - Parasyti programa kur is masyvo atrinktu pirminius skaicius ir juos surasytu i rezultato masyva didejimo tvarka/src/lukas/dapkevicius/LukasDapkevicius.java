package lukas.dapkevicius;

import java.util.ArrayList;
import java.util.Collections;

public class LukasDapkevicius {

//jeigu dalinant skaiciu is saves ir 1 ir nieko daugiau tada skaicius pirminis.
//Jei gauni skaiciu be liekanos kuris ne tas ptas skaicius ir ne 1, tada skaicius kury dalinai yra pirminis
    public static void main(String[] args) {
        int masyvas[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        boolean isPrime;
        ArrayList<Integer> pirminiai = new ArrayList<>();

        for (int i = 0; i < masyvas.length; i++) {
            isPrime = true;
            if (masyvas[i] <= 1) {
                isPrime = false;
            } else {
                for (int j = 2; j <= Math.sqrt(masyvas[i]); j++) {
                    if (masyvas[i] % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                pirminiai.add(masyvas[i]);
            }
        }

        Collections.sort(pirminiai);

        System.out.println("Pirminiai skaiciai:");
        for (int pirminis : pirminiai) {
            System.out.println(pirminis);
        }
    }
}
