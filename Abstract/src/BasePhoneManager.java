/**
 * @author ENES
 * 14 Kas 2022
 * BasePhoneManager.java
 * Abstract
 * @version 0.0.0.2
 */


public  abstract class BasePhoneManager {

	 private String genelMerkez;
	 private String uretici;
	 private String kurucusu;
	 private String kurulusTarihi; 
	 
	 protected int phone1;
	 protected int phone2;
	 protected int phone3;


	public int getPhone1() {
		return phone1;
	}
	public void setPhone1(int phone1) {
		this.phone1 = phone1;
	}

	
	public int getPhone2() {
		return phone2;
	}
	public void setPhone2(int phone2) {
		this.phone2 = phone2;
	}


	public int getPhone3() {
		return phone3;
	}
	public void setPhone3(int phone3) {
		this.phone3 = phone3;
	}


	public String getGenelMerkez() {
		return genelMerkez;
	}
	public void setGenelMerkez(String genelMerkez) {
		this.genelMerkez = genelMerkez;
	}


	public String getUretici() {
		return uretici;
	}
	public void setUretici(String uretici) {
		this.uretici = uretici;
	}


	public String getKurucusu() {
		return kurucusu;
	}
	public void setKurucusu(String kurucusu) {
		this.kurucusu = kurucusu;
	}


	public String getKurulusTarihi() {
		return kurulusTarihi;
	}
	public void setKurulusTarihi(String kurulusTarihi) {
		this.kurulusTarihi = kurulusTarihi;
	}

	/**
	 * abstract method
	 */
	protected abstract void phone1();

	/**
	 * abstract method
	 */
	protected abstract void phone2();

	/**
	 * abstract method
	 */
	protected abstract void phone3();
}
