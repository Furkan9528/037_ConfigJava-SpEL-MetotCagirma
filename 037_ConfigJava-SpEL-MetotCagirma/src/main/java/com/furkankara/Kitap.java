package com.furkankara;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("kitapBean")
public class Kitap {
	
	@Value("Savas ve Baris")
	private String eserAdi;
	
	@Value("123454567")
	private long eserISBN;
	
	
	public String getEserAdi() {
		return eserAdi;
	}
	public void setEserAdi(String eserAdi) {
		this.eserAdi = eserAdi;
	}
	public long getEserISBN() {
		return eserISBN;
	}
	public void setEserISBN(long eserISBN) {
		this.eserISBN = eserISBN;
	}
	
	public String kitapBilgisiniYaz(String yazarAdi,String yazarSoyadi,String eserAdi, Long eserISBN ) {
		
		this.eserAdi= eserAdi;
		this.eserISBN = eserISBN;
		
		return 	"\n\t YAZAR :" + yazarAdi + yazarSoyadi +
				"\n\t KITAP :"  + getEserAdi() + 
				"\n\t ISBN : "   + getEserISBN();
	
	}
	


	
	
}
