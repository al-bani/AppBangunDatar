
package week12;

/**
 *
 * @author ramzi
 */
public class Lingkaran extends BangunDatar{
    
    private static final double phi = 3.14;
    private int r;

    public Lingkaran(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    
    
    @Override
    double luas() {
        return phi * r * r;
    }

    @Override
    double keliling() {
        return 2 * phi * r;
    }
    
    
}
