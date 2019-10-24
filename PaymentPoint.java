package ets_pbo;

import java.util.Scanner;
import java.util.Random;

public class PaymentPoint {
    private String namaLayanan;
    private String nomorHP;
    private String nomorPelayanan;
    private Scanner scan;
    private Random rand;

    private String layanan[] = {"Bukalapak", "Tokopedia", "Lazada", "Shopee"};

    public PaymentPoint() {
        this.scan = new Scanner(System.in);
        this.rand = new Random();
    }

    public void menu(){
        System.out.println("=== Indomaret Payment Point ===");
        System.out.println("Masukkan pilihan yang Anda inginkan.");
        int count = 1;
        for (String daftar : layanan){
            System.out.println("(" + count + ")" + " " + daftar);
            count++;
        }
        System.out.println("(0) Keluar");
        int input;
        input = scan.nextInt();
        submenu(input);
        printInformasi();
    }

    private void submenu(int n){
        switch (n) {
            case 1:
                namaLayanan = layanan[0];
                break;
            case 2:
                namaLayanan = layanan[1];
                break;

            case 3:
                namaLayanan = layanan[2];
                break;
            
            case 4:
                namaLayanan = layanan[3];
                break;
            
            default:
                return;
        }

        n--;
        namaLayanan = layanan[n];
        System.out.println("=== Payment Point : "+ namaLayanan +" ===");
        System.out.println("Masukkan nomor HP Anda : ");
        nomorHP = scan.next();
        System.out.println("Masukkan nomor pembayaran dari "+ namaLayanan +" : ");
        nomorPelayanan = scan.next();
    }

    private void printInformasi(){
        System.out.println("=== Invoice ===");
        System.out.println("Nomor HP : " + nomorHP);
        System.out.println("Nomor Pembayaran : " + nomorPelayanan);
        System.out.println("Kode Pembayaran : " + generateKode());
    }

    private String generateKode(){
        return rand.nextInt(99) + "-" + namaLayanan.charAt(0) + "-" + nomorPelayanan;   
    }
}
