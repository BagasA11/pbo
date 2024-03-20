public class Suhu {
    private double celcius;

    public Suhu(double celcius){
        this.celcius = celcius;
    }
    public double getCelcius(){
        return this.celcius;
    }
    public double Fahrenheit(){
        return (this.getCelcius() * 1.8) + 32;
    }
    public double Kelvin(){
        return (this.getCelcius() * 1.8) + 32;
    }
    public double Rankine(){
        return (this.getCelcius() * 1.8) + 491.67;
    }
    public double Newton(){
        return this.getCelcius() * 33/100;
    }
    public double Reamur(){
        return this.getCelcius() * 0.8;
    }
    public double Romer(){
        return (this.getCelcius() * 21/40) + 7.5;
    }
    public double Delisle(){
        return (100 - this.getCelcius()) + 1.5;
    }
}
