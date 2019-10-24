package ets_pbo;

import java.util.Scanner;

public class MenuUtama {
	private static Scanner scanner;

	public static void main(String[]args) {
		System.out.println("Selamat datang di I-Kios");
		while (true) {
			System.out.println("Silahkan pilih layanan (0 untuk keluar)");
			System.out.println("1) i-pulsa		2)i-tiket & hotel		3)Payment point");
			System.out.println("4) Voucher token	5)Indomaret delivery		6)Cicilan tanpa kartu kredit");
			System.out.println("7) Kartu member indomaret");
			scanner = new Scanner(System.in);
			int pilihan = scanner.nextInt();
			if (pilihan == 0) {
				System.out.println("Terimakasih, semoga harimu menyenangkan");
				break;
			}else {
				switch (pilihan) {
				case 1:
				{
					IPulsa aIPulsa = new IPulsa();
					aIPulsa.fitur1();
					aIPulsa.resi();
				}
					break;
				case 2:
				{
					
				}
					break;
				case 3:
				{
					IndomaretDelivery iDelivery = new IndomaretDelivery();
					iDelivery.menu();
				}
					break;
				case 4:
				{
					
				}
					break;
				case 5:
				{
					
				}
					break;
				case 6:
				{
					
				}
					break;
				default:
					break;
				}
			}
		}
	}
}
