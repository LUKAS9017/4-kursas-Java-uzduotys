//Ka kodas daro matysis tik su debugu
package pkg5.darbas.collections;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AsmenuKontroleris {

    private List<Asmuo> asmenys = new ArrayList<>();

    public AsmenuKontroleris() {
    }

    public List<Asmuo> rastiVisus() {
        return this.asmenys;
    }

    public void pasalintiAsmeni(int id) {

        for (Asmuo as : asmenys) {
            if (as.getId() == id) {
                this.asmenys.remove(as);
                break;
            }
        }
        //daro tapati ka ir virsuje for each loop'as
        /*
        for (int i = 0; i < this.asmenys.size(); i++) {
            Asmuo asm = this.asmenys.get(i);
            if (asm.getId() == id) {
                this.asmenys.remove(i);
                break;
            }
        }
         */
    }

    public void pridetiAsmeni(String vardas, String pavarde, LocalDate gimimoData) throws Exception {
        if (!vardas.isBlank() && !pavarde.isBlank() && gimimoData != null) {
            Asmuo naujasAsmuo = new Asmuo();
            naujasAsmuo.setId(getLastId());
            naujasAsmuo.setVardas(vardas);
            naujasAsmuo.setPavarde(pavarde);
            naujasAsmuo.setGimimoData(gimimoData);
            asmenys.add(naujasAsmuo);
        } else {
            throw new Exception("Truksta ivedimo duomenu");
        }
    }

    private int getLastId() {
        int id = 0;

        if (!this.asmenys.isEmpty()) {
            Asmuo paskutinisAsmuo = this.asmenys.getLast();
            id = paskutinisAsmuo.getId() + 1;
        } else {
            id = 1;
        }
        return id;
    }
}
