package maen;
/**
 *
 * @author thori
 */
public class Lingkaran extends BangunDatar {
    double jari;
    
    public Lingkaran(double jari){
        super("Lingkaran");
        this.jari = jari;
    }
    
    public double hitungLuas(){
    return Math.PI * jari * jari;
    }
    
    public double hitungKeliling(){
    return 2 * Math.PI * jari;
    }
}
