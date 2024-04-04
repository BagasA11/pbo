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
        nama_kasir = stscan.nextLine();
        tgl = LocalDate.now();
    }

    public static void cetak_nota(float uang){
        int j = 0;
        Item []bonusses = new Item[1];
        System.out.printf("nama: %s \t\t tanggal: %s \n", nama_kasir, tgl.toString());

        System.out.println("========================================");
        System.out.println("kode \t nama barang \t qty \t harga \t sub-total");
        System.out.println("========================================");

        for(Item itm: items){
            System.out.printf("%s \t %s \t %d \t %2f \t %2f \n", itm.kode, itm.nama_barang, itm.qty, itm.harga, itm.getSub());
            
            Item bonus = Item.bonus(itm);
            if (bonus != null){

                bonusses = new Item[j+1];
                bonusses[j] = bonus;

                j++;
            }
        }
        
        System.out.println("bonus:");

        if (bonusses != null){
            for(Item bns: bonusses){
                System.out.printf("%s \t %s \t %d \t %2f \t %2f \n", bns.kode, bns.nama_barang, bns.qty, bns.harga, bns.getSub());
            }
        }
        System.out.println("");

        System.out.println("total: " + Item.total_harga(items));
        System.out.println("uang: "+uang);
        System.out.println("kembalian: "+ (uang - Item.total_harga(items)));
    }

    public static void tambah_data(){
        String ulang = "Y";
        int i = 1;
        System.out.println("input data penjualan:");
        System.out.println("-------------------");
        do {
            System.out.println("data ke-"+i);
            
            Item it = new Item();
            it = Item.input();
            
            items = new Item[i];
            items[i-1] = it;

            System.out.println("array length: \t" + items.length);
            if(i > 1){
                System.out.printf("<pre> null?:\t %b \n", items[i-2] == null);
            }
            System.out.printf("<post> null?:\t %b \n", items[i-1] == null);

            System.out.println("ulangi [Y/N]");
            ulang = stscan.nextLine();
            
            i+=1;
        } while(ulang.equalsIgnoreCase("Y"));

    }
   
}