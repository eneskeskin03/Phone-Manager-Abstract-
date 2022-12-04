/**
 * @author ENES
 * 14 Kas 2022
 * HuaweiPhoneManager.java
 * Abstract
 * @version 0.0.0.2
 */

public class HuaweiPhoneManager extends BasePhoneManager {
	
	public HuaweiPhoneManager() {
		
		this.setGenelMerkez("Shenzhen, Cin");
		this.setUretici("Huawei Technologies Co. Ltd.");
		this.setKurucusu("Ren Zhengfei");
		this.setKurulusTarihi(" 15 Eylul 1987, Shenzhen, Cin");
		
		System.out.println("\nUretici Firma: " +this.getUretici() +"\n \nGenel Merkez: " +this.getGenelMerkez() +
				"\n \nKurulus Tarihi: " +this.getKurulusTarihi() +"\n \nKurucusu: " +this.getKurucusu());

		System.out.println("\n----> Hangi Model Telefonu Almak Istiyorsunuz? <----");
		System.out.println("-> Huawei P40 Pro icin 1'i ");
		System.out.println("-> Huawei P50 Pro icin 2'yi ");
		System.out.println("-> Huawei Mate Xs  Pro icin 3'u secebilirsiniz "); 
	
	}
	double iskonto = 0.75;
	
@Override	
	public void phone1() {
		this.setPhone1(22720);
		System.out.println("Huawei P40 Pro icin Fiyat Hesaplamasi Yapiliyor... ");
		System.out.println("Huawei P40 Pro Fiyati: " + this.phone1 + "TL \nIndirimli Fiyati: " + (this.phone1*iskonto) + "TL'dir");
	
	}
@Override	
	public void phone2() {
		this.setPhone2(24310);
		System.out.println("Huawei P50 Pro icin Fiyat Hesaplamasi Yapiliyor... ");
		System.out.println("Huawei P50 Pro Fiyati: " + this.phone2 + "TL \nIndirimli Fiyati: " + (this.phone2*iskonto) + "TL'dir");
	
	}
@Override	
	public void phone3() {
		this.setPhone3(33690);
		System.out.println("Huawei Mate Xs icin Fiyat Hesaplamasi Yapiliyor... ");
		System.out.println("Huawei Mate Xs  Fiyati: " + this.phone3 + "TL \nIndirimli Fiyati: " + (this.phone3*iskonto) + "TL'dir");
	
	}	
}
