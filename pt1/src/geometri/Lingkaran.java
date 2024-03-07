package geometri;

public class Lingkaran {
    private int Radius;
    private float Phi = 3.14f;

    public Lingkaran(int r){
        this.Radius = r;
    }

    public float luas(){
        return this.Phi * (this.Radius * this.Radius);
    }

    public float keliling(){
        return this.Phi * 2 * this.Radius;
    }
}
