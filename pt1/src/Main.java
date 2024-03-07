import format.*;
import geometri.Geometri;

public class Main{
    public static void main(String[] args) {
        int alas = 3;
        int tinggi = 4;
        int r = 7;
        int sisi = 8;

        Segitigaf sgtf = new Segitigaf(alas, tinggi);
        Kotakf kf = new Kotakf(sisi);
        Lingkaranf l = new Lingkaranf(r);

        Geometri g = new Geometri(sgtf, kf, l);
        System.out.println("\n\n");
        System.out.println("diketahui");
        System.out.println(String.format("diketahui:\t alas %d", alas));
        System.out.println(String.format("tinggi:\t %d", tinggi));
        System.out.println(String.format("jari-jari:\t %d", r));
        System.out.println(String.format("panjang sisi: \t %d", sisi));

        System.out.println("\n===================================\n");
        System.out.println("jawaban:\t");
        System.out.println("");
        System.out.println("1. \t segitiga:\n");
        System.out.println(String.format("luas segitiga:\t %d", g.Segitiga1.luas()));
        
        
        System.out.println(String.format("keliling segitiga:\t %d", g.Segitiga1.keliling()));
        
        System.out.println("");
        
        System.out.println("2. \t lingkaran:\n");
        System.out.println(String.format("luas lingkaran:\t %f", g.Lingkaran.luas()));
        System.out.println(String.format("keliling lingkaran:\t %f", g.Lingkaran.keliling()));
        
        System.out.println("");
        
        System.out.println("3. \t kotak:\n");
        System.out.println(String.format("luas kotak:\t %d", g.Kotak.luas()));
        System.out.println(String.format("keliling kotak:\t %d", g.Kotak.keliling()));

        System.out.println("");
        
        System.out.println("4. \t kubus:\n");
        System.out.println(String.format("luas permukaan kubus:\t %d", g.Kubus.luas()));
        System.out.println(String.format("keliling kubus:\t %d", g.Kubus.keliling()));
        
    }
}