package ets_pbo;

import java.util.Scanner;

public class ITiketdanHotel {
	private Scanner scan;
	
	public ITiketdanHotel() {
		this.scan = new Scanner(System.in);
	}
	
	void pilih() {
		System.out.println("Silahkan pilih layanan: ");
		System.out.println("1)Kereta Api	2)Hotel		3)Pesawat");
		System.out.println("4)Tiket box");
		int pilihan = scan.nextInt();
		switch (pilihan) {
		case 1:
			
			break;
		case 2:
			
			break;
		case 3:
	
			break;
		case 4:
	
			break;
		default:
			break;
		}
	}
}
