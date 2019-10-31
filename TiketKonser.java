package ets_pbo;

import java.util.Random;
import java.util.Scanner;

public class TiketKonser {
    private String namaPemesan;
    private String alamatPemesan;
    private String noHPPemesan;
    private String namaTiket;
    private int hargaSatuan;
    private int jumlahTiket;
    private int hargaTotal;
    private String kodePembayaran;
    
    private String daftarTiket[] = {"Konser A", "Konser B"};
    private String daftarKelas[][] = {{"Konser A - VIP", "Konser A - Tribun"}, {"Konser B - VVIP", "Konser B - VIP", "Konser B - Bisnis"}};
    private int hargaTiket[][] = {{250000, 100000}, {500000, 200000, 100000}};
    private Scanner scan;
    
    public TiketKonser() {
        this.scan = new Scanner(System.in);
    }
    public void menu(){
        System.out.println("=== Pembelian Tiket Konser ===");
        System.out.println("Masukkan pilihan yang Anda inginkan.");
        int count = 1;
        for (String daftar : daftarTiket){
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
                System.out.println("=== "+ daftarTiket[0] +" ===");
                for (String daftar : daftarKelas[0]){
                    System.out.println("(" + count + ")" + " " + daftar);
                    count++;
                }
                input = scan.next();
                break;
        
            case "2":
                System.out.println("=== "+ daftarTiket[1] +" ===");
                for (String daftar : daftarKelas[1]){
                    System.out.println("(" + count + ")" + " " + daftar);
                    count++;
                }
                input = scan.next();
                break;

            default:
                return;
        }
        namaTiket = daftarKelas[Integer.parseInt(n) - 1][Integer.parseInt(input) - 1];
        hargaSatuan = hargaTiket[Integer.parseInt(n) - 1][Integer.parseInt(input) - 1];
        System.out.println("Masukkan jumlah tiket yang ingin dipesan");
        jumlahTiket = scan.nextInt();
        hargaTotal = hargaSatuan * jumlahTiket;
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
        System.out.println("Tiket Dipesan\t: " + namaTiket);
        System.out.println("Harga Total\t: " + hargaTotal);
        System.out.println("Kode Pembayaran\t: "+ kodePembayaran);
    }

    private void generateKode(){
        kodePembayaran = namaTiket.charAt(0) + "-" + noHPPemesan + "-" + namaPemesan.charAt(0);
    }
}