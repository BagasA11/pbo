package geometri;

public class Kotak{
    private int Sisi;
    public Kotak(int s){
        this.Sisi = s;
    }
    public int luas(){
        return this.Sisi * this.Sisi;
    }
    public int keliling(){
        return 4 * this.Sisi;
    }
    public int getSisi(){
        return this.Sisi;
    }
}
