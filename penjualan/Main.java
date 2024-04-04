import java.util.Scanner;
public class Main {
    private static Scanner stscan = new Scanner(System.in);
    public static void main(String[] args) {
        Penjualan.registrasi();
        Penjualan.tambah_data();
        System.out.println();
        System.out.println("input uang pembayaran");
        float uang = stscan.nextFloat();
        System.out.println();
        Penjualan.cetak_nota(uang);
    }
}
