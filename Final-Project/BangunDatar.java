
package maen;

/**
 *
 * @author thori
 */
public abstract class BangunDatar {
    protected String namaBangun;

    public BangunDatar(String namaBangun) {
        this.namaBangun = namaBangun;
    }

    public abstract double hitungLuas();
    public abstract double hitungKeliling();

    public String getNama() {
        return namaBangun;
    }    
}
