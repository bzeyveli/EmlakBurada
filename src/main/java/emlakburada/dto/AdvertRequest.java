package emlakburada.dto;

import java.math.BigDecimal;

public class AdvertRequest {

	private String baslik;
	private BigDecimal fiyat;
	private int suresi;
	private boolean oneCikarilsinMi = false;
	private boolean incelendiMi = false;
	private boolean aktifMi;
	private Integer userId;
	
	
	public AdvertRequest(String baslik, BigDecimal fiyat, int suresi, boolean oneCikarilsinMi, boolean incelendiMi,
			boolean aktifMi, Integer userId) {
		super();
		this.baslik = baslik;
		this.fiyat = fiyat;
		this.suresi = suresi;
		this.oneCikarilsinMi = oneCikarilsinMi;
		this.incelendiMi = incelendiMi;
		this.aktifMi = aktifMi;
		this.userId = userId;
	}
	
	public AdvertRequest() {}
	
	public String getBaslik() {
		return baslik;
	}
	public void setBaslik(String baslik) {
		this.baslik = baslik;
	}
	public BigDecimal getFiyat() {
		return fiyat;
	}
	public void setFiyat(BigDecimal fiyat) {
		this.fiyat = fiyat;
	}
	public int getSuresi() {
		return suresi;
	}
	public void setSuresi(int suresi) {
		this.suresi = suresi;
	}
	public boolean isOneCikarilsinMi() {
		return oneCikarilsinMi;
	}
	public void setOneCikarilsinMi(boolean oneCikarilsinMi) {
		this.oneCikarilsinMi = oneCikarilsinMi;
	}
	public boolean isIncelendiMi() {
		return incelendiMi;
	}
	public void setIncelendiMi(boolean incelendiMi) {
		this.incelendiMi = incelendiMi;
	}
	public boolean isAktifMi() {
		return aktifMi;
	}
	public void setAktifMi(boolean aktifMi) {
		this.aktifMi = aktifMi;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
}
