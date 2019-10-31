package ets_pbo;

import java.util.Scanner;

public class MenuUtama {
	private static Scanner scanner;

	public static void main(String[]args) {
		System.out.println("Selamat datang di I-Kios");
		while (true) {
			System.out.println("Silahkan pilih layanan (0 untuk keluar)");
			System.out.println("1) i-pulsa		2)i-tiket & hotel		3)Payment point");
			System.out.println("4)Indomaret delivery	5)Tiket Konser");
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
					ITiketdanHotel it = new ITiketdanHotel();
					it.pilih();
				}
					break;
				case 3:
				{
					PaymentPoint paymentPoint = new PaymentPoint();
					paymentPoint.menu();
				}
				break;
				case 4:
				{
					IndomaretDelivery iDelivery = new IndomaretDelivery();
					iDelivery.menu();
				}
				break;
				case 5:
				{
					TiketKonser tiket = new TiketKonser();
					tiket.menu();
				}
				break;
				default:
					break;
				}
			}
		}
	}
}
