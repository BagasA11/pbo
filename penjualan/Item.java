import java.util.Scanner;
import java.util.UUID;

public class Item {
    // private Scanner sc = new Scanner(System.in);
    private static Scanner statsc = new Scanner(System.in);
    String kode, nama_barang;
    float harga;
    int qty;    

    public Item(){}

    public float getSub(){
        return (float) qty * harga;
    }

    public Item(String nama, int qty, float harga){
        nama_barang = nama;
        this.qty = qty;
        this.harga = harga;
        UUID uuid = UUID.randomUUID();
        kode = uuid.toString();
    }

    public static Item input(){
        System.out.println("input nama barang: ");
        String nama = statsc.next();

        System.out.println("input harga barang: ");
        float hargax = statsc.nextFloat();

        System.out.println("input kuantitas barang: ");
        int amount = statsc.nextInt();

        Item i = new Item(nama, amount, hargax);
        return i;
    }

    public static Item bonus(Item itm){
        // total pembelian > 500.000 && qty > 5
        if (itm.getSub() > 500000f && itm.qty > 5){
            Item bonus = new Item("setrika", 1, 0);
            return bonus;
        }
        // pembelian >= 100.000 && qty > 3
        else if(itm.getSub() >= 100000f && itm.qty > 3){
            Item bonus = new Item("payung", 1, 0);
            return bonus;
        }
        else if (itm.getSub() > 50000f && itm.qty > 2){
            Item bonus = new Item("pulpen", 1, 0);
            return bonus;
        }

        return null;
    }

    public static float total_harga(Item []itm){
        float total = 0;

        for(Item items: itm){
            // null validation
            if (items != null){
                total += items.getSub();
            }
        }

        return total;
    }
}