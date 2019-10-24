import java.util.Random;

/**
 * Submenu
 */
public class Submenu {
    protected String namaMenu;
    protected String namaLayanan;
    protected int rand = new Random();

    public Submenu(String nama, String layanan, String[] daftar){
        namaMenu = nama;
        namaLayanan = layanan;
        daftarLayanan = daftar;
    }

    public void displayMsg(){
        System.out.println("=== " + namaMenu + "===");
        System.out.println("Silakan pilih menu dibawah ini");
        int count = 1;
        for (String daftarLayanan : Layanan){
            System.out.println("("+count+")"+" "+ Layanan);
            count++;
        }
        System.out.println("(0) Keluar");
    }
}