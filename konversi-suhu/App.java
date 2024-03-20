import java.lang.String;

public class App{
    public static void main(String[] args) {
        Suhu t = new Suhu(32.0);
        System.out.println(String.format("suhu di semarang hari ini adalah %f ^c", t.getCelcius()));
        //kelvin
        System.out.println(String.format("kelvin\t: %f", t.Kelvin()));
        //reamur
        System.out.println(String.format("reamur\t: %f", t.Reamur()));
        //Fahrenheit
        System.out.println(String.format("Fahrenheit\t: %f", t.Fahrenheit()));
        //Romer
        System.out.println(String.format("Romer\t: %f", t.Romer()));
        //Rankine
        System.out.println(String.format("Rankine\t: %f", t.Rankine()));
        //Newton
        System.out.println(String.format("Newton\t: %f", t.Newton()));
        //Delisle
        System.out.println(String.format("Delisle\t: %f", t.Delisle()));
    }
}