package pkg5.darbas.collections;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.time.LocalDate;

public class DarbasCollections {

    public static void main(String[] args) {
        
        //3 uzduotis
        //right clicking "5 darbas - Collections" -> "Clean and build", tada i cmd ipastink paskutine eilute is apcioje konsoles:
        //pvz sita jei toki gauni: " java -jar \"\\\\SVAKODC1.svako.lt\\studentu_profiles$\\15734\\Documents\\NetBeansProjects\\5 darbas - Collections\\dist\\5_darbas_-_Collections.jar\" "
        for (String arg : args) {
            System.out.println(arg);
        }
        
        /*
        //2 uzduotis. Naudoja Asmuo.java ir AsmenuKontroleris.java
        //Ka kodas daro matysis tik su debugu
        AsmenuKontroleris ak = new AsmenuKontroleris();

        ak.pridetiAsmeni("Jonas", "Jonaitis", LocalDate.of(2000, 1, 10));
        ak.pridetiAsmeni("Petras", "Petraitis", LocalDate.of(2010, 2, 15));
        ak.pridetiAsmeni("Juozas", "Juozaitis", LocalDate.of(2010, 2, 15));
        
        ak.pasalintiAsmeni(2);
        */
        
        //1 uzduotis
        /*
        ArrayList<String> stringList = new ArrayList<>();

        stringList.add("Pirmas zodis");
        stringList.add("Antras zodis");

        System.out.println(stringList.get(0));
        System.out.println(stringList.get(1));

        for (String string : stringList) {
            System.out.println(string);
        }

        HashSet<Date> dateSet = new HashSet<Date>();
        dateSet.add(new Date());
        dateSet.add(new Date());
        dateSet.add(new Date());
        dateSet.add(new Date());
        for (Date date : dateSet) {
            System.out.println(date);
        }

        HashMap<String, String> stringMap = new HashMap<>();
        stringMap.put("narys1", "kaskoks tekstas");
        stringMap.put("balalaika", "tekstas kitas");
        
        System.out.println(stringMap.get("narys1"));
        System.out.println(stringMap.get("balalaika"));
         */
    }

}
//Java yra hard typed language, reikia visur nurodyti tipus
//List ir ArrayList yra konteineriai bet jie nori zinoti kokio tipo duomenis bus talpinami. Tarp tu varneliu <nurodomi tipai>
