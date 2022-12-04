/**
 * @author ENES
 * 14 Kas 2022
 * SamsungPhoneManager.java
 * Abstract
 * @version 0.0.0.2
 */

public class SamsungPhoneManager extends BasePhoneManager {
	
	public SamsungPhoneManager() {
		this.setGenelMerkez("Suwon, Guney Kore");
		this.setUretici("Samsung Electric Industries");
		this.setKurucusu("Lee Byung-chul");
		this.setKurulusTarihi("1969 (Samsung Electric Industries) 1988 (Samsung Electronics)");
		
		System.out.println("\nUretici Firma: " +this.getUretici() +"\n \nGenel Merkez: " +this.getGenelMerkez() +
				"\n \nKurulus Tarihi: " +this.getKurulusTarihi() +"\n \nKurucusu: " +this.getKurucusu());

		System.out.println("\n----> Hangi Model Telefonu Almak Istiyorsunuz? <----");
		System.out.println("-> Samsung Galaxy S20 icin 1'i ");
		System.out.println("-> Samsung Galaxy S21 icin 2'yi ");
		System.out.println("-> Samsung Galaxy S22 icin 3'u secebilirsiniz ");
	
	}
	
	int iskonto = (-250);
	
@Override
	public  void phone1() {		
		this.setPhone1(14750);
		System.out.println("Samsung Galaxy S20 icin Fiyat Hesaplamasi Yapiliyor... ");			
		System.out.println("Samsung Galaxy S20 Fiyati: " + (this.phone1)  + "TL \nIndirimli Fiyati: " + (this.phone1+iskonto) + "TL'dir");
	
	}
@Override
	public void phone2() {
		this.setPhone2(16350);
		System.out.println("Samsung Galaxy S21 icin Fiyat Hesaplamasi Yapiliyor... ");
	    System.out.println("Samsung Galaxy S21 Fiyati: " + (this.phone2) + "TL \nIndirimli Fiyati: " + (this.phone2+iskonto) + "TL'dir");
	
	}
@Override		
	public void phone3() {
		this.setPhone3(18499);
		System.out.println("Samsung Galaxy S22 icin Fiyat Hesaplamasi Yapiliyor... ");		
		System.out.println("Samsung Galaxy S22 Fiyati: " + (this.phone3) + "TL \nIndirimli Fiyati: " + (this.phone3+iskonto) + "TL'dir");
	}
}