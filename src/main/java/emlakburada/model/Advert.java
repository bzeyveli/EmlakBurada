package emlakburada.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Advert {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private int advertNo;
	// private RealEstate gayrimenkul;
	private String baslik;
	@OneToOne
	private User creatorUser; // hem bireysel & kurumsal
	private String[] resimList = new String[5];
	private BigDecimal fiyat;
	private int suresi;
	private boolean oneCikarilsinMi = false;
	private boolean incelendiMi = false;
	private Date olusturulmaTarihi;
	private boolean aktifMi;
	
	
	public Advert() {}

	public Advert(Integer id, int advertNo, String baslik, User creatorUser, String[] resimList, BigDecimal fiyat,
			int suresi, boolean oneCikarilsinMi, boolean incelendiMi, Date olusturulmaTarihi, boolean aktifMi) {
		this.id = id;
		this.advertNo = advertNo;
		this.baslik = baslik;
		this.creatorUser = creatorUser;
		this.resimList = resimList;
		this.fiyat = fiyat;
		this.suresi = suresi;
		this.oneCikarilsinMi = oneCikarilsinMi;
		this.incelendiMi = incelendiMi;
		this.olusturulmaTarihi = olusturulmaTarihi;
		this.aktifMi = aktifMi;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getAdvertNo() {
		return advertNo;
	}

	public void setAdvertNo(int advertNo) {
		this.advertNo = advertNo;
	}

	public String getBaslik() {
		return baslik;
	}

	public void setBaslik(String baslik) {
		this.baslik = baslik;
	}

	public User getCreatorUser() {
		return creatorUser;
	}

	public void setCreatorUser(User creatorUser) {
		this.creatorUser = creatorUser;
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
