package pkg5.darbas.collections;

import java.time.LocalDate;

public class Asmuo {

    private int id;
    private String vardas;
    private String pavarde;
    private LocalDate gimimoData;

    public Asmuo() {

    }

    public Asmuo(int id, String vardas, String pavarde, LocalDate gimimoData) {
        this.id = id;
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.gimimoData = gimimoData;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public LocalDate getGimimoData() {
        return gimimoData;
    }

    public void setGimimoData(LocalDate gimimoData) {
        this.gimimoData = gimimoData;
    }

    
    
}
