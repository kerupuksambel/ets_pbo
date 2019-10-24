package ets_pbo;

import java.util.Random;
import java.util.Scanner;

public class ITiketdanHotel {
	private Scanner scan;
	private Random rand;
	private int code;
	private int hargas, hargas1;

	public ITiketdanHotel() {
		this.scan = new Scanner(System.in);
		this.rand = new Random();
	}
	
	void pilih() {
		System.out.println("Silahkan pilih layanan: ");
		System.out.println("1)Kereta Api	2)Hotel		3)Pesawat");
		int pilihan = scan.nextInt();
		switch (pilihan) {
		case 1:
			kereta_api();
			break;
		case 2:
			hotel();
			break;
		case 3:
			pesawat();
			break;
		default:
			break;
		}
	}
	
	void hotel() {
		System.out.println();
		System.out.println("Silahkan isi menu berikut: ");
		String check_in_tgl;
		String check_out_tgl, nama_hotel;
		int jumlah_orang, jml_kamar, harga=0;
		Scanner scansScanner = new Scanner(System.in), ascansScanner = new Scanner(System.in);
		
		System.out.println("Masukkan tgl check in: ");
		check_in_tgl = scansScanner.nextLine();
		System.out.println("Masukkan tgl check out: ");
		check_out_tgl = scansScanner.nextLine();
		System.out.println("Masukkan jumlah orang: ");
		jumlah_orang = scansScanner.nextInt();
		System.out.println("Masukkan jumlah kamar: ");
		jml_kamar = scansScanner.nextInt();
		System.out.println("Masukkan nama hotel: ");
		nama_hotel = ascansScanner.nextLine();
		
		if(nama_hotel.toLowerCase().equals("hana hotel")) {
			harga = 2000000 * jml_kamar;
		}else if (nama_hotel.toLowerCase().equals("the margo hotel")) {
			harga = 2500000 * jml_kamar;
		}else if (nama_hotel.toLowerCase().equals("the edge")) {
			harga = 3000000 * jml_kamar;
		}
		
		code = 2;
		cetak_resi();
		System.out.println("Terimakasih, silahkan menuju ke kasir dengan resi ini");
		System.out.println("Check in: " + check_in_tgl);
		System.out.println("Check out: " + check_out_tgl);
		System.out.println("Jumlah orang: " + jumlah_orang);
		System.out.println("Nama hotel: " + nama_hotel);
		System.out.println("Jumlah kamar: " + jml_kamar);
		System.out.println("Total biaya: Rp." + harga);
		System.out.println("Biaya per orang: " + harga/jumlah_orang);
		System.out.println();
		System.out.println();
	}
	
	void pesawat() {
		System.out.println();
		System.out.println("Silahkan isi menu berikut: ");
		String bandara_tujuan, bandara_asal;
		int jml_dewasa, jml_bayi;
		String tgl_berangkat, pesawats = "";
		String no_telpString;
		String pesawat[] = {"Batik Air", "Garuda Indonesia", "AirAsia"};
		
		Scanner aScanner = new Scanner(System.in);
		Scanner bScanner = new Scanner(System.in);
		System.out.println("Masukkan stasiun asal: ");
		bandara_asal = aScanner.nextLine();
		System.out.println("Masukkan stasiun tujuan");
		bandara_tujuan = aScanner.nextLine();
		System.out.println("Jumlah dewasa: ");
		jml_dewasa = aScanner.nextInt();
		System.out.println("Jumlah anak-anak: ");
		jml_bayi = aScanner.nextInt();
		System.out.println("Tanggal berangkat: ");
		tgl_berangkat = bScanner.nextLine();
		System.out.println("Masukkan no Telp: ");
		no_telpString = bScanner.nextLine();

		if(bandara_asal.toLowerCase().equals("juanda") && bandara_tujuan.toLowerCase().equals("Halim Perdanakusuma")){
			if(jml_bayi == 0){
				hargas = 1500000 * jml_dewasa;
				pesawats = pesawat[rand.nextInt(2)];
			}else{
				hargas = 1500000 * jml_dewasa;
				hargas1 = 750000 * jml_bayi;
				pesawats = pesawat[rand.nextInt(2)];
			}
		}else if(bandara_asal.toLowerCase().equals("juanda") && bandara_tujuan.toLowerCase().equals("salahudin")){
			if(jml_bayi == 0){
				hargas = 1000000 * jml_dewasa;
				pesawats = pesawat[rand.nextInt(2)];
			}else{
				hargas = 1000000 * jml_dewasa;
				hargas1 = 500000 * jml_bayi;
				pesawats = pesawat[rand.nextInt(2)];
			}
			
		}else if(bandara_asal.toLowerCase().equals("juanda") && bandara_tujuan.toLowerCase().equals("ngurah rai")){
			if(jml_bayi == 0){
				hargas = 500000 * jml_dewasa;
				pesawats = pesawat[rand.nextInt(2)];
			}else{
				hargas = 500000 * jml_dewasa;
				hargas1 = 250000 * jml_bayi;
				pesawats = pesawat[rand.nextInt(2)];
			}
		}
		code = 3;
		cetak_resi();
		System.out.println("Terimakasih, silahkan menuju ke kasir dengan resi ini");
		System.out.println("Bandara asal: " + bandara_asal);
		System.out.println("Bandara tujuan: " + bandara_tujuan);
		System.out.println("Tanggal berangkat: " + tgl_berangkat);
		System.out.println("Jumlah dewasa: " + jml_dewasa);
		System.out.println("Jumlah anak-anak: " + jml_bayi);
		System.out.println("Kereta: " + pesawats);
		System.out.println("No Telp: " + no_telpString);
		System.out.println("Total biaya: Rp." + (hargas + hargas1));
		System.out.println();
		System.out.println();
	}

