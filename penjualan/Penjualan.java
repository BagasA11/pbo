import java.time.LocalDate;
import java.util.Scanner;

// import java.math.*;

public class Penjualan{
    
    private static Scanner stscan = new Scanner(System.in);
    
   static Item []items = new Item[0];

    static LocalDate tgl;
    static String nama_kasir;

    public static void registrasi(){
        System.out.println("masukkan nama anda");
        nama_kasir = stscan.next();
        tgl = LocalDate.now();
    }

    public static void cetak_nota(float uang){
        Item bonus = new Item();
        
        System.out.printf("nama: %s \t\t tanggal: %s \n", nama_kasir, tgl.toString());

        System.out.println("========================================");
        System.out.println("kode \t nama barang \t qty \t harga \t sub-total");
        System.out.println("========================================");

        for(Item itm: items){
            
            if (itm == null) {
                continue;
            }
            System.out.printf("%s \t %s \t %d \t %2f \t %2f \n", itm.kode, itm.nama_barang, itm.qty, itm.harga, itm.getSub());
            if (Item.bonus(itm) != null){
                bonus = Item.bonus(itm);
            }
        }
        
        System.out.println("bonus:");
        System.out.printf("%s \t %s \t %d \t %2f \t %2f \n", bonus.kode, bonus.nama_barang, bonus.qty, bonus.harga, bonus.getSub());
        
        System.out.println("");

        System.out.println("total: " + Item.total_harga(items));
        System.out.println("uang: "+uang);
        System.out.println("kembalian: "+ (uang - Item.total_harga(items)));
    }

    public static void tambah_data(){
        String ulang = "y";
        int i = 1;
        System.out.println("|\t input data penjualan \t|");
        System.out.println();
        System.out.println("masukkan jumlah barang yang akan diinput");
        int len = stscan.nextInt();
        items = new Item[len];
        System.out.println("-------------------");

        do {
            // ensure i cannot overflow len value
            if (i > len){
                System.out.println("batas elemen tercapai. input selesai");
                break;
            }
            System.out.println("data ke-"+i);
            
            Item it = new Item();
            it = Item.input();
            items[i-1] = it;
            
            
            System.out.println("ulangi [Y/N]");
            ulang = stscan.next(); // this line skipped
            
            i+=1;
        } while(ulang.equalsIgnoreCase("Y"));

    }
   
}