/**
 * @author ENES
 * 14 Kas 2022
 * ApplePhoneManager.java
 * Abstract
 * @version 0.0.0.2
 */

public class ApplePhoneManager extends BasePhoneManager {
	
	public ApplePhoneManager() {
		 
		this.setGenelMerkez("Cupertino, Kaliforniya, ABD");
		this.setUretici("Apple Inc.");
		this.setKurucusu("Steve Jobs, Steve Wozniak, Ronald Wayne");
		this.setKurulusTarihi("1 Nisan 1976, Los Altos, Kaliforniya, ABD");
		
		System.out.println("\nUretici Firma: " +this.getUretici() +"\n \nGenel Merkez: " +this.getGenelMerkez() +
				"\n \nKurulus Tarihi: " +this.getKurulusTarihi() +"\n \nKurucusu: " +this.getKurucusu());
		
		System.out.println("\n----> Hangi Model Telefonu Almak Istiyorsunuz? <----");
		System.out.println("-> Apple Iphone 11 Pro icin 1'i ");
		System.out.println("-> Apple Iphone 13 Pro icin 2'yi ");
		System.out.println("-> Apple Iphone 14 Pro icin 3'u secebilirsiniz ");
	
	}
	double zam = 1.20;	
@Override
	public void phone1() {
		this.setPhone1(18750);
		System.out.println("Apple Iphone 11 Pro icin Fiyat Hesaplamasi Yapiliyor... ");
		System.out.println("Apple Iphone 11 Pro Fiyati: " + this.phone1 + "TL \nZamli Fiyati: " + (this.phone1*zam) + "TL'dir");
	
	}
@Override
	public void phone2() {
		this.setPhone2(23600);
		System.out.println("Apple Iphone 12 Pro icin Fiyat Hesaplamasi Yapiliyor... ");
		System.out.println("Apple Iphone 12 Pro Fiyati: " + this.phone2 + "TL \nZamli Fiyati: " + (this.phone2*zam) + "TL'dir");
	
	}
@Override
	public void phone3() {
		this.setPhone3(41150);
		System.out.println("Apple Iphone 13 Pro icin Fiyat Hesaplamasi Yapiliyor... ");
		System.out.println("Apple Iphone 13 Pro Fiyati: " + this.phone3 + "TL \nZamli Fiyati: " + (this.phone3*zam) + "TL'dir");
	
	}
}
