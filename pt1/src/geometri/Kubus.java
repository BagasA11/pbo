package geometri;


public class Kubus{
    private Kotak Kotak;
    public Kubus(Kotak k){
        this.Kotak = k;
    }
    public int luas(){
        return 6 * this.Kotak.luas();
    }
    public int keliling(){
        return 12 * this.Kotak.getSisi();
    }
}

