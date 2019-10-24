package ets_pbo;

import java.util.Random;
import java.util.Scanner;

public class IPulsa {
	private String nomorTelp;
	private String vouchernyaString;
	private String voucherString;
	private int layanan;
	private Scanner scanner;
	private Random random;
	
	public IPulsa() {
		this.scanner = new Scanner(System.in);
		this.random = new Random();
	}
	
	public void fitur1() {
		System.out.println();
		System.out.println("Masukkan no telp: ");
		nomorTelp = scanner.nextLine();
		System.out.println("Pilih layanan: ");
		System.out.println("1) Pulsa Reguler    2) Paket Data");
		layanan = scanner.nextInt();
		
		switch (layanan) {
		case 1:
		{
			System.out.println("Pilih voucher pulsa yang tersedia: ");
			System.out.println("1) Indosat 10000    2) Indosat 15000");
			System.out.println("3) Telkomsel 10000  4) Telkomsel 15000");
			int pilihan = scanner.nextInt();
			switch (pilihan) {
			case 1:
				vouchernyaString = "Indosat 10000";
				break;
			case 2:
				vouchernyaString = "Indosat 15000";
				break;
			case 3:
				vouchernyaString = "Telkomsel 10000";
				break;
			case 4:
				vouchernyaString = "Telkomsel 15000";
				break;
			default:
				break;
			}
		}
			break;
		case 2:
		{
			System.out.println("Pilih voucher paket data yang tersedia: ");
			System.out.println("1) Indosat 1GB(Unlimited apps)    2) Indosat 2GB(Unlimited apps)");
			System.out.println("3) Telkomsel 1GB(Unlimited apps, youtube)  4) Telkomsel 15000 2GB(Unlimited apps,youtube, spotify)");
			int pilihan = scanner.nextInt();
			switch (pilihan) {
			case 1:
				voucherString = "Indosat 1GB(Unlimited apps)";
				break;
			case 2:
				voucherString = "Indosat 2GB(Unlimited apps)";
				break;
			case 3:
				voucherString = "Telkomsel 1GB(Unlimited apps, youtube)";
				break;
			case 4:
				vouchernyaString = "Telkomsel 15000 2GB(Unlimited apps,youtube, spotify)";
				break;
			default:
				break;
			}
		}
			break;
		default:
			break;
		}
	}
	
	void resi() {
		System.out.println("Konfirmasi, apakah anda yakin dengan pembelian ini?(y/n)");
		Scanner scanners = new Scanner(System.in);
		
		String a = scanners.nextLine();
		
		switch (a) {
		case "y":
			System.out.println("Terimakasih, berikut resi anda");
			System.out.println("Nomor Telp: " + nomorTelp);
			if (voucherString != null) {
				System.out.println("Produk: " + voucherString);
			}else {
				System.out.println("Produk: " + vouchernyaString);
			}
			int b = random.nextInt();
			System.out.println("Nomor transaksi: " + ((b < 0) ? b * (-1) : b ));
			System.out.println("Silahkan bawa ke kasir");
			System.out.println();
			System.out.println();
			break;
		case "n":
			break;
		default:
			break;
		}
		
	}
}
