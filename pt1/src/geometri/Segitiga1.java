package geometri;

import java.lang.Math;

public class Segitiga1 {
    private int Alas;
    private int Tinggi;
    private double Miring;

    public Segitiga1(int alas, int tinggi){
        this.Alas = alas;
        this.Tinggi = tinggi;
        this.Miring = this.miring();
    }
    public int luas(){
        return (this.Alas * this.Tinggi)/2;
    }
    private double miring(){
        double pow2 = Math.pow((double) this.Alas, 2) + Math.pow((double) this.Tinggi, 2);
        return Math.sqrt(pow2);
        
    }

    public int keliling(){
        return this.Alas + this.Tinggi + (int) this.Miring;
    }
}
