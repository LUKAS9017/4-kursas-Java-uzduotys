package pkg2.darbas.masyvai;

public class SausumosTransportoPriemone extends TransportoPriemone implements ValdomasHorizontaliai {

    private int ratuSkaicius;

    public SausumosTransportoPriemone(double greitis, String spalva ) {
        super(greitis, spalva);
        System.out.println("As esu sausumos transporto priemone ir katik gimiau");
    }

    @Override
    public void kairen() {
        System.out.println("As esu sausumos transporto priemone ir suku kairen");
    }

    @Override
    public void desinen() {
        System.out.println("As esu sausumos transporto priemone ir suku desinen");
    }

    public int getRatuSkaicius() {
        return ratuSkaicius;
    }

    public void setRatuSkaicius(int ratuSkaicius) {
        this.ratuSkaicius = ratuSkaicius;
    }

}
// Overridai prideti kai paspaudziau lempute ant eilutes skaiciaus
