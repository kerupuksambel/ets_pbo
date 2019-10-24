package ets_pbo;
import java.util.Scanner;

public class IndomaretDelivery {
    private String namaPemesan;
    private String alamatPemesan;
    private String noHPPemesan;
    private String namaBarang;
    private int hargaSatuan;
    private int jumlahBarang;
    private int hargaTotal;
    private String kodePembayaran;
    
    private String daftarJenis[] = {"Cake", "Gadget", "Furnitur"};
    private String daftarBarang[][] = {{"Black Forest", "Red Velvet", "Lapis Surabaya"}, {"Mi 5", "iPhone 11", "Samsung S9"}, {"Lemari", "Meja Belajar"}};
    private int hargaBarang[][] = {{250000, 300000, 500000}, {2500000, 10000000, 7500000}, {5000000, 2000000}};
    private Scanner scan;
    
    public IndomaretDelivery() {
        this.scan = new Scanner(System.in);
    }

    public void menu(){
        System.out.println("=== Indomaret Delivery ===");
        System.out.println("Masukkan pilihan yang Anda inginkan.");
        int count = 1;
        for (String daftar : daftarJenis){
            System.out.println("(" + count + ")" + " " + daftar);
            count++;
        }
        System.out.println("(0) Keluar");
        String input;
        input = scan.next();
        submenu(input);
        identitasmenu();
        generateKode();
        printinformasi();
        System.out.println("Bayar ke kasir dengan membawa kode pembayaran.");
    }

    private void submenu(String n){
        String input = "";
        int count = 1;
        switch (n) {
            case "1":
                System.out.println("=== "+ daftarJenis[0] +" ===");
                for (String daftar : daftarBarang[0]){
                    System.out.println("(" + count + ")" + " " + daftar);
                    count++;
                }
                input = scan.next();
                break;
        
            case "2":
                System.out.println("=== "+ daftarJenis[1] +" ===");
                for (String daftar : daftarBarang[1]){
                    System.out.println("(" + count + ")" + " " + daftar);
                    count++;
                }
                input = scan.next();
                break;

            case "3":
                System.out.println("=== "+ daftarJenis[2] +" ===");
                for (String daftar : daftarBarang[2]){
                    System.out.println("(" + count + ")" + " " + daftar);
                    count++;
                }
                input = scan.next();
                break;

            default:
                return;
        }
        namaBarang = daftarBarang[Integer.parseInt(n) - 1][Integer.parseInt(input) - 1];
        hargaSatuan = hargaBarang[Integer.parseInt(n) - 1][Integer.parseInt(input) - 1];
        System.out.println("Masukkan jumlah barang yang diinginkan");
        jumlahBarang = scan.nextInt();
        hargaTotal = hargaSatuan * jumlahBarang;
    }

    private void identitasmenu(){
        System.out.println("Masukkan nama Anda :");
        namaPemesan = scan.next();
        System.out.println("Masukkan alamat Anda :");
        alamatPemesan = scan.next();
        System.out.println("Masukkan nomor HP Anda :");
        noHPPemesan = scan.next();
    }

    private void printinformasi(){
        System.out.println("Nama\t: " + namaPemesan);
        System.out.println("Alamat\t: " + alamatPemesan);
        System.out.println("No HP\t: " + noHPPemesan);
        System.out.println("Barang Dipesan\t: " + namaBarang);
        System.out.println("Harga Total\t: " + hargaTotal);
        System.out.println("Kode Pembayaran\t: "+ kodePembayaran);
    }

    private void generateKode(){
        kodePembayaran = namaBarang.charAt(0) + "-" + noHPPemesan + "-" + namaPemesan.charAt(0);
    }
}