	void kereta_api(){
		System.out.println();
		System.out.println("Silahkan isi menu berikut: ");
		String stasiun_tujuan, stasiun_asal;
		int jml_dewasa, jml_bayi;
		String no_telpString;
		String tgl_berangkat, keretas = "";
		String kereta[] = {"KA Dhoho", "KA Penataran"};
		
		Scanner aScanner = new Scanner(System.in);
		Scanner bScanner = new Scanner(System.in);
		System.out.println("Masukkan stasiun asal: ");
		stasiun_asal = aScanner.nextLine();
		System.out.println("Masukkan stasiun tujuan");
		stasiun_tujuan = aScanner.nextLine();
		System.out.println("Jumlah dewasa: ");
		jml_dewasa = aScanner.nextInt();
		System.out.println("Jumlah anak-anak: ");
		jml_bayi = aScanner.nextInt();
		System.out.println("Tanggal berangkat: ");
		tgl_berangkat = bScanner.nextLine();
		System.out.println("Masukkan no Telp: ");
		no_telpString = bScanner.nextLine();

		if(stasiun_asal.toLowerCase().equals("blitar") && stasiun_tujuan.toLowerCase().equals("gubeng")){
			if(jml_bayi == 0){
				hargas = 15000 * jml_dewasa;
				keretas = kereta[rand.nextInt(1)];
			}else{
				hargas = 15000 * jml_dewasa;
				hargas1 = 7500 * jml_bayi;
				keretas = kereta[rand.nextInt(1)];
			}
		}else if(stasiun_asal.toLowerCase().equals("wlingi") && stasiun_tujuan.toLowerCase().equals("wonokromo")){
			if(jml_bayi == 0){
				hargas = 12000 * jml_dewasa;
				keretas = kereta[rand.nextInt(1)];
			}else{
				hargas = 12000 * jml_dewasa;
				hargas1 = 6000 * jml_bayi;
				keretas = kereta[rand.nextInt(1)];
			}
			
		}else if(stasiun_asal.toLowerCase().equals("tulungagung") && stasiun_tujuan.toLowerCase().equals("gubeng")){
			if(jml_bayi == 0){
				hargas = 18000 * jml_dewasa;
				keretas = kereta[rand.nextInt(1)];
			}else{
				hargas = 18000 * jml_dewasa;
				hargas1 = 9000 * jml_bayi;
				keretas = kereta[rand.nextInt(1)];
			}
		}
		code = 1;
		cetak_resi();
		System.out.println("Terimakasih, silahkan menuju ke kasir dengan resi ini");
		System.out.println("Stasiun asal: " + stasiun_asal);
		System.out.println("Stasiun tujuan: " + stasiun_tujuan);
		System.out.println("Tanggal berangkat: " + tgl_berangkat);
		System.out.println("Jumlah dewasa: " + jml_dewasa);
		System.out.println("Jumlah bayi: " + jml_bayi);
		System.out.println("Kereta: " + keretas);
		System.out.println("No Telp: " + no_telpString);
		System.out.println("Total biaya: Rp." + (hargas + hargas1));
		System.out.println();
		System.out.println();
	}

	void cetak_resi(){
		switch(code){
			case 1:
			{
				System.out.println("Konfirmasi, apakah anda yakin dengan pembelian ini?(y/n)");
				Scanner scanners = new Scanner(System.in);
			
				String a = scanners.nextLine();
			
				switch (a) {
				case "y":
				{
					System.out.println("Terimakasih, berikut resi anda");
					System.out.println("Produk: Tiket kerate");
					int b = rand.nextInt();
					System.out.println("Nomor transaksi: " + ((b < 0) ? b * (-1) : b ));
					System.out.println("Silahkan bawa ke kasir");
				}
					break;
				case "n":
					break;
				default:
					break;
				}
			}
				break;
			case 2:
			{
				System.out.println("Konfirmasi, apakah anda yakin dengan pembelian ini?(y/n)");
				Scanner scanners = new Scanner(System.in);
			
				String a = scanners.nextLine();
			
				switch (a) {
				case "y":
				{
					System.out.println("Terimakasih, berikut resi anda");
					System.out.println("Produk: Tiket kerate");
					int b = rand.nextInt();
					System.out.println("Nomor transaksi: " + ((b < 0) ? b * (-1) : b ));
					System.out.println("Silahkan bawa ke kasir");
				}
					break;
				case "n":
					break;
				default:
					break;
				}
			}
				break;
			case 3:
				break;
		}
	}
}