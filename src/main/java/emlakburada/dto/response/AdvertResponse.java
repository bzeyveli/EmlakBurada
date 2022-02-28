package emlakburada.dto.response;

import java.math.BigDecimal;
import java.util.Date;

import emlakburada.model.RealEstate;
import emlakburada.model.User;
import lombok.Data;

public class AdvertResponse {

	private int advertNo;
	private RealEstate gayrimenkul;
	private String baslik;
	private User kullanici; // hem bireysel & kurumsal
	private String[] resimList = new String[5];
	private BigDecimal fiyat;
	private int suresi;
	private boolean oneCikarilsinMi = false;
	private boolean incelendiMi = false;
	private Date olusturulmaTarihi;
	private boolean aktifMi;
	
	public AdvertResponse(int advertNo, RealEstate gayrimenkul, String baslik, User kullanici, String[] resimList,
			BigDecimal fiyat, int suresi, boolean oneCikarilsinMi, boolean incelendiMi, Date olusturulmaTarihi,
			boolean aktifMi) {
		super();
		this.advertNo = advertNo;
		this.gayrimenkul = gayrimenkul;
		this.baslik = baslik;
		this.kullanici = kullanici;
		this.resimList = resimList;
		this.fiyat = fiyat;
		this.suresi = suresi;
		this.oneCikarilsinMi = oneCikarilsinMi;
		this.incelendiMi = incelendiMi;
		this.olusturulmaTarihi = olusturulmaTarihi;
		this.aktifMi = aktifMi;
	}

	public AdvertResponse() {
	}

	public int getAdvertNo() {
		return advertNo;
	}

	public void setAdvertNo(int advertNo) {
		this.advertNo = advertNo;
	}

	public RealEstate getGayrimenkul() {
		return gayrimenkul;
	}

	public void setGayrimenkul(RealEstate gayrimenkul) {
		this.gayrimenkul = gayrimenkul;
	}

	public String getBaslik() {
		return baslik;
	}

	public void setBaslik(String baslik) {
		this.baslik = baslik;
	}

	public User getKullanici() {
		return kullanici;
	}

	public void setKullanici(User kullanici) {
		this.kullanici = kullanici;
	}

	public String[] getResimList() {
		return resimList;
	}

	public void setResimList(String[] resimList) {
		this.resimList = resimList;
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

	public Date getOlusturulmaTarihi() {
		return olusturulmaTarihi;
	}

	public void setOlusturulmaTarihi(Date olusturulmaTarihi) {
		this.olusturulmaTarihi = olusturulmaTarihi;
	}

	public boolean isAktifMi() {
		return aktifMi;
	}

	public void setAktifMi(boolean aktifMi) {
		this.aktifMi = aktifMi;
	}
}
