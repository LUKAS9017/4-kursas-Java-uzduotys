package pkg2.darbas.masyvai;

public class Preke {

    private String pavadinimas;
    private double kaina;
    private String prekesKodas;
    private boolean naudojama;

    public Preke() {
    }

    public Preke(String pavadinimas, double kaina, String prekesKodas, boolean naudojama) {
        this.pavadinimas = pavadinimas;
        this.kaina = kaina;
        this.prekesKodas = prekesKodas;
        this.naudojama = naudojama;
    }

    
    public String getPavadinimas() {
        return pavadinimas;
    }

    public double getKaina() {
        return kaina;
    }

    public String getPrekesKodas() {
        return prekesKodas;
    }

    public boolean isNaudojama() {
        return naudojama;
    }

    
    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public void setKaina(double kaina) {
        if (kaina < 0) {
            System.out.println("Kaina negali buti mazesne uz 0");
        } else {
            this.kaina = kaina;
        }
    }

    public void setPrekesKodas(String prekesKodas) {
        this.prekesKodas = prekesKodas;
    }

    public void setNaudojama(boolean naudojama) {
        this.naudojama = naudojama;
    }
    
    
    
}
//Dauguma dalyku sukurti su right click -> Insert code -> Constructor ir Getter... ... Tam kad nereiktu rasyti ranka