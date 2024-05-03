package pkg3.darbas.trumpiausias.zodis;

public class DarbasTrumpiausiasZodis {
    static String[] masyvas = {"suo", "anekdotas", "kate", "svetaine"};

    public static void main(String[] args) {
        int max = 0, min = 100;
        String maxWord = "";
        String minWord = "";

        for (int i = 0; i < masyvas.length; i++) {
            if (masyvas[i].length() > max) {
                max = masyvas[i].length();
                maxWord = masyvas[i];
            }
            
           if (masyvas[i].length() < min) {
               min = masyvas[i].length();
               minWord = masyvas[i];
           }
        }

        
            System.out.println("Ilgiausias zodis: " + maxWord + " - " + max + " raides");
            System.out.println("Trumpiausias zodis: " + minWord + " - " + min + " raides");
    }
}

//1 metodas suranda trumpaisia zody. 2 metodas suranda ilgiausia zody
//kintamasis string, saugo teksta is daug zodziu. 