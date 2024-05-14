package failinesstrukturosnuskaitymas;

import java.io.File;

public class FailinesStrukturosNuskaitymas {

    public static void main(String[] args) {
        // Nurodykite kelią iki norimo katalogo arba failo
        String directoryPath = "C:\\Users\\Asus\\OneDrive\\Desktop\\Execute";

        // Sukuriame naują File objektą su nurodytu keliu
        File directory = new File(directoryPath);

        // Patikriname, ar nurodytas katalogas egzistuoja
        if (directory.exists() && directory.isDirectory()) {
            // Jei taip, iškviečiame metodą, kuris atspausdins katalogo turinį
            printDirectoryContents(directory);
        } else {
            System.out.println("Nurodytas katalogas neegzistuoja arba tai nėra katalogas.");
        }
    }

    public static void printDirectoryContents(File directory) {
        // Gauti failų ir katalogų sąrašą esančių nurodytame kataloge
        File[] files = directory.listFiles();

        // Tikrinti, ar sąrašas nėra tuščias
        if (files != null) {
            // Eiti per visus failus ir katalogus
            for (File file : files) {
                // Atspausdinti failo pavadinimą arba katalogo pavadinimą
                System.out.println(file.getName());

                // Jei elementas yra katalogas, rekursyviai iškviesti šią funkciją
                if (file.isDirectory()) {
                    printDirectoryContents(file);
                }
            }
        }
    }
}
