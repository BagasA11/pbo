package geometri;
import format.*;

public class Geometri {
    public Kotak Kotak;
    
    public Lingkaran Lingkaran;
    public Kubus Kubus;
    public Segitiga1 Segitiga1;

    public Geometri(Segitigaf sgt, Kotakf ktk, Lingkaranf lf){
        Kotak k = new Kotak(ktk.Sisi);
        this.Kotak = k;
        
        Segitiga1 s1 = new Segitiga1(sgt.Alas, sgt.Tinggi);
        this.Segitiga1 = s1;

        Lingkaran l = new Lingkaran(lf.Radius);
        this.Lingkaran = l;

        Kubus kb = new Kubus(k);
        this.Kubus = kb;
    }
    
}
