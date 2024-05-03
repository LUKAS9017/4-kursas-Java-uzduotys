package pkg2.darbas.masyvai;

public abstract class TransportoPriemone {

    private double greitis = 0.00;
    private String spalva;

    public TransportoPriemone(double greitis, String spalva) {
        this.greitis = greitis;
        this.spalva = spalva;
        System.out.println("As esu abstrakti transporto priemone ir katik gimiau");
    }

    public double getGreitis() {
        return greitis;
    }

    public void setGreitis(double greitis) {
        this.greitis = greitis;
    }

    public String getSpalva() {
        return spalva;
    }

    public void setSpalva(String spalva) {
        this.spalva = spalva;
    }

    public void greitek() {
        greitis++;
    }

    public void letek() {
        if (greitis > 0) {
            greitis--;
        }
    }
}
